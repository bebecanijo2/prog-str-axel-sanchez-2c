public class ShippingCalculator {
    public ShippingCalculator(){}

    private final double IVA = 0.16;
    private final double ESTANDAR = 50;
    private final double EXPRESS = 90;
    private double pesoKg;
    private int distanciaKm;
    private int tipoServicio;
    private boolean esZonaRemota;
    private double subtotal;

    public double calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota){
        double subtotal=0;
        if (tipoServicio==1){
            subtotal+=ESTANDAR;
        }else if (tipoServicio==2){
            subtotal+=EXPRESS;
        }
        subtotal = subtotal + (pesoKg*12);
        
        if (distanciaKm<=50){
            subtotal = subtotal + 20;
        } else if (distanciaKm > 50 && distanciaKm <= 200) {
            subtotal = subtotal +60;
        }else {
            subtotal = subtotal +120;
        }
        if (zonaRemota == true){
            subtotal = subtotal *1.10;
        }

        return subtotal;
    }

    public double calcularIVA(double subtotal){
        return subtotal*IVA;
    }

    public double calcularTotal(double subtotal, double iva){
        return subtotal+calcularIVA(subtotal);
    }







    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public boolean isEsZonaRemota() {
        return esZonaRemota;
    }

    public void setEsZonaRemota(boolean esZonaRemota) {
        this.esZonaRemota = esZonaRemota;
    }
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}







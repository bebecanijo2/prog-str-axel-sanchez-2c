public class ShippingCalculator {

    public ShippingCalculator(){

    }

    private final double IVA = 16%;
    private final double ESTANDAR = 50;
    private final double EXPRESS = 90;
    private final double PRECIO_PESO = 12;
    public double pesoKG;
    public double precio;
    public int distanciaKm;

    public void process(int distanciaKm){
        calcularPrecioPorDistancia(distanciaKm);


    }

    private void double calcularPrecioPorDistancia(int distanciaKm){

        if (distanciaKm<=50){
            precio=ESTANDAR+20;
        } else if (distanciaKm>50 && distanciaKm<=200) {
            precio=ESTANDAR+60;
        } else if (distanciaKm>200) {
            precio=ESTANDAR+120;
        }
    }
    private void double calcularPrecioPorPeso(){

    }

}

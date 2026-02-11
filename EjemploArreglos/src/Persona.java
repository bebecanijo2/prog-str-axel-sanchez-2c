public class Persona {

    public Persona() {
    }

    private int id;
    private String name;
    private boolean isActive;

    public Persona(String name, int id) {
        this.name = name;
        this.id = id;
        this.isActive=true;
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

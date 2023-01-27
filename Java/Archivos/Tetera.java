public class Tetera extends Objetos {
    private int capacidad;
    private String material;
    private String color;

    public Tetera() {
        super();
        this.capacidad = 1;
        this.material = "Porcelana";
        this.color = "Blanco";
    }

    public Tetera( String nombre, String tipo, int capacidad, String material, String color ) {
        super(nombre, tipo);
        this.capacidad = capacidad;
        this.material = material;
        this.color = color;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad( int capacidad ) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial( String material ) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor( String color ) {
        this.color = color;
    }
}

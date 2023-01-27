public class Tasa extends Objetos {
    private String material;
    private String size;

    public Tasa() {
        super();
        this.material = "Porcelana";
        this.size = "Mediano";
    }

    public Tasa( String nombre, String tipo, String material, String size ) {
        super(nombre, tipo);
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial( String material ) {
        this.material = material;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize( String size ) {
        this.size = size;
    }
}

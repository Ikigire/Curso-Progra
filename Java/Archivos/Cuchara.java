public class Cuchara extends Objetos {
    private String material;
    private float medida;

    public Cuchara() {
        super();
        material = "Indefinido";
        medida = 0f;
    }

    public Cuchara( String nombre, String tipo, String material, float medida ) {
        super(nombre, tipo);
        this.material = material;
        this.medida = medida;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial( String material ) {
        this.material = material;
    }

    public float getMedida() {
        return this.medida;
    }

    public void setMedida( float medida ) {
        this.medida = medida;
    }
}
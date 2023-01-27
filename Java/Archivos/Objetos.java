/* Documentación
 * @author Yael Alejandro
 * @Description  
 * 
 */
public abstract class Objetos {
    private String nombre;
    private String tipo;

    public Objetos(String n, String tipo){
        this.nombre = n;
        this.tipo = tipo;
    }

    public Objetos(){
        this.nombre = "Objeto";
        this.tipo = "Desconocido";
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo( String t ){
        this.tipo = t;
    }
}
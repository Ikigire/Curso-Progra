import java.util.ArrayList;

public class AdminObjetos {
    
    private Objetos lista[];
    private int contador;

    private ArrayList<Objetos> lista2;

    public AdminObjetos( Objetos l[], ArrayList<Objetos> lista2 ) {
        this.lista = l;
        this.contador = l.length;
        this.lista2 = lista2;
    }

    public AdminObjetos() {
        this.lista = new Objetos [0];
        this.contador = 0;
        this.lista2 = new ArrayList<Objetos>();
    }

    /*
     * Método para agrgar elementos dentro de las listas
     */
    public boolean agregar(){
        try{
            this.lista2.add(new Objetos());
            
            this.lista[0] = new Objetos();
        }
        catch( Exception e ){
            return false;
        }finally{
            System.out.println("\tElementos de la lista: " + 
                                lista.length + 
                                "\n\tElementos de la lista2: " + 
                                lista2.size());
        }
        return true;
    }

    /*
     * Método para agrgar elementos dentro de las listas
     */
    public boolean agregar( String nombre, String tipo ) {
        try{
            //this.lista2.add(new Objetos("ArrayList: " + nombre, tipo));
            // Opción del ciclo For
            // for ( int i=0; i<lista.length; i++ ) {
            //     if ( lista[i] == null ) {
            //         this.lista[i] = new Objetos("Arreglo: " + nombre, tipo);
            //         break;
            //     }
            // }
            
            if ( this.contador >= this.lista.length ) {
                //Incrementar la capacidad del arreglo
                Objetos remplazo[] = new Objetos [this.contador+1];
                for ( int i = 0; i<lista.length; i++ ){
                    remplazo[i] = lista[i];
                }

                this.lista = null;
                this.lista = remplazo;
            }
            
            //Opción de la variable de control
            this.lista[this.contador] = new Objetos(nombre, tipo);
            this.contador++;
        }
        catch( Exception e ){
            return false;
        }finally{
            System.out.println("\tElementos de la lista: " + 
                                lista.length + 
                                "\n\tElementos de la lista2: " + 
                                lista2.size());
        }
        return true;
    }

    /*
     * Método para revisar el contenido de ambas listas
     */
    public void consultaGeneral() {
        System.out.print("\n\t\tArreglo Lista\n\n");
        System.out.printf("%-3s |%-15s |%-15s |\n", "Pos", "Nombre", "Tipo");
        try{
            for( int i = 0; i < lista.length; i++){
                //Esta es la forma directa (No se recomienda)
                // System.out.printf("|%-15s |%-15s |\n", lista[i].getNombre(), lista[i].getTipo());
                //Esta es la opción recomendada
                Objetos auxiliar = lista[i];
                System.out.printf("%3d |%-15s |%-15s |\n", i, auxiliar.getNombre(), auxiliar.getTipo());
                //Tercera opción
                // String nombre = this.lista[i].getNombre();
                // String tipo = this.lista[i].getTipo();
                // System.out.printf("%3d |%-15s |%-15s |\n", i, nombre, tipo);
            }
        } catch ( Exception e ) {
            
        }

        System.out.print("\n\t\t\"Objeto Lista2\"\n\n");
        System.out.printf("%-3s |%-15s |%-15s |\n", "Pos","Nombre", "Tipo");
        for( int i = 0; i < lista2.size(); i++){
            //Esta es la forma directa (No se recomienda)
            // System.out.printf("|%-15s |%-15s |\n", lista2.get(i).getNombre(), lista2.get(i).getTipo());
            //Esta es la opción recomendada
            // Objetos auxiliar = lista2.get(i);
            // System.out.printf("|%-15s |%-15s |\n", auxiliar.getNombre(), auxiliar.getTipo());
            //Tercera opción
            String nombre = this.lista2.get(i).getNombre();
            String tipo = this.lista2.get(i).getTipo();
            System.out.printf("%3d |%-15s |%-15s |\n", i, nombre, tipo);
        }
    }

    public int buscarPosicion( String nombre ) {
        int pos = -1;
        for (int i=0; i < lista.length; i++) {
            if (lista[i].getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                pos = i;
            }
        }
        return pos;
    }

    public Objetos buscarObjeto( String nombre ) {
        // int pos = -1;
        // Objetos objetoEncontrado = null;
        // for (int i=0; i < lista.length; i++) {
        //     if ( lista[i].getNombre().equals(nombre) ) {
        //         pos = i;
        //     }
        // }
        // if ( pos != -1 ) {
        //     objetoEncontrado = lista[pos];
        // }
        // return objetoEncontrado;

        for ( int i=0; i < lista.length; i++ ) {
            if ( lista[i].getNombre().toLowerCase().equals(nombre.toLowerCase()) ) {
                return lista[i];
            }
        }

        return null;
    }
}

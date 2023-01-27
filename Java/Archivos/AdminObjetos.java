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
            //this.lista2.add(new Objetos());
            
            //this.lista[0] = new Objetos();
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

    /**
     * Método para agregar una nueva tasa a la lista
     * @param nombre Nombre de la tasa
     * @param tipo Es el tipo de elemento
     * @param material Indica el tipo de material de construcción de la tasa
     * @param size Indicador del tamao de la tasa "Pequeña", "Mediana", "Grande"
     * @return True si se ha agregado a la lista correctamente | False en cualquier otro caso
     */
    public boolean agregar( String nombre, String tipo, String material, String size ) {
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
            this.lista[this.contador] = new Tasa(nombre, tipo, material, size);
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

    /**
     * Método para agregar cualquier tipo de objeto a la lista
     * @param objeto Objeto a ser almacenado
     * @return True en caso de guardar el objeto con éxito| False en cualquier otro caso
     */
    public boolean agregar( Objetos objeto ) {
        try {
            if ( this.contador >= this.lista.length ) {
                //Incrementar la capacidad del arreglo
                Objetos remplazo[] = new Objetos [this.contador+1];
                for ( int i = 0; i<lista.length; i++ ) {
                    remplazo[i] = lista[i];
                }

                this.lista = null;
                this.lista = remplazo;
            }

            this.lista[this.contador] = objeto;
            this.contador++;
        } catch (Exception e) {
            return false;
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

    /**
     * Método para eliminar un objeto de la lista
     * @param posicion posición del elemento que será eliminado
     * @return True si fue correcta la eliminación, False en cualquier otro caso
     */
    public boolean eliminarObjeto( int posicion ) {
        try {
            Objetos auxiliar[] = new Objetos[contador-1];
            for ( int i=0; i < contador-1; i++ ) {
                if ( i < posicion ) 
                    auxiliar[i] = lista[i];
                
                else 
                    auxiliar[i] = lista[i+1];
                
            }
            
            lista = null;
            lista = auxiliar;
            contador--;
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    /**
     * Método para eliminar un elemento de la lista por el nombre del objeto (Primera coincidencia)
     * @param nombre Nombre del objeto que será buscado (Sencible a Mayusculas y minusculas)
     * @return True en caso de eliminación exitosa, False en cualquier otro caso
     */
    public boolean eliminarObjeto( String nombre ) {
        try {
            int posicion = this.buscarPosicion(nombre);
            if ( posicion > -1 ){
                Objetos auxiliar[] = new Objetos[contador-1];
                for ( int i=0; i < contador-1; i++ ) {
                    if ( i < posicion ) 
                        auxiliar[i] = lista[i];
                    
                    else 
                        auxiliar[i] = lista[i+1];
                    
                }
                
                lista = null;
                lista = auxiliar;
                contador--;
                return true;
            } else {
                return false;
            }
        } catch(Exception e) {
            return false;
        }
    }
}

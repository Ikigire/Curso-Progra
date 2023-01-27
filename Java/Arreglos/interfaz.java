public class interfaz {
    public static void main(String[] args) {
        AdminObjetos administrador = new AdminObjetos();
        for (int i = 0; i < 6; i++) {
            String n = "Objeto No. " + i;
            String t = "Desconocido";
            if ( administrador.agregar( n, t ) ){
                System.out.printf("\nElemento %d agregado con éxito\n", i);
            } else {
                System.out.printf("\nError al agregar el elemento %d agregado con éxito\n", i);
            }
        }

        administrador.consultaGeneral();

        int posicion = administrador.buscarPosicion("Objeto No. 2");
        System.out.println("Posición del objeto: " + posicion);

        Objetos objeto = administrador.buscarObjeto("objeto No. 2");
        System.out.println("\n\n\tDatos del objeto:" +
                           "\n\t\tNombre: " + objeto.getNombre() +
                           "\n\t\tTipo: " + objeto.getTipo());

        administrador.eliminarObjeto(posicion);

        administrador.consultaGeneral();

        administrador.eliminarObjeto("objeto no. 4");

        administrador.consultaGeneral();
    }
}

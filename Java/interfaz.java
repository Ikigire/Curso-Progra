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

        System.out.println("Posición del objeto: " + administrador.buscarPosicion("Objeto No. 2"));

        Objetos objeto = administrador.buscarObjeto("Objeto No. 2");
        System.out.println("\n\n\tDatos del objeto:" +
                           "\n\t\tNombre: " + objeto.getNombre() +
                           "\n\t\tTipo: " + objeto.getTipo());
    }
}

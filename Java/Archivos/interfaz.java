public class interfaz {
    public static void main(String[] args) {
        AdminObjetos administrador = new AdminObjetos();
        for (int i = 1; i < 7; i++) {
            Objetos objetoGuardar = null;
            if (i % 2 == 0) {
                String n = "Tasa No. " + i;
                String t = "Tasa";
                String m = "Porcelana";
                String s = "Mediana";

                objetoGuardar = new Tasa( n, t, m, s );
            } else {
                if (i % 3 == 0) {
                    String n = "Cuchara No. " + i;
                    String t = "Cuchara";
                    String m = "Porcelana";
                    float med = 1.5f;

                    objetoGuardar = new Cuchara( n, t, m, med );
                } else {
                    String n = "Tetera No. " + i;
                    String t = "Tetera";
                    int c = 1;
                    String m = "Acero";
                    String color = "Plata";

                    objetoGuardar = new Tetera( n, t, c, m, color );
                }
            }

            if ( administrador.agregar( objetoGuardar ) ) {
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

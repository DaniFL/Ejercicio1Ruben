package dominio;

public class TablaFunciones {

    //crear una tabla de 10x10 con numeros aleatorios por argumentos

    public static int[][] crearTabla(int filas, int columnas) {
        int[][] tabla = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = (int) (Math.random() * 100);
            }
        }
        return tabla;
    }

// funcion que devuelva el mayor valor de la tabla
    public static int mayor(int[][] tabla) {
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > mayor) {
                    mayor = tabla[i][j];

                }
            }
        }
        return mayor;
    }
}

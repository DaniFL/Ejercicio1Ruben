package aplicacion;
import dominio.*;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(TablaFunciones.crearTabla(10, 10 )));
        System.out.println("El mayor es: " + TablaFunciones.mayor(TablaFunciones.crearTabla(10, 10 )));
    }
}

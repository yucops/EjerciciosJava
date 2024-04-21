package EjerciciosJava;

/**
 * InvertirCadena
 */
public class InvertirCadena {

    public static void main(String[] args) {

        String cadenaInvertida = invertirCadena("programación");
        System.out.println(cadenaInvertida);
    }

    public static String invertirCadena (String cadena) {

        String[] arrayCadena = cadena.split("");
        String cadInv = "";

        for (int i = arrayCadena.length-1; i >= 0; i--) {
            cadInv += arrayCadena[i];
        }
        
        return cadInv;
    }

}

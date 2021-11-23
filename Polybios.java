import java.util.Scanner;


public class Polybios {
    char[][] matriz = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, { 'h', 'i', 'j', 'k', 'l', 'm', 'n' },
            { 'ñ', 'o', 'p', 'q', 'r', 's', 't' }, { 'u', 'v', 'w', 'x', 'y', 'z', '1' },
            { '2', '3', '4', '5', '6', '7', '8' }, { '9', '0', '_', '-', ' ', '.', ',' },
            { '$', '#', '%', '&', '+', '*', '/' } };

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char[][] matris = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, { 'h', 'i', 'j', 'k', 'l', 'm', 'n' },
                { 'ñ', 'o', 'p', 'q', 'r', 's', 't' }, { 'u', 'v', 'w', 'x', 'y', 'z', '1' },
                { '2', '3', '4', '5', '6', '7', '8' }, { '9', '0', '_', '-', ' ', '.', ',' },
                { '$', '#', '%', '&', '+', '*', '/' } };

        System.out.println("\t   ---------------------");
        System.out.println("\t  | *  CIFRADO POLIBIO * |");
        System.out.println("\t   ---------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Mensaje: ");
        String mensaje = sc.nextLine();
        System.out.println("\nMatriz");
        Imprimir(matris);
        System.out.print("\nCifrado: ");
        Polybios poli = new Polybios();
        String cipher = poli.Cifrar_Polibio(mensaje);
        System.out.println(cipher);
        sc.close();
        System.out.print("\nDescifrado: ");
        String msj = poli.Descifrar_Polibio(cipher);

    }

    public static void Imprimir(char[][] matris) {
        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public String Cifrar_Polibio(String mensaje) {
        mensaje = mensaje.toLowerCase();
        String texto = "";
        // Se crea un array de el tamaño del mensaje ingresado
        String[] cipher = new String[mensaje.toCharArray().length];

        // Se convierte el mensaje en un array de char
        char[] msj = mensaje.toCharArray();

        // Va por todas las letras del mensaje
        for (int h = 0; h < msj.length; h++) {

            // Va por todas las filas y columnas de la matriz
            // Hasta encontrar el caracter
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[1].length; j++) {

                    // Si lo encuentra
                    if (matriz[i][j] == msj[h]) {

                        // Guarda en nuestro array cipher las posiciones
                        // de el caracter i para las filas y j para las columnas
                        cipher[h] = Integer.toString(i) + Integer.toString(j);

                        // sale del ciclo apenas lo encuentra
                        break;
                    }
                }
            }
            // Va imprimiendo el cipher (mensaje ya cifrado)
            // System.out.print(cipher[h] + " ");
        }

        // passamos la lista cipher a texto
        for (String item : cipher) {
            texto += item + " ";
        }
        // Retorna str
        return texto;

    }

    public String Descifrar_Polibio(String txtcipher) {
        // pasamos a minuscula el texto cifrado
        txtcipher = txtcipher.toLowerCase();
        // convertir texto cifrado a lista tipo cadena
        String[] words = txtcipher.split(" ");

        char[] direccion;
        String mensaje = "";

        // Vamos por todas las posiciones del cipher
        for (int i = 0; i < words.length; i++) {
            // Convertimos la direccion en un array de char
            direccion = words[i].toCharArray();

            // sabemos que en la posicion 0 esta la fila y en la posicion 1 esta la columna
            // buscamos en la matriz el caracter que este en esa posicion y lo vamos
            // concatenando al mensaje normal

            mensaje += matriz[Character.getNumericValue(direccion[0])][Character.getNumericValue(direccion[1])];

        }

        // Retorna el mensaje
        return mensaje;
    }
}

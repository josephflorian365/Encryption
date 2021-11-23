import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascii {
    // Uso previo del encriptado
    public static void main(String[] args) {
        Ascii ascii = new Ascii();
        String cifradoascii = ascii.encrypt("mensaje de ascii");
        System.out.println(cifradoascii);
        String descifradoascii = ascii.decrypt(cifradoascii);
        System.out.println(descifradoascii);
    }

    // Funcion para encriptar el codigo Ascii
    public String encrypt(String mensaje) {
        char Letras[] = new char[mensaje.length()];
        int Ascii[] = new int[mensaje.length()];
        for (int i = 0; i < mensaje.length(); i++) {
            Letras[i] = mensaje.charAt(i);
            Ascii[i] = (int) Letras[i];
            // System.out.print(Ascii[i] + " ");
        }

        List<Integer> list = Arrays.stream(Ascii).boxed().collect(Collectors.toList());
        String result = list.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(" "));
        return result;
    }

    // Funcion para desencriptar el codigo Ascii
    public String decrypt(String textEncrypt) {
        List<String> lista = new ArrayList<String>();
        String str = "";
        List<String> myList = new ArrayList<String>(Arrays.asList(textEncrypt.split(" ")));
        for (String string : myList) {
            int numEntero = Integer.parseInt(string);
            // System.out.print((char) numEntero);
            String charToString = String.valueOf((char) numEntero);
            lista.add(charToString);
        }

        for (String fruit : lista) {
			str += fruit+"";
		}
        //System.out.println(str);
        return str;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascii {
    public static void main(String[] args) {
        Ascii ascii = new Ascii();
        String cifradoascii = ascii.encrypt("mensaje de ascii");
        System.out.println(cifradoascii);
        desencrypt(cifradoascii);
    }

    public String encrypt(String mensaje) {
        char Letras[] = new char[mensaje.length()];
        int Ascii[] = new int[mensaje.length()];
        for (int i = 0; i < mensaje.length(); i++) {
            Letras[i] = mensaje.charAt(i);
            Ascii[i] = (int) Letras[i];
            //System.out.print(Ascii[i] + " ");
        }

        List<Integer> list = Arrays.stream(Ascii).boxed().collect(Collectors.toList());
        String result = list.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(" "));
        return result;
    }

    public static void desencrypt(String textEncrypt) {
        List<String> myList = new ArrayList<String>(Arrays.asList(textEncrypt.split(" ")));
        for (String string : myList) {
            int numEntero = Integer.parseInt(string);
            System.out.print((char) numEntero);
        }
    }
}

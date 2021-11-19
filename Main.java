import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Polybios polybios = new Polybios();
        Escitala escitala = new Escitala();
        Ascii ascii = new Ascii();
        Aes aes = new Aes();

        int columns = 4;

        String polybios_encryption = polybios.cifrar("Hola Petter");
        System.out.println("polybios : " + polybios_encryption);
        String escitala_encryption = escitala.encrypt(polybios_encryption, columns);
        System.out.println("escitala : " + escitala_encryption);
        String ascii_ecnryption = ascii.encrypt(escitala_encryption);
        System.out.println("ascii : " + ascii_ecnryption);
        System.out.println("aes - 256 : " + aes.getAES("data"));

    }
}

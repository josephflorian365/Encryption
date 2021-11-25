public class Main {
    public static void main(String[] args) {
        Polybios polybios = new Polybios();
        Escitala escitala = new Escitala();
        Ascii ascii = new Ascii();
        Aes aes = new Aes();

        String frase = "Hola Petter";
        int columns = 4;

        System.out.println("---------------------------------------------------------------");
        System.out.println("||||||||||||||||||||||| *  CIFRADO * ||||||||||||||||||||||||||");
        System.out.println("---------------------------------------------------------------");
        // Encryption
        String polybiosEncryption = polybios.Cifrar_Polibio(frase);
        System.out.println("polybios : " + polybiosEncryption);
        String escitalaEncryption = escitala.encrypt(polybiosEncryption, columns);
        System.out.println("escitala : " + escitalaEncryption);
        String asciiEcnryption = ascii.encrypt(escitalaEncryption);
        System.out.println("ascii : " + asciiEcnryption);
        String aesEncryption = aes.getAES(asciiEcnryption);
        System.out.println("aes - 256 : " + aesEncryption);

        System.out.println("---------------------------------------------------------------");
        System.out.println("||||||||||||||||||||||| *  DESCIFRADO * ||||||||||||||||||||||||||");
        System.out.println("---------------------------------------------------------------");
        // decryption
        String aesDecryption = aes.getAESDecrypt(aesEncryption);
        System.out.println("aes - 256 Decryption : " + aesDecryption);
        String asciiDecryption = ascii.decrypt(aesDecryption);
        System.out.println("ascii Decryption : " + asciiDecryption);
        String escitalaDecryption = escitala.decrypt(asciiDecryption, columns);
        System.out.println("escitala Decryption : " + escitalaDecryption);
        String polybiosDecryption = polybios.Descifrar_Polibio(escitalaDecryption);
        System.out.println("polybios Decryption : " + polybiosDecryption);

    }
}

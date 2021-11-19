public class Polybios {
    public String cifrar(final String cadena) {

        final String TABLA_POLIBO[] = { "11", "12", "13", "14", "15", "21", "22", "23", "24", "24", "25", "31", "32",
                "33", "34", "35", "41", "42", "43", "44", "45", "51", "52", "53", "54", "55" };

        char strMayusculas[] = cadena.toUpperCase().toCharArray();
        StringBuilder Result = new StringBuilder();

        for (int i = 0; i < strMayusculas.length; i++) {
            char caracter = strMayusculas[i];
            if (caracter >= 'A' && caracter <= 'Z') {
                if (caracter == 'I' || caracter == 'J')
                    Result.append("24");// es el equivalente para I y J
                else
                    Result.append(TABLA_POLIBO[caracter - 65]);
                continue;
            }
            Result.append("00");// si algun valor no esta en la tabla
        }
        return Result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Polybios().cifrar("Wikipedia"));
    }
}

# Encryption
Combinación de algoritmos de cifrado Polybio + Escitala + Ascii + Aes - 256

# Sustitución “Polibio”
- Es un caso particular de transposición monoalfabética.

- Por ejemplo si queremos cifrar el texto HOLA

- La letra H se encuentra en la fila 2 columna 3
- Vamos con la O que está en la fila 3 - columna 4
- Siguiente la letra L en la fila 3, columna 1.
- Final la letra A la fila 1, columna 1.

![image](https://user-images.githubusercontent.com/53907643/142883116-7e68fec9-101e-4934-8bc8-136ac7b3d432.png)


# Transposición “Escitala”
- La transposición consiste en alterar el orden de los elementos de un mensaje (en el sentido de datos a cifrar).

- Sea el mensaje a cifrar: "En un lugar de la Mancha, de cuyo nombre no quiero acordarme" y sea la escítala de 10 caras.

- Se construye una tabla entonces de 10 medidas de ancho y 6 medidas de  alto

- Cuando el mensaje no llena, se completa con espacios en blanco

![image](https://user-images.githubusercontent.com/53907643/142883323-72ba76cb-3874-4289-8082-971e45b35768.png)

# Numérica “ASCII”
- El código ASCII es un estándar para la representación de caracteres en cualquier dispositivo electrónico, haciendo referencia a una codificación fija que asigna a caracteres imprimibles como letras, números y signos de puntuación y a caracteres de control no imprimibles un código concreto, que al pasar por el dispositivo lo traduce y muestra el carácter deseado.

![image](https://user-images.githubusercontent.com/53907643/142883457-cf9541e5-9bb6-4df6-a026-936ca5d58f04.png)

# Cifrado Simétrico “AES”
- Realiza operaciones de sustitución y permutación.
- Usa una matriz de tamaño 4 x 4 que son 128 bits.

- Mensaje:Píldora Tohth 30 => 

- 50 ED 6C 64 6F 72 61 20 54 68 6F 74 68  20 33 30

- Para una clave de 128 bits se realizarán 10 iteraciones, en cada vuelta se crea una clave generada a partir de la clave maestra o principal.
- El algoritmo comienza con el cifrado AddRoundKey, que suma los bytes del mensaje y la clave

- En el proceso de iteración, se realizarán operaciones de 
- SubBytes (x2)
- ShiftRows (x2)
- MixColumns
- AddRound Key (x2)

![image](https://user-images.githubusercontent.com/53907643/142883742-71483b00-5f08-42e6-b7c8-4c8c6a573b7d.png)

- Para una clave de 128 bits se realizarán 10 subclaves

- CRIPTOGRAMA

- 16 bytes son el resultado

- 5D 42 A7 AB D4 A1 1F E4 63 EA FE 15 59 31 69 A2

![image](https://user-images.githubusercontent.com/53907643/142883807-85727375-c0cd-419d-83ee-ce0ad5a0724b.png)

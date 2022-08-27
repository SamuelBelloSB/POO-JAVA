package javaEstruturado;

public class Estudo01 {
    public static void main(String[] args) throws Exception {
        //tipo nome

        // Variáveis do tipo inteiro
        System.out.println("Variáveis do tipo inteiro:");
        byte numeroByte = 127;
        short numeroShort = 32767;
        int numeroInt = 2147483647;
        long numeroLong = 922337203685477000l; //Número do tipo Long precisam da letra 'l' no final.
        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);

        // Variáveis do tipo flutuante
        System.out.println("Variáveis do tipo flutuante:");
        float peso = 3.2f; //Número do tipo Float precisa da letra 'f' no final.
        double pi = 3.1415926535897932384626433832795;
        System.out.print(peso);
        System.out.print(pi);

        // Variáveis do tipo caractere
        System.out.println("Variáveis do tipo caractere:");
        char letra = 'J';

        // Variáveis booleana (true or false)
        System.out.println("Variáveis do tipo Boolean:");
        boolean estouEstudando = true;

        // Variáveis do tipo String
        System.out.println("Variáveis do tipo String:");
        String nome = "Samuel";
    }
}
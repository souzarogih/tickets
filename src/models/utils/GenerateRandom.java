package models.utils;

public class GenerateRandom {

    public double generateNow(){

        // define o intervalo

        int max = 90;

        int min = 50;

        int intervalo = max - min + 1;

        double doubleNumero = 0.0;

        // gera 5 números aleatórios entre o intervalo de 20 a 50 e os imprime na tela

        for (int i = 0; i < 1; i++) {

            int numRandom = (int)(Math.random() * intervalo) + min;
            doubleNumero = (double) numRandom;

//            System.out.println(doubleNumero);


        }
        return doubleNumero;

    }
}

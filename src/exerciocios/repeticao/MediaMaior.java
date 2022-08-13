package exerciocios.repeticao;

import java.util.Scanner;

public class MediaMaior {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number;
        int maior=0;
        int soma=0;
        int media;
        int i=0;

        do{
            System.out.println("Número: ");
            number= scan.nextInt();
            if (number>maior) maior=number;
            soma= soma+number;
            i++;
            media= soma/i;

        }while (i<=5);

        System.out.println("Média: "+ media);
        System.out.println("Maior: " + maior);
    }
}

package exerciocios.repeticao;

import java.util.Scanner;

public class Fatora {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int number;
        int fatora=1;

        System.out.println("Número: ");
        number= scan.nextInt();

        for (int i= number; i>=1; i-- ){
            fatora= fatora*i;
        }
        System.out.println(fatora);
    }
}

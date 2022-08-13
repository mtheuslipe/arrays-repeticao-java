package exerciocios.repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int number, multi;

        System.out.println("Número: ");
        number= scan.nextInt();

        for(int i=1; i<=10; i++) {
            multi= number*i;
            System.out.println(number + "X" + i + "=" + multi);
        }
    }
}

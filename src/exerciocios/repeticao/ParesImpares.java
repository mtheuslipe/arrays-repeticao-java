package exerciocios.repeticao;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int number;
        int i=0;
        int par=0;
        int impar=0;

        do{
            System.out.println("Número: ");
            number= scan.nextInt();
            if (number % 2==0){
                par++;
            }else {
                impar++;
            }
            i++;
        }while(i<5);

        System.out.println("A quantidade de números pares é: "+ par);
        System.out.println("A quantidade de números ímpares é: "+ impar);
    }
}

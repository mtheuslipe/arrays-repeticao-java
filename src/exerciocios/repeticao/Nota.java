package exerciocios.repeticao;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Diga uma nota: ");
            nota= scan.nextInt();
            if (nota>10 || nota<0)  break;
        }
        System.out.println("Digite Somente Notas entre 0 e 10!!");
    }
}

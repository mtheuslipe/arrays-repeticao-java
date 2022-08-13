package exerciocios.repeticao;


import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true){
            System.out.println("Digite um nome: ");
            name= scan.next();
            if(name.equals("0")) break;

            System.out.println("Digite a idade: ");
            age= scan.nextInt();
        }
        System.out.println("Continua aqui...");
    }

}

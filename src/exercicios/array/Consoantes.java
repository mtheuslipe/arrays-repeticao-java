package exercicios.array;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes= new String[6];

        int consoante=0;
        int i =0;


        do{
            System.out.println("Letra: ");
            String letra= scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
                consoantes[i]= letra;
                consoante++;
            }
            i++;
        }while (i<consoantes.length);
        System.out.println(consoante);
        for(String grupo: consoantes){
            if (grupo!= null) System.out.println(grupo + "");
        }
    }

}

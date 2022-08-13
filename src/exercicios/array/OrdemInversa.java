package exercicios.array;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor= {1, 54, 86, -5};

        int i =0;
        System.out.print("Vetor: ");
        while (i<(vetor.length)){
            System.out.print(vetor[i] + " ");
            i++;
        }
        System.out.print("\n Vetor: ");
        for (i = (vetor.length - 1); i>=0;i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
}

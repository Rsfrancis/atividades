import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posMaior = -1, posMenor = -1;
        

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextInt();
            
            if (A[i] > maior) {
                maior = A[i];
                posMaior = i;
            }
            if (A[i] < menor) {
                menor = A[i];
                posMenor = i;
            }
        }
        
        System.out.println("\nMaior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);
        
        scanner.close();
    }
}

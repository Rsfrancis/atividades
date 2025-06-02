import java.util.Scanner;

public class VetorExercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextInt();
            soma += A[i];
            
            if (A[i] > maior) maior = A[i];
            if (A[i] < menor) menor = A[i];
        }
        
        double media = soma / 5.0;
        
        System.out.println("\nValores lidos:");
        for (int num : A) {
            System.out.println(num);
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);
        
        scanner.close();
    }
}

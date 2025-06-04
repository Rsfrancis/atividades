import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] A = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextDouble();
        }
        
        System.out.print("Digite o código (1 para ordem direta, 2 para inversa): ");
        int codigo = scanner.nextInt();
        
        if (codigo == 1) {
            System.out.println("\nVetor na ordem direta:");
            for (double num : A) {
                System.out.println(num);
            }
        } else if (codigo == 2) {
            System.out.println("\nVetor na ordem inversa:");
            for (int i = 4; i >= 0; i--) {
                System.out.println(A[i]);
            }
        } else {
            System.out.println("\nCódigo inválido.");
        }
        
        scanner.close();
    }
}

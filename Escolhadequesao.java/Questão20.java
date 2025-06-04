import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextInt();
        }
        
        System.out.println("\nNúmeros ímpares:");
        for (int num : A) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        
        scanner.close();
    }
}

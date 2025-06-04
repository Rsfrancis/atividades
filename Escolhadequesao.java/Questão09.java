import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                System.out.print("Digite o " + (i + 1) + "º valor par: ");
                num = scanner.nextInt();
            } while (num % 2 != 0); 
            A[i] = num;
        }
        
        System.out.println("\nValores na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(A[i]);
        }
        
        scanner.close();
    }
}

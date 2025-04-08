import java.util.Scanner;

public class Questão02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
            A[i] = scanner.nextInt();
        }
        
        System.out.println("\nValores lidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println(A[i]);
        }
        
        scanner.close();
    }
}
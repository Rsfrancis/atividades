import java.util.Scanner;

public class VetorExercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int countPares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                countPares++;
            }
        }
        
        System.out.println("\nQuantidade de números pares: " + countPares);
        
        scanner.close();
    }
}
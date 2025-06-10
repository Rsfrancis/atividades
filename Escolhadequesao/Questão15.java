import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            A[i] = scanner.nextInt();
            set.add(A[i]); 
        }
        
        System.out.println("\nValores sem repetição:");
        for (int num : set) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}

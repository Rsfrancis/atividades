public class Questão01 {
    public static void main(String[] args) {
        int[] A = {1, 0, 5, -2, -5, 7};
        
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma de A[0], A[1] e A[5]: " + soma);
        
        A[4] = 100;
        
        System.out.println("\nValores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
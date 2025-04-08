import java.util.Scanner;

public class LeituraValores {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler os valores
        Scanner scanner = new Scanner(System.in);
        
        // Criando um array para armazenar os valores
        int[] valores = new int[6];

        // Leitura dos 6 valores inteiros
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
            valores[i] = scanner.nextInt();
        }

        // Exibição dos valores lidos
        System.out.println("\nValores lidos:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        // Fechando o scanner
        scanner.close();
    }
}
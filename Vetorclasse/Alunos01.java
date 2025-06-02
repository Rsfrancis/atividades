import java.util.Scanner;

public class Aluno01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        String[] matriculas = new String[10];
        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Matrícula: ");
            matriculas[i] = sc.nextLine();
            System.out.print("Média Final: ");
            medias[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("\n=== Alunos Aprovados ===");
        for (int i = 0; i < 10; i++) {
            if (medias[i] >= 5.0) {
                System.out.println("Nome: " + nomes[i] + ", Matrícula: " + matriculas[i] + ", Média: " + medias[i]);
            }
        }

        System.out.println("\n=== Alunos Reprovados ===");
        for (int i = 0; i < 10; i++) {
            if (medias[i] < 5.0) {
                System.out.println("Nome: " + nomes[i] + ", Matrícula: " + matriculas[i] + ", Média: " + medias[i]);
            }
        }

        sc.close();
    }
}
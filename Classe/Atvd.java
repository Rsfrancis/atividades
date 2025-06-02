package QG02.Classes;
import java.util.Scanner;

public class Atvd {
    public static Scanner input = new Scanner(System.in);

    public static void dadosProdutos(Produtos dp) {
        System.out.println("titulo: ");
        dp.titulo = input.nextLine();
        System.out.println("descricao: ");
        dp.descricao = input.nextLine();
        System.out.println("preço: ");
        dp.precoUnitario = input.nextDouble();
        System.out.println("no estoque: ");
        dp.qtdEstoque = input.nextInt();
        input.nextLine();
    }

    public static void fichaProduto(Produtos dp) {
        System.out.println("\n==============================");
        System.out.println("         COMPROVANTE DE CADASTRO");
        System.out.println("\n==============================");
        System.out.println("Título: " + dp.titulo);
        System.out.println("Descrição: " + dp.descricao);
        System.out.println("Valor: " + dp.precoUnitario);
        System.out.println("Em estoque: " + dp.qtdEstoque);
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Produtos products = new Produtos();
        System.out.println("CADASTRO DE PRODUTO NO SISTEMA");
        dadosProdutos(products);
        System.out.println();
        fichaProduto(products);
    }
    
}
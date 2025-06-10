package ControledeEstoque;

import java.util.*;
import java.io.*;

public class EstoqueApp {
    static List<Produto01> produtos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        carregarProdutosDeArquivo();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Listar produtos");
            System.out.println("2. Subtotal por categoria");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(sc.nextLine());

            if (op == 0) break;
            else if (op == 1) listar();
            else if (op == 2) subtotalPorCategoria();
        }
    }

    static void carregarProdutosDeArquivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("produtos.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 5) {
                    String nome = partes[0];
                    int qtd = Integer.parseInt(partes[1]);
                    double preco = Double.parseDouble(partes[2]);
                    String categoria = partes[3];
                    int qtdMinima = Integer.parseInt(partes[4]);

                    produtos.add(new Produto01(nome, qtd, preco, categoria, qtdMinima));
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    static void listar() {
        for (Produto01 p : produtos) {
            System.out.println(p.toString() + " [" + p.getCategoria() + "]");
        }
    }

    static void subtotalPorCategoria() {
        Map<String, Double> subtotais = new TreeMap<>();

        for (Produto01 p : produtos) {
            subtotais.put(p.getCategoria(), subtotais.getOrDefault(p.getCategoria(), 0.0) + p.getSubtotal());
        }

        for (String cat : subtotais.keySet()) {
            System.out.println("\nCategoria: " + cat);
            for (Produto01 p : produtos) {
                if (p.getCategoria().equals(cat)) {
                    System.out.println("  " + p.toString());
                }
            }
            System.out.println("Subtotal: R$" + String.format("%.2f", subtotais.get(cat)));
        }
    }
}

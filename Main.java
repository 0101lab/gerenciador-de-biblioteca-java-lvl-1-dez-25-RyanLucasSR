import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Livro {
        String titulo;
        String autor;

        Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Titulo: ");
                String titulo = scanner.nextLine();

                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                livros.add(new Livro(titulo, autor));
            }

            if (opcao == 2) {
                for (int i = 0; i < livros.size(); i++) {
                    Livro l = livros.get(i);
                    System.out.println(i + " - " + l.titulo + " / " + l.autor);
                }
            }

            if (opcao == 3) {
                System.out.print("Buscar titulo: ");
                String busca = scanner.nextLine();

                for (Livro l : livros) {
                    if (l.titulo.toLowerCase().contains(busca.toLowerCase())) {
                        System.out.println(l.titulo + " / " + l.autor);
                    }
                }
            }
        }

        scanner.close();
    }
}

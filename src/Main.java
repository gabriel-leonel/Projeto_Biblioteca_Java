import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // inicializa o Scanner para input

        Biblioteca biblioteca = new Biblioteca(); // Instancia o obj biblioteca

        // Cadastrando usuarios
        biblioteca.adicionarUsuario(new Usuario("Carlos", "U1"));
        biblioteca.adicionarUsuario(new Usuario("Dr. Silva", "U2"));

        // Cadastrando livros
        biblioteca.adicionarLivro(new Livro("Java para Iniciantes", "L1"));
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados", "L2"));

        while (true) { // menu sempre executado
            System.out.println("\n1. Listar livros disponíveis\n2. Listar usuarios \n3. Emprestar livro\n4. Devolver livro\n5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                biblioteca.listarLivrosDisponiveis();
            }else if (opcao == 2) {
                biblioteca.listarUsuarios();
            }
            else if (opcao == 3) {
                System.out.print("ID do livro: ");
                String livroId = scanner.nextLine();
                System.out.print("ID do usuário: ");
                String usuarioId = scanner.nextLine();
                biblioteca.emprestarLivro(livroId, usuarioId);
            } else if (opcao == 4) {
                System.out.print("ID do livro: ");
                String livroId = scanner.nextLine();
                biblioteca.devolverLivro(livroId);
            } else if (opcao == 5) {
                break;
            }
        }
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    // classe biblioteca podera ira ter arrays para os livros, usuarios e transacoes
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Transacao> transacoes = new ArrayList<>();

    // adiciona um livro no array, passando um objeto livro(titulo e ID)
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // adiciona um livro no array, passando um objeto usuario(nome e ID)
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // metodo para realizar emprestimo, pegando pelos IDs de usuario e livro cadastrados anteriormente
    public void emprestarLivro(String livroId, String usuarioId) {
        Livro livro = null;
        Usuario usuario = null;

    // percorre por todos os livros procurando o ID passado ao chamar emprestarLivro
        for (Livro l : livros) {
            if (l.getId().equals(livroId) && l.isDisponivel()) {
                livro = l;
                break;
            }
        }

    // percorre por todos os usuarios procurando o ID passado ao chamar emprestarLivro
        for (Usuario u : usuarios) {
            if (u.getId().equals(usuarioId)) {
                usuario = u;
                break;
            }
        }
    // se livro ou usuario nao forem encontrados, retorna erro e retira o status de disponivel
        if (livro != null || usuario != null) {
            livro.setDisponivel(false);
            transacoes.add(new Transacao(usuario, livro));
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Dados inválidos, emprestimo cancelado");
        }
    }

    //metodo para devolverLivro, passando o id do Livro
    public void devolverLivro(String livroId) {
        Transacao transacao = null;

        for (Transacao t : transacoes) {
            if (t.getLivro().getId().equals(livroId)) {
                transacao = t;
                break;
            }
        }

        if (transacao != null) {
            transacao.getLivro().setDisponivel(true);
            transacoes.remove(transacao);
            System.out.println("Livro \"" + transacao.getLivro().getTitulo() + "\" devolvido com sucesso por " + transacao.getUsuario().getNome() + "!");
        } else {
            System.out.println("Livro não encontrado nos empréstimos.");
        }
    }

    // Lista todos os usuarios cadastrados
    public void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println("Usuario: " + u.getNome() + " ID:" + u.getId());
        }
    }
    // Lista todos os usuarios disponiveis para emprestar
    public void listarLivrosDisponiveis() {
        for (Livro l : livros) {
            if (l.isDisponivel()) {
                System.out.println(l.getTitulo() + " - " + l.getId());
            }
        }
    }
}

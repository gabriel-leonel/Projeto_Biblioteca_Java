import java.util.Date;

class Transacao {
    private Usuario usuario;
    private Livro livro;

    public Transacao(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }
}

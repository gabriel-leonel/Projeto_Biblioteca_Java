import java.util.Date;

public class Transacao {
    int id;
    Date dataTransacao;
    Livro livro;
    Usuario usuario;

    public Transacao(int id, Date dataTransacao, Livro livro, Usuario usuario) {
        this.id = id;
        this.dataTransacao = dataTransacao;
        this.livro = livro;
        this.usuario = usuario;
    }

    
}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

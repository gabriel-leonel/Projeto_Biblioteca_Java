public class Livro {
    int id;
    String nome;
    String genero;
    boolean isAlugado;

    public Livro(int id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.isAlugado = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }
}

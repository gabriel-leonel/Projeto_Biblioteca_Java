import java.util.List;


public class Usuario {
    int id;
    String name;
    List<Livro> livrosAlugados;

    public Usuario(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public void setLivrosAlugados(List<Livro> livrosAlugados) {
        this.livrosAlugados = livrosAlugados;
    }
}

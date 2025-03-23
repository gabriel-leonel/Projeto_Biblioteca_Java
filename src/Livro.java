public class Livro {
    private String titulo;
    private String id;
    private boolean disponivel;

    public Livro(String titulo, String id) {
        this.titulo = titulo;
        this.id = id;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getId() {
        return id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

public class Jogador {

    private String nome;
    private Tipo posicao;

    public Jogador(String nome, Tipo tipo) {
        this.nome = nome;
        this.posicao = tipo;
    }

    public Tipo getPosicao() {
        return posicao;
    }

    public void setPosicao(Tipo posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
package bloodivine.model;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int velocidade;

    // Construtor correto: sem a palavra 'class'
    public Personagem(String nome, int vida, int ataque, int velocidade) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    // Método para receber dano (comum a todos)
    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
    }

    // Getters para acessar os dados
    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public boolean estaVivo() { return vida > 0; }
}
package bloodivine.model;

public class Player extends Personagem {

    public Player(String nome) {
        // O super chama o construtor da classe pai (Personagem)
        super(nome, 100, 15, 5); 
    }
}
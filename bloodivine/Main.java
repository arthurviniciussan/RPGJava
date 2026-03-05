package bloodivine;

import bloodivine.model.Player;
import bloodivine.game.Historia;

public class Main {
    public static void main(String[] args) {
        // Criando o jogador
        Player jogador = new Player("Aragorn");

        // Usando a classe Historia
        Historia.textoLento("Bem-vindo ao mundo de Bloodivine...");
        Historia.textoLento("Guerreiro " + jogador.getNome() + ", sua jornada começa agora!");
        Historia.textoLento("piroca grande grossa, kevin seu gostoso");
        
        Historia.textoLento("kevin, quero te contar uma coisa...");
        
        Historia.textoLento("piroca grande");
        Historia.textoLento("o gustavo tá afim de conhecer o seu backend...");
        Historia.textoLento("você deixa?");
        System.out.println("\nStatus Inicial:");
        System.out.println("Vida: " + jogador.getVida());
    }
}
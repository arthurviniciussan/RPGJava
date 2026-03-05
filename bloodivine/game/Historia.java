package bloodivine.game;

public class Historia {

    // Método estático para poder usar sem instanciar a classe
    public static void textoLento(String texto) {
        try {
            for (int i = 0; i < texto.length(); i++) {
                System.out.print(texto.charAt(i));
                Thread.sleep(50); // Velocidade em milissegundos
            }
            System.out.println(); // Pula linha ao final
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Erro na exibição do texto.");
        }
    }
}
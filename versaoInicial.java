import java.util.Scanner;
import java.util.Random;

public class versaoInicial {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Bloodivine Game!");
        System.out.println("Esta é a versão inicial do jogo, onde você pode criar seu personagem e começar sua aventura.");
        // Aqui você pode adicionar mais funcionalidades, como criação de personagem, escolha de classe, etc.
        System.out.println("para fazer o texto correr, digite um numero e pressione Enter:");

        System.out.println("Digite seu nome de personagem:");
        Scanner scanner = new Scanner(System.in);
        String nomePersonagem = scanner.nextLine();
        System.out.println("Olá, " + nomePersonagem + "! Sua aventura começa agora!");

        System.out.println(nomePersonagem + " entra em uma caverna escura...");
        int continuar = scanner.nextInt();
        System.out.println(nomePersonagem + " encontra um esqueleto armado com espada e escudo!");
        int continuar2 = scanner.nextInt();
        System.out.println("A batalha começa!");
        
        int vidaPlyer = 100;
        int vidaEsqueleto = 50;
        int ataquePlayer = 20;
        int ataqueEsqueleto = 10;
        int velocidadePlayer = 5;
        int velocidadeEsqueleto = 3;
        int qtdPocoes = 3;
        int poderPocao = 30;

        Random rand = new Random();

        System.out.println("\n\nEscolha sua ação: 1 - Atacar, 2 - Usar Poção");
        while (vidaPlyer > 0 && vidaEsqueleto > 0) {
            System.out.println("\nVida de " + nomePersonagem + ": " + vidaPlyer + " | Vida do esqueleto: " + vidaEsqueleto + " | Poções: " + qtdPocoes);
            System.out.print("Escolha (1 ou 2): ");
            int escolha = scanner.nextInt();
            int numRandPlayer = rand.nextInt(10);
            int numRandEsqueleto = rand.nextInt(10);

            switch (escolha) {
                case 1:
                    if (velocidadePlayer + numRandPlayer > velocidadeEsqueleto + numRandEsqueleto) {
                        vidaEsqueleto -= ataquePlayer;
                        System.out.println(nomePersonagem + " ataca o esqueleto! Vida do esqueleto: " + Math.max(0, vidaEsqueleto));
                        if (vidaEsqueleto > 0) {
                            vidaPlyer -= ataqueEsqueleto;
                            System.out.println("O esqueleto contra-ataca! Vida de " + nomePersonagem + ": " + Math.max(0, vidaPlyer));
                        }
                    } else {
                        System.out.println("O esqueleto foi mais rápido! Ele ataca primeiro.");
                        vidaPlyer -= ataqueEsqueleto;
                        System.out.println("Vida de " + nomePersonagem + ": " + Math.max(0, vidaPlyer));
                    }
                    break;

                case 2:
                    if (qtdPocoes > 0) {
                        qtdPocoes--;
                        vidaPlyer += poderPocao;
                        if (vidaPlyer > 100) {
                            vidaPlyer = 100;
                        }
                        System.out.println(nomePersonagem + " usa uma poção! Vida atual: " + vidaPlyer + " (poções restantes: " + qtdPocoes + ")");
                    } else {
                        System.out.println("Você não tem poções restantes!");
                    }

                    if (vidaEsqueleto > 0) {
                        vidaPlyer -= ataqueEsqueleto;
                        System.out.println("O esqueleto aproveita e contra-ataca! Vida de " + nomePersonagem + ": " + Math.max(0, vidaPlyer));
                    }
                    break;

                default:
                    System.out.println("Escolha inválida. Digite 1 para atacar ou 2 para usar poção.");
                    break;
            }
        }

        System.out.println("\n--- BATALHA CONCLUÍDA ---");
        if (vidaPlyer > 0 && vidaEsqueleto <= 0) {
            System.out.println("Parabéns, " + nomePersonagem + ", você venceu o esqueleto!");
        } else if (vidaEsqueleto > 0 && vidaPlyer <= 0) {
            System.out.println("Você foi derrotado pelo esqueleto. Tente novamente! ");
        } else {
            System.out.println("Empate inesperado! Ambos caíram ao mesmo tempo.");
        }
        System.out.println("Vida final: " + Math.max(0, vidaPlyer) + " | Vida do esqueleto: " + Math.max(0, vidaEsqueleto));
        System.out.println("Poções restantes: " + qtdPocoes);

        scanner.close();
    }
}

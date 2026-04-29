import java.util.Scanner;
import java.util.Random;

public class rpg2 {
    public static void main(String[] args) throws InterruptedException{

        String limparTela = "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n";

        String[] cores = new String[7];
        cores[0] = "\033[32m"; // Verde
        cores[1] = "\033[31m"; // Vermelho
        cores[2] = "\033[34m"; // Azul 
        cores[3] = "\033[1;31m"; // Vermelho Forte
        cores[4] = "\033[1;33m"; // Amarelo Forte
        cores[5] = "\033[1;36m";; // Ciano Forte
        cores[6] = "\033[0m"; // Reset para a cor padrão do terminal
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] player = new int[5];
        player[0] = 100; // Vida
        player[1] = r.nextInt(25); //Ataque
        player[2] = 4; // Cura
        player[3] = r.nextInt(5) + 20; // Velocidade do Player
        player[4] = 100; // Vida Maxima

        int[] inimigo = new int[4];
        inimigo[0] = 100; // Vida
        inimigo[1] = r.nextInt(15); // Ataque Inimigo
        inimigo[2] = r.nextInt(5) + 20; // Velocidade Do Inimigo


        System.out.println("BEM VINDO AO " + cores[3] + "BLOODIVINE");
        System.out.println(cores[0] + "DIGITE " + cores[6] + "PARA COMEÇAR");
        System.out.println(cores[1] + "1 - INICIAR");
        System.out.println(cores[5] + "2 - CREDITOS");

        int menu = sc.nextInt();


        System.out.println(limparTela);    

        if (menu == 1){
            System.out.println(cores[4] + "SALA 1");
            System.out.println(cores[1] + "ESQUELETO APARECEU" + cores[6]);


            while (player[0] > 0 && inimigo[0] > 0) {
                
                System.out.println("O QUE VOCE FAZ?");
                System.out.println("1 - ATACAR");
                System.out.println("2 - CURA");
                
                menu = sc.nextInt();

                System.out.println(limparTela);

                switch (menu) {
                    case 1:
                        boolean playerAttackFirst = (player[3] > inimigo[2]);
                        if (playerAttackFirst) {
                            System.out.println("VOCÊ ataca primeiro!!!");
                            int vidainimigo_posdmg = inimigo[0] - player[1];
                            inimigo[0] = vidainimigo_posdmg;
                            System.out.println("o inimigo ficou com " + vidainimigo_posdmg + " de vida");

                            Thread.sleep(2500);
                            System.out.println(limparTela);

                            System.out.println("O inimigo ataca!!!");
                            int vidaplayer_posdmg = player[0] - inimigo[1];
                            player[0] = vidaplayer_posdmg;
                            System.out.println("VOCÊ ficou com " + vidaplayer_posdmg + " de vida");

                            
                            Thread.sleep(2500);
                            System.out.println(limparTela);
                        } 
                        else {
                            System.out.println("O Inimigo ataca primeiro");
                            int vidaplayer_posdmg = player[0] - inimigo[1];
                            player[0] = vidaplayer_posdmg;
                            System.out.println("VOCÊ ficou com " + vidaplayer_posdmg + " de vida");

                            
                            Thread.sleep(2500);
                            System.out.println(limparTela);

                            System.out.println("Você ataca!");
                            int vidainimigo_posdmg = inimigo[0] - player[1];
                            inimigo[0] = vidainimigo_posdmg;
                            System.out.println("o inimigo ficou com " + vidainimigo_posdmg + " de vida");

                            
                            Thread.sleep(2500);
                            System.out.println(limparTela);
                        }

                        break;
                    case 2:
                        System.out.println("Voce quis se curar");
                        player[0] += 20;
                        if (player[0] > player[4]) {
                            player[0] = player[4];
                        }
                        System.out.println("Você se curou com 20 pontos de vida!");

                        
                        Thread.sleep(2500);
                        System.out.println(limparTela);

                        System.out.println("O inimigo ataca!!!");
                        int vidaplayer_posdmg = player[0] - inimigo[1];
                        player[0] = vidaplayer_posdmg;
                        System.out.println("VOCÊ ficou com " + vidaplayer_posdmg + " de vida");

                        
                        Thread.sleep(2500);
                        System.out.println(limparTela);


                    default:
                        break;
                }
                if (inimigo[0] <= 0) {
                System.out.println("VOCÊ venceu o combate!!!");
                }
                else if(player[0] <= 0) {
                System.out.println("FIM DE JOGO");
                System.out.println("VOCÊ PERDEU");
           }
        
           }
        }
        sc.close();
    }
}

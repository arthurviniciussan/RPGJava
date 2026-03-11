import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num = sc.nextInt();

        int divisao = num / 2;


        if (num > 20){
            System.out.println(divisao);
        }else {
            System.out.println("Seu número não é maior que 20, então não pode dividir ele por 2 ");
        }

        sc.close();
    }
}
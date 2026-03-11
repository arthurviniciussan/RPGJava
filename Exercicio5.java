import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num = sc.nextInt();

        if (num >= 50 && num <= 100){
            System.out.println("Pertence ao intervalo");
        }else {
            System.out.println("Não pertence ao intervalo");
        }

        sc.close();

    }
}

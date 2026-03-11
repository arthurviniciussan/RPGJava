import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua idade");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de Idade");
        }

        sc.close();
    }
}

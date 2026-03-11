import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        if (num1 == num2){
            System.out.println("Os dois números são iguais");
        } else if (num1 > num2) {
            System.out.println("Os números em ordem decrescente é");
            System.out.println(num2 + "\n" + num1);
        }else {
            System.out.println("Os números em ordem decrescente é");
            System.out.println(num1 + "\n" + num2);
        }

        sc.close();

    }
}

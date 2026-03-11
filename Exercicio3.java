import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int subtracao1 = num1 - num2;
        int subtracao2 = num2 - num1;

        if (num1 == num2){
            System.out.println("Números iguais");
        } else if (num1 > num2) {
            System.out.println("A diferença entre os dois números é: " + subtracao1);
        }else {
            System.out.println("A diferença entre os dois números é: " + subtracao2);
        }

        sc.close();

    }
}

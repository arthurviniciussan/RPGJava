//Arthur Vinicius Santos
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double altura, pesoIdeal;
        char sexo;

        System.out.print("Digite sua altura (ex: 1.75): ");
        altura = scanner.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        sexo = scanner.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.printf("seu peso ideal: %.2f", pesoIdeal);

        scanner.close();
    }
}
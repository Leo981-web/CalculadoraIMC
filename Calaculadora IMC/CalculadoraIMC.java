import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite seu genêro M/F ou N caso não deseje informar: ");
        char genero = lerTeclado.next();
        lerTeclado.nextLine();
        
        System.out.print("Digite seu peso: ");
        Double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        System.out.print("Digite sua altura: ");
        Double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        Double imc = (peso / (Math.pow(altura, 2)));
        
        switch (genero) {
        case 'M':
            if (imc < 20) {
                System.out.print("Você está Abaixo do peso Normal.");
            } else if (20 <= imc && imc <= 24.9) {
                System.out.print("Você está de acordo do peso Normal.");
            } else if (25 <= imc && imc<= 29.9) {
                System.out.print("Você possui Obesidade Leve.");
            } else if (30 <= imc && imc<= 39.9){
                System.out.print("Você possui Obesidade Moderada.");
            } else {
                System.out.print("Você possui Obesidade Mórbida.");
            }
            break;

        case 'F':
            break;
        default:
            System.out.print("Informações inválidas.");
            break;
        }

    }
}

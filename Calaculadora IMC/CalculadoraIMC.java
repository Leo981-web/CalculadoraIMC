import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora IMC");
        System.out.print("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.printf("%s, Digite seu genêro M/F ou N caso não deseje informar: ", nome);
        char genero = lerTeclado.next().charAt(0);
        lerTeclado.nextLine();
        
        System.out.printf("%s, digite seu peso: ", nome);
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        System.out.printf("%s, Digite sua altura (EX: 1,80): ", nome);
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        double imc = (peso / (Math.pow(altura, 2)));
        
        switch (genero) {
        case 'M', 'm':
            if (imc < 20) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você está Abaixo do peso Normal." , nome, imc);
            } else if (20 <= imc && imc <= 24.9) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você está de Acordo do peso Normal.", nome, imc);
            } else if (25 <= imc && imc<= 29.9) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Leve.", nome, imc);
            } else if (30 <= imc && imc<= 39.9){
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Moderada.", nome, imc);
            } else {
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Mórbida." , nome, imc);
            }
            break;

        case 'F', 'f', 'N', 'n':
            if (imc < 19) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você está Abaixo do peso Normal." , nome, imc);
            } else if (19 <= imc && imc <= 23.9) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você está de Acordo do peso Normal.", nome, imc);
            } else if (24 <= imc && imc<= 28.9) {
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Leve.", nome, imc);
            } else if (29 <= imc && imc<= 38.9){
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Moderada.", nome, imc);
            } else {
                System.out.printf("%s, Seu IMC e de: %.2f. Você possui Obesidade Mórbida." , nome, imc);
            }
            break;
        default:
            System.out.print("Informações inválidas.");
            break;
        }

    }
}

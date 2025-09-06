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
                System.out.printf("%s, você está Abaixo do peso Normal." , nome);
            } else if (20 <= imc && imc <= 24.9) {
                System.out.printf("%s, você está de Acordo do peso Normal.", nome);
            } else if (25 <= imc && imc<= 29.9) {
                System.out.printf("%s, você possui Obesidade Leve.", nome);
            } else if (30 <= imc && imc<= 39.9){
                System.out.printf("%s, você possui Obesidade Moderada.", nome);
            } else {
                System.out.printf("%s, você possui Obesidade Mórbida." , nome);
            }
            break;

        case 'F', 'f', 'N', 'n':
            if (imc < 19) {
                System.out.printf("%s, você está Abaixo do peso Normal." , nome);
            } else if (19 <= imc && imc <= 23.9) {
                System.out.printf("%s, você está de Acordo do peso Normal.", nome);
            } else if (24 <= imc && imc<= 28.9) {
                System.out.printf("%s, você possui Obesidade Leve.", nome);
            } else if (29 <= imc && imc<= 38.9){
                System.out.printf("%s, você possui Obesidade Moderada.", nome);
            } else {
                System.out.printf("%s, você possui Obesidade Mórbida." , nome);
            }
            break;
        default:
            System.out.print("Informações inválidas.");
            break;
        }

    }
}

package LogicaSequencial;

import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
//        System.out.println("Olá, eu faço a impressão e pulo a linha");
//        System.out.print("Olá, eu faço a impressão na mesma linha");
//        System.out.printf("Olá, eu faço a impressão formatada");

            Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o seu estado civil?: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("Agora, Informe a cidade onde mora: ");
        String cidade = scanner.nextLine();

        System.out.println("Agora, digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, sou " + nome + " tenho " + idade + " Anos" + " Sou " + estadoCivil + " Moro em " + cidade);





    }
}

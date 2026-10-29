package Excecao.NaoVerificada;

import Excecao.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cpf: ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("05093384901")) {
                throw new ConflictException("CPF Já Cadastrado " + cpf);
            } else {
                return "CPF Válido, Usuário Cadastrado";
            }
        } catch (ConflictException e) {
            throw new ConflictException ("CPF Já Cadastrado " + cpf);
        }
    }
}

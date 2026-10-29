package Abstração;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua maria dos anzois", "Fortaleza ", "1554 ","Ceará ", "60323-654", "Joao Almeida Prado ", "03234523465 ", "Programador ");
        Cliente joana = new Cliente("Vila sao joao ", "Fortaleza ", "Ceará ", "60546332", "Joana da Silva Sauro ", "3028992901");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();

    }
}

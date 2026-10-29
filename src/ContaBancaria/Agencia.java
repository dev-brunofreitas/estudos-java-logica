package ContaBancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria( "Roberto", 500);
        System.out.println("O titular da conta é : " + minhaConta.getTitular() + " e o saldo final é: " + minhaConta.getSaldo());

        minhaConta.setTitular("Roberto Marinho");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é : " + titularConta + " e o saldo final é: " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Francisca");
        System.out.println("O titular da conta é : " + contaMinhaMae.getTitular() + " e o saldo final é: " + contaMinhaMae.getSaldo());


    }



}


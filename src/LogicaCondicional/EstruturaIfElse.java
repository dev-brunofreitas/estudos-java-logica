package LogicaCondicional;

public class EstruturaIfElse {
    public static void main(String[] args) {
//        int idade = 30;
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }
//
//        boolean estaChovendo = true;
//        if (!estaChovendo){
//            System.out.println("Vamos sair para passear");
//        }
//        else {
//            System.out.println("Vamos ficar em casa");
//        }
//
        boolean temDinheiro = false;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {
            System.out.println("Pede um ifood e um zé delivery");
        }
        else if (temDinheiro || temCartao) {
            System.out.println("pede um ifood");
        }
        else {
            System.out.println("Não pede nada");
        }
//
//        boolean estaDeFerias = true;
//        boolean naoEstaDeFerias = false;
//
//        if (estaDeFerias) {
//            System.out.println("Vamos Viajar!");
//        }
//        else {
//            System.out.println("Vamos ficar em casa!");
//
//        }
//
        String mensagem = (temDinheiro)? "Pede um ifood" : "Come o que tem em casa";


    }
}

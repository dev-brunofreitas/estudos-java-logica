package LogicaSequencial;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorTotal = pao+queijo+acucar;
        double valorTotalComDesconto = valorTotal-desconto;
        double valorTotalDivido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasMes;

        System.out.println("Valor Total = R$ " + valorTotal);
        System.out.println("Valor Total Desconto = R$ " + valorTotalComDesconto);
        System.out.println("Valor Total Dividido = R$ " + valorTotalDivido);
        System.out.println("Valor Gasto Mês = R$ " + valorTotalMensal);
    }
}

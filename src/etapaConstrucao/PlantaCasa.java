package etapaConstrucao;

public class PlantaCasa implements Construcao {
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;
    @Override
    public void construir() {
        System.out.println("A casa foi construida, as caracteristicas são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de Quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }
    @Override
    public void pintar() {
        System.out.println("Pintando a casa com a cor " + cor);
    }
    //Anotação
    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void mudarCorCasa(String novaCor){
        cor=novaCor;
        pintar();
    }

    public int somarMetragem() {
        return metragem * numeroBanheiros + numeroQuartos;
}
 public void alterarCaracteristicas(int metros, int quartos, int banheiros,String materiais){

        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = materiais;
        construir();
 }

}

package etapaConstrucao;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variaveis) (Caracteristicas) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamada da função (metodo) da ordem;
        casa.construir();

        casa.pintar();

        casa.mudarCorCasa("Branco");
        casa.alterarCaracteristicas(100,2,2,"Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroQuartos = 3;
        casaVizinho.numeroBanheiros = 3;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();
    }
}

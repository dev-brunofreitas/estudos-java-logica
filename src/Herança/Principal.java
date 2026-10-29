package Herança;

public class Principal {
    public static void main(String[] args) {

        Cachorro frederico = new Cachorro();
        frederico.latir();
        frederico.comer("Ração");
        frederico.beberAgua();
        frederico.dormir();

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("Grão de Milho");
        gertrudez.beberAgua();
        gertrudez.dormir();
    }
}

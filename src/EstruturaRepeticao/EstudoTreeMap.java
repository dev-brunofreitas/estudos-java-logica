package EstruturaRepeticao;

import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notaAlunos = new TreeMap<>();
        notaAlunos.put("Alice", 9.5);
        notaAlunos.put("Mateus" , 8.0);
        notaAlunos.put("Maria", 9.9);
        for (String nome : notaAlunos.keySet()){
            double nota = notaAlunos.get(nome);
            System.out.println(nome + " ; " + nota);
        }

        for (Map.Entry<String, Double> nota : notaAlunos.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " ; " + valorNota);
        }
        System.out.println("Primeira Chave: " + notaAlunos.firstKey());
        System.out.println("Ultima Chave : " + notaAlunos.lastKey());


    }
}

package EstruturaRepeticao;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notaAlunos = new HashMap<>();
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

        int tamanhoHash = notaAlunos.size();
    }

    }
}

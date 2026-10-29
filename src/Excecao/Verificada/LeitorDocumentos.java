package Excecao.Verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        //Identação CTRL + ALT + L

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/Users/usuario_exemplo/Documents/Texto.txt"));

            //Ler linha por Linha
            // NULL = Algo Inexistente
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

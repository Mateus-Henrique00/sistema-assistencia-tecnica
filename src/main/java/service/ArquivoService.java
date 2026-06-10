package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.OrdemServico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArquivoService {
    private  static final String ARQUIVO = "Ordens.Json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void salvar(List<OrdemServico> lista) {
        try {
            FileWriter writer = new FileWriter(ARQUIVO);
            String json = gson.toJson(lista);
            System.out.println("JSON gerado: " + json);
            writer.write(String.valueOf(json));
            writer.write(json);
            writer.close();
            System.out.println("Dados cadastrado com sucesso!!!");
        } catch (IOException e) {
            System.out.println("ALGO DEU ERRADO");
        }


    }
}

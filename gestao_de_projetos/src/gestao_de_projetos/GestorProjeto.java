package gestao_de_projetos;

import java.util.HashMap;
import java.util.Map;

public class GestorProjeto {
    private Map<String, Projeto> projetos;

    public GestorProjeto() {
        projetos = new HashMap<>();
    }

    public void adicionarProjeto(String nomeProjeto, String descricao, String[] membros) {
        Projeto projeto = new Projeto(nomeProjeto, descricao, membros);
        projetos.put(nomeProjeto, projeto);
    }

    public void listarProjetos() {
        System.out.println("Projetos cadastrados:");
        for (Projeto projeto : projetos.values()) {
            System.out.println("Nome do projeto: " + projeto.getNomeProjeto());
            System.out.println("Descrição: " + projeto.getDescricao());
            System.out.println("Membros: ");
            for (String membro : projeto.getMembros()) {
                System.out.println("- " + membro);
            }
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        GestorProjeto gestorProjeto = new GestorProjeto();

        // Adicionando projetos
        String[] membrosProjeto1 = {"João", "Maria"};
        gestorProjeto.adicionarProjeto("Projeto1", "Projeto de desenvolvimento web", membrosProjeto1);

        String[] membrosProjeto2 = {"Pedro", "Ana", "Carlos"};
        gestorProjeto.adicionarProjeto("Projeto2", "Projeto de análise de dados", membrosProjeto2);

        // Listando projetos
        gestorProjeto.listarProjetos();
    }
}

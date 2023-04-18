package gestao_de_projetos;

class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String[] membros;

    public Projeto(String nomeProjeto, String descricao, String[] membros) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.membros = membros;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String[] getMembros() {
        return membros;
    }
}

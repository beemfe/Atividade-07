public class Main {
    public static void main(String[] args) {
        Avaliacao<Prova> provas = new Prova();
        Avaliacao<Atividade> atividades = new Atividade();

        provas.adicionarAtividade(Prova.gerarProvaAleatoria());
        atividades.adicionarAtividade(new Atividade("Programação Orientada a Objetos", 10));

        System.out.println("Prova: " + provas.consultarAtividade(0).getNumeroQuestoes() + ", " + provas.consultarAtividade(0).getMediaNotas());
        System.out.println("Atividade: " + atividades.consultarAtividade(0).getAssunto() + ", " + atividades.consultarAtividade(0).getNumeroPaginas());

        provas.limparAtividades();
        atividades.limparAtividades();
    }
}

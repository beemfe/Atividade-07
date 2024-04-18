import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prova implements Avaliacao<Prova> {
    private int numeroQuestoes;
    private float mediaNotas;
    private List<Prova> provas = new ArrayList<>();

    public void adicionarAtividade(Prova prova) {
        provas.add(prova);
    }

    public Prova consultarAtividade(int posicao) {
        return provas.get(posicao);
    }

    public void limparAtividades() {
        provas.clear();
    }

    public Prova(int numeroQuestoes, float mediaNotas) {
        this.numeroQuestoes = numeroQuestoes;
        this.mediaNotas = mediaNotas;
    }

    public static Prova gerarProvaAleatoria() {
        Random random = new Random();
        int numeroQuestoes = random.nextInt(11);
        float mediaNotas = random.nextFloat() * 10;
        return new Prova(numeroQuestoes, mediaNotas);
    }
}

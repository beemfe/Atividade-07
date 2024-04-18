import java.util.ArrayList;
import java.util.List;

public class Atividade implements Avaliacao<Atividade> {
    private String assunto;
    private int numeroPaginas;
    private List<Atividade> atividades = new ArrayList<>();

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public Atividade consultarAtividade(int posicao) {
        return atividades.get(posicao);
    }

    public void limparAtividades() {
        atividades.clear();
    }

    public Atividade(String assunto, int numeroPaginas) {
        this.assunto = assunto;
        this.numeroPaginas = numeroPaginas;
    }
}

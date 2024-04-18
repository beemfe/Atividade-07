import java.util.List;
public interface Avaliacao<T> {
    void adicionarAtividade(T atividade);
    T consultarAtividade(int posicao);
    void limparAtividades();
    List<T> getAtividades();
}

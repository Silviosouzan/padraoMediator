import java.util.List;
import java.util.ArrayList;

public class SalaJogo implements SalaJogoMediator {
    private List<Jogador> jogadores;

    public SalaJogo() {
        jogadores = new ArrayList<>();
    }

    @Override
    public void enviarMensagem(String mensagem, Jogador jogador) {
        for (Jogador j : jogadores) {
            if (j != jogador) {
                j.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void registrarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
}


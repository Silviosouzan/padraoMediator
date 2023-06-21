import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaJogoTest {
    private SalaJogo salaJogo;
    private Jogador jogador1;
    private Jogador jogador2;

    @BeforeEach
    public void setUp() {
        salaJogo = new SalaJogo();
        jogador1 = new JogadorParticipante(salaJogo, "Jogador1");
        jogador2 = new JogadorParticipante(salaJogo, "Jogador2");
        salaJogo.registrarJogador(jogador1);
        salaJogo.registrarJogador(jogador2);
    }

    @Test
    public void testEnviarMensagem() {
        String mensagem = "Bem-vindo a Summoner's Rift!";
        jogador1.enviarMensagem(mensagem);
        assertEquals(jogador2.getMensagemRecebida(), "Jogador1: " + mensagem);
    }

    @Test
    public void testReceberMensagem() {
        String mensagem = "Bem-vindo a Summoner's Rift!";
        jogador2.enviarMensagem(mensagem);
        assertEquals(jogador1.getMensagemRecebida(), "Jogador2: " + mensagem);
    }
}


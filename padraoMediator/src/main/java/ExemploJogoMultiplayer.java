public class ExemploJogoMultiplayer {
    public static void main(String[] args) {
        SalaJogoMediator salaJogo = new SalaJogo();

        Jogador jogador1 = new JogadorParticipante(salaJogo, "Jogador1");
        Jogador jogador2 = new JogadorParticipante(salaJogo, "Jogador2");
        Jogador jogador3 = new JogadorParticipante(salaJogo, "Jogador3");

        salaJogo.registrarJogador(jogador1);
        salaJogo.registrarJogador(jogador2);
        salaJogo.registrarJogador(jogador3);

        jogador1.enviarMensagem("Bem-vindo a Summoner's Rift");
        jogador2.enviarMensagem("Bem-vindo a Summoner's Rift!");

    }
}

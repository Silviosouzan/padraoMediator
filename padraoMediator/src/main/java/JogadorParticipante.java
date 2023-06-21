public class JogadorParticipante implements Jogador {
    private SalaJogoMediator mediator;
    private String nome;
    private String mensagemRecebida;

    public JogadorParticipante(SalaJogoMediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        mediator.enviarMensagem(nome + ": " + mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem recebida por " + nome + ": " + mensagem);
        mensagemRecebida = mensagem;
    }

    @Override
    public String getMensagemRecebida() {
        return mensagemRecebida;
    }
}



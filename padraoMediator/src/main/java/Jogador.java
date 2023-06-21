public interface Jogador {
    void enviarMensagem(String mensagem);
    void receberMensagem(String mensagem);
    String getMensagemRecebida();
}
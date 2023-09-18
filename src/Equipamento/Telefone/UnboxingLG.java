package src.Equipamento.Telefone;

public class UnboxingLG implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarConversa() {
        System.out.println("Iniciar correio de voz");
    }
}

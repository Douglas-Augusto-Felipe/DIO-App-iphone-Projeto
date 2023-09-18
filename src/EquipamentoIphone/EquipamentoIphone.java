package src.EquipamentoIphone;

import src.Equipamento.Navegador.NavegadorOperaGX;
import src.Equipamento.Telefone.AparelhoTelefonico;
import src.Equipamento.musica.ReproduzirMusica;

public class EquipamentoIphone implements ReproduzirMusica , NavegadorOperaGX , AparelhoTelefonico {

    @Override
    public void pagina() {
        System.out.println("Abrindo pagina via equipamento Iphone");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("adicionando pagina via equipamento Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina via equipamento Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via equipamento Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone via equipamento Iphone");
    }

    @Override
    public void iniciarConversa() {
        System.out.println("Iniciando Conversa via equipamento Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica via equipamento Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Parado na musica via equipamento Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo musica via equipamento Iphone");
    }
}

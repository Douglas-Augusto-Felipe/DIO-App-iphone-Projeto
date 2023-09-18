package src.Estabelecimento;

import src.Equipamento.Navegador.NavegadorOperaGX;
import src.Equipamento.Telefone.AparelhoTelefonico;
import src.Equipamento.musica.ReproduzirMusica;
import src.EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        NavegadorOperaGX internet = (NavegadorOperaGX) iphone;

        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println(" ‴(⁰O⁰)‴ ");
        System.out.println(" ");

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarConversa();
        System.out.println(" (✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Internet");
        internet.pagina();
        internet.adicionarNovaPagina();
        internet.atualizarPagina();
        System.out.println(" (. ❛ ᴗ ❛.)  ");

    }
}

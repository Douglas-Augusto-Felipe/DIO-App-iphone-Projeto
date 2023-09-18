package src.Equipamento.musica;

import src.Equipamento.musica.ReproduzirMusica;

public class ipode implements ReproduzirMusica {
    public void tocar(){
        System.out.println("Tocando Musica");
    }
    public void pausar(){
        System.out.println("Pause");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}

package src.Equipamento.Navegador;

public class OperaGX implements NavegadorOperaGX {
    @Override
    public void pagina() {
        System.out.println("Pagina Aberta");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionar nova Pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }
}

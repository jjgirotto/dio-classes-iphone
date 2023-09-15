package internet;
public class Safari extends NavegadorInternet{
    public void exibirPagina() {
        validarConexao();
        System.out.println("exibindo página no safari");
    }
    public void adicionarNovaPagina() {
        Pagina pagina = new Pagina("https://github.com/jjgirotto/dio-classes-iphone");
        System.out.println("adicionando página no safari: " + pagina.getUrl());
    }
    public void atualizarPagina() {
        System.out.println("atualizar página no safari");
    }

    private void validarConexao() {
        System.out.println("validando conexao no safari");
    }
}

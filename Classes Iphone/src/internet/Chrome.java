package internet;
public class Chrome extends NavegadorInternet{
    public void exibirPagina() {
        validarConexao();
        System.out.println("exibindo página no chrome");
    }
    public void adicionarNovaPagina() {
        Pagina pagina = new Pagina("https://github.com/jjgirotto/dio-classes-iphone");
        System.out.println("adicionando página no chrome: " + pagina.getUrl());
    }
    public void atualizarPagina() {
        System.out.println("atualizar página no chrome");
    }

    private void validarConexao() {
        System.out.println("validando conexao no chrome");
    }
}

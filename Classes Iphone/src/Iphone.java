import internet.Chrome;
import internet.NavegadorInternet;
import internet.Safari;
import songs.Deezer;
import songs.ReprodutorMusical;
import songs.Spotify;
import telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorrerioVoz();

        ReprodutorMusical reprodutor = null;
        String reprodutorEscolhido = "spotify".toLowerCase(); // Pode ser "Spotify" ou "Deezer"
        System.out.println("\nAbrindo Reprodutor Musical " + reprodutorEscolhido);

        if (reprodutorEscolhido.equals("spotify")) {
            reprodutor = new Spotify("barquinho de papel", "comum");
            reprodutor.tocar();
            reprodutor.pausar();
            reprodutor.selecionarMusica();
        } else if (reprodutorEscolhido.equals("deezer")) {
            reprodutor = new Deezer("trevo");
            reprodutor.tocar();
            reprodutor.pausar();
            reprodutor.selecionarMusica();
        }

        NavegadorInternet navegador = null;
        String navegadorEscolhido = "chrome".toLowerCase(); // Pode ser "Chrome" ou "Safari"
        System.out.println("\nAbrindo o navegador " + navegadorEscolhido);

        if (navegadorEscolhido.equals("chrome")) {
            navegador = new Chrome();
            navegador.exibirPagina();
            navegador.adicionarNovaPagina();
            navegador.atualizarPagina();
        } else if (navegadorEscolhido.equals("safari")) {
            navegador = new Safari();
            navegador.exibirPagina();
            navegador.adicionarNovaPagina();
            navegador.atualizarPagina();
        }

    }

}
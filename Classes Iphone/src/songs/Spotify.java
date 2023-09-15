package songs;
public class Spotify extends ReprodutorMusical{
    private String musica;
    private String plano;

    public Spotify(String musica, String plano) {
        this.musica = musica;
        this.plano = plano;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void tocar() {
        validarPlano();
        System.out.println("tocando no spotify");
    }

    public void pausar() {
        System.out.println("pausando no spotify");
    }

    public void selecionarMusica() {
        System.out.println("selecionando música " + musica + " no spotify");
    }

    private void validarPlano() {

        if (plano == "premium") {
            System.out.println("você pode ouvir offline agora");
        }
        if (plano == "comum") {
            System.out.println("você precisa estar conectado");
            validarConexao();
        }
    }

    private void validarConexao() {
        System.out.println("validando conexão");
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}

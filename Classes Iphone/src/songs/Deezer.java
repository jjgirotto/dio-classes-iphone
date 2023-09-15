package songs;
public class Deezer extends ReprodutorMusical{
    private String musica;

    public Deezer(String musica) {
        this.musica = musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void tocar() {
        System.out.println("tocando no deezer");
    }

    public void pausar() {
        System.out.println("pausando no deezer");
    }

    public void selecionarMusica() {
        System.out.println("selecionando música " + musica + " no deezer");
    }
}

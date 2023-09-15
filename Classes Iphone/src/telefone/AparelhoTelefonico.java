package telefone;
public class AparelhoTelefonico {

    public void ligar() {
        Telefone telefone = new Telefone(18997564764L, "Juliana");
        System.out.println("ligando para o número " + telefone.getNumero());
    }

    public void atender() {
        Telefone telefone = new Telefone(18997563844L, "Laercio");
        System.out.println("atendendo " + telefone.getNome());
    }

    public void iniciarCorrerioVoz() {
        System.out.println("iniciando correio de voz");
    }
}
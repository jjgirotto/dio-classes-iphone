package telefone;
public class Telefone {
    private long numero;
    private String nome;

    public Telefone(long numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    public long getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }

}

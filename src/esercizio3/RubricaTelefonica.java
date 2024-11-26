package esercizio3;

public class RubricaTelefonica {
   private String nome;
    private int numeroDiTelefono;

    public RubricaTelefonica(String nome, int numeroDiTelefono) {
        this.nome = nome;
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDiTelefono() {
        return numeroDiTelefono;
    }
}

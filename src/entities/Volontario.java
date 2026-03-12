package entities;

import interfaces.MembroOrganizzazione;

public class Volontario implements MembroOrganizzazione {
    private final String nome;
    private final int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public Volontario(String nome, int eta) {
        this(nome, eta, null);
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public void checkIn() {
        System.out.println("Volontario inizia il servizio: " + this);
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}

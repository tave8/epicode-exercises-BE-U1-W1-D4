public class Dipendente {
    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.setDipartimento(dipartimento);
    }

    public Dipendente(String matricola, double stipendio) {
        this(matricola, stipendio, null);
    }

    public Dipendente(String matricola) {
        this(matricola, 0);
    }


    public double getStipendio() {
        return this.stipendio;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }

    public void setDipartimento(Dipartimento newDipartimento) {
        this.dipartimento = newDipartimento;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public void stampaMatricola() {
        System.out.println("Matricola dipendente: " + this.getMatricola());
    }
}

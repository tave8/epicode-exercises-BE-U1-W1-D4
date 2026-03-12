package entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    private double coefficienteRisultati = 1.74;
    private int risultati;

    public Dirigente(String matricola, double stipendioBase, int risultati, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
        this.setRisultati(risultati);
    }

    public Dirigente(String matricola, double stipendioBase, int risultati) {
        this(matricola, stipendioBase, risultati, null);
    }

    public Dirigente(String matricola, double stipendioBase) {
        this(matricola, stipendioBase, 1, null);
    }


    public double getCoefficienteRisultati() {
        return this.coefficienteRisultati;
    }

    public double getRisultati() {
        return this.risultati;
    }

    public void setRisultati(int risultati) {
        this.risultati = risultati;
    }

    public double getBonusRisultati() {
        return this.getCoefficienteRisultati() * this.getRisultati();
    }

    public double calculateSalary() {

        return this.getStipendio() + this.getBonusRisultati();
    }
}

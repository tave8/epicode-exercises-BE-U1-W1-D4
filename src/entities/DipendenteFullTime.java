package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String matricola, double stipendioTotale, Dipartimento dipartimento) {
        super(matricola, stipendioTotale, dipartimento);
    }

    public DipendenteFullTime(String matricola, double stipendioTotale) {
        this(matricola, stipendioTotale, null);
    }

    public double calculateSalary() {
        return this.getStipendio();
    }
}

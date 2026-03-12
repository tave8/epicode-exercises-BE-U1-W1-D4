package entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double bonusMensile;

    public DipendentePartTime(String matricola, double stipendioBase, double bonusMensile, Dipartimento dipartimento) {
        super(matricola, stipendioBase, dipartimento);
        this.setBonusMensile(bonusMensile);
    }

    public DipendentePartTime(String matricola, double stipendioBase, double bonusMensile) {
        this(matricola, stipendioBase, bonusMensile, null);
    }

    public DipendentePartTime(String matricola, double stipendioBase) {
        this(matricola, stipendioBase, 0);
    }

    public double getBonusMensile() {
        return this.bonusMensile;
    }

    public void setBonusMensile(double bonusMensile) {
        this.bonusMensile = bonusMensile;
    }

    public double calculateSalary() {
        return this.getStipendio() + this.getBonusMensile();
    }
}

package entities;

import enums.Dipartimento;
import interfaces.MembroOrganizzazione;

public abstract class Dipendente implements MembroOrganizzazione {
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

    public static double calculateSalaries(Dipendente[] dipendenti) {
        double sum = 0;
        for(Dipendente dipendente : dipendenti) {
            sum += dipendente.calculateSalary();
        }
        return sum;
    }

    public abstract double calculateSalary();

    public void checkIn() {
        System.out.println("Dipendente inizio il turno di lavoro: " + this);
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                '}';
    }
}

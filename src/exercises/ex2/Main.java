package exercises.ex2;

import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;

public class Main {
    static void main(String[] args) {
        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime("1", 2000);
        DipendentePartTime dipendentePartTime1 = new DipendentePartTime("2", 1000, 300);
        Dirigente dirigente1 = new Dirigente("1", 1000, 1);

        Dipendente[] dipendenti = {dipendenteFullTime1, dipendentePartTime1, dirigente1};

        System.out.println(Dipendente.calculateSalaries(dipendenti));

    }
}

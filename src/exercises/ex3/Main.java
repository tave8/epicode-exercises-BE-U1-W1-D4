package exercises.ex3;

import entities.*;
import interfaces.MembroOrganizzazione;

public class Main {
    static void main(String[] args) {
        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime("1", 2000);
        DipendentePartTime dipendentePartTime1 = new DipendentePartTime("2", 1000, 300);
        Dirigente dirigente1 = new Dirigente("1", 1000, 1);
        Volontario volontario1 = new Volontario("Giuseppe", 29);

        MembroOrganizzazione[] membri = {dipendenteFullTime1, dipendentePartTime1, dirigente1, volontario1};

        for(MembroOrganizzazione membro : membri) {
            membro.checkIn();
        }

    }
}

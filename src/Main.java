public class Main {
    static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("1");
        Dipendente dipendente2 = new Dipendente("2");
        Dipendente dipendente3 = new Dipendente("3");
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        for(Dipendente dipendente : dipendenti) {
            dipendente.stampaMatricola();
        }
    }
}

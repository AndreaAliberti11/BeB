import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BeB {

    public void stampa() {
        Scanner inputNumeri = new Scanner(System.in);
        Scanner inputTesti = new Scanner(System.in);
        ArrayList<Prenotazioni> lista = new ArrayList<>();
        boolean continua = true;

        while (continua) {
            Prenotazioni mioBeB = new Prenotazioni();

            mioBeB.setNomeCognome();
            System.out.println();

            mioBeB.setAnnoIngresso();
            mioBeB.setMeseIngresso();
            mioBeB.setGiornoIngresso();
            System.out.println(
                    mioBeB.getGiornoIngresso() + "/" + mioBeB.getMeseIngresso() + "/" + mioBeB.getAnnoIngresso());
            System.out.println();

            mioBeB.setAnnoUscita();
            mioBeB.setMeseUscita();
            mioBeB.setGiornoUscita();
            System.out.println(mioBeB.getGiornoUscita() + "/" + mioBeB.getMeseUscita() + "/" + mioBeB.getAnnoUscita());
            System.out.println();
            while (continua) {
                if (mioBeB.getAnnoUscita() > mioBeB.getAnnoIngresso()
                        || mioBeB.getAnnoUscita() == mioBeB.getAnnoIngresso()
                                && mioBeB.getMeseUscita() > mioBeB.getMeseIngresso()
                        || mioBeB.getAnnoUscita() == mioBeB.getAnnoIngresso()
                                && mioBeB.getMeseUscita() == mioBeB.getMeseIngresso()
                                && mioBeB.getGiornoUscita() > mioBeB.getGiornoIngresso()) {
                    break;
                } else {
                    System.out.println(
                            "La data di Uscita deve essere successiva a quella di ingresso! Reinserisci: ");
                    mioBeB.setAnnoUscita();
                    mioBeB.setMeseUscita();
                    mioBeB.setGiornoUscita();
                    System.out.println(
                            mioBeB.getGiornoUscita() + "/" + mioBeB.getMeseUscita() + "/" + mioBeB.getAnnoUscita());
                    if (mioBeB.getAnnoUscita() > mioBeB.getAnnoIngresso()
                            || mioBeB.getAnnoUscita() == mioBeB.getAnnoIngresso()
                                    && mioBeB.getMeseUscita() > mioBeB.getMeseIngresso()
                            || mioBeB.getAnnoUscita() == mioBeB.getAnnoIngresso()
                                    && mioBeB.getMeseUscita() == mioBeB.getMeseIngresso()
                                    && mioBeB.getGiornoUscita() > mioBeB.getGiornoIngresso()) {
                        break;
                    }

                }

            }

            System.out.println();
            mioBeB.setRecapito();
            System.out.println();
            lista.add(mioBeB);

            System.out.println("Vuoi continuare? S/N: ");
            switch (inputTesti.nextLine().toUpperCase().charAt(0)) {
                case 'N':
                    continua = false;
                    break;
                case 'S':
                    continua = true;
                    break;
                default:
                    System.out.println("Risposta non valida!");
                    continua = false;
                    break;
            }

        }

        do {
            try {
                System.out.println("ID della prenotazione: ");
                int id = inputNumeri.nextInt();
                if (id >= 1 && id <= lista.size()) {
                    Prenotazioni prenotazioniTrovate = lista.get(id - 1);
                    System.out.println("Prenotazione trovata: ");
                    System.out.println("Nome e cognome: " + prenotazioniTrovate.getNomeCognome());
                    System.out.println("Data di Ingresso: " + prenotazioniTrovate.getGiornoIngresso()
                            + "/" + prenotazioniTrovate.getMeseIngresso() + "/"
                            + prenotazioniTrovate.getAnnoIngresso());
                    System.out.println("Data di Uscita: " + prenotazioniTrovate.getGiornoUscita()
                            + "/" + prenotazioniTrovate.getMeseUscita() + "/" + prenotazioniTrovate.getAnnoUscita());
                    System.out.println("Recapito Telefonico: " + prenotazioniTrovate.getRecapito());
                    System.out.println("Prenotazione effettuata con successo!");
                    System.out.println();
                } else {
                    System.out.println("La prenotazione non esiste o è fallita!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("La prenotazione non esiste o è fallita!");
            } catch (InputMismatchException er) {
                System.out.println("La prenotazione non esiste o è fallita!");
            } catch (Exception se) {
                System.out.println("La prenotazione non esiste o è fallita!");
            }

            System.out.println("Vuoi cercare un'altra prenotazione? S/N: ");
            switch (inputTesti.nextLine().toUpperCase().charAt(0)) {
                case 'N':
                    continua = false;
                    System.out.println("Arrivederci!");
                    break;
                case 'S':
                    continua = true;
                    break;
                default:
                    System.out.println("Risposta non valida! Arrivederci!");
                    continua = false;
            }
        } while (continua);

        inputNumeri.close();
        inputTesti.close();
    }

}
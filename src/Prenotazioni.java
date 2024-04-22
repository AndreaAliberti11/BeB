import java.util.InputMismatchException;
import java.util.Scanner;

public class Prenotazioni {

    private String nomeCognome;
    private int giornoIngresso;
    private int meseIngresso;
    private int annoIngresso;
    private int giornoUscita;
    private int meseUscita;
    private int annoUscita;
    private String recapito;

    public Prenotazioni(String nomeCognome, int giornoIngresso, int meseIngresso, int annoIngresso, int giornoUscita,
            int meseUscita, int annoUscita, String recapito) {
        this.nomeCognome = nomeCognome;
        this.giornoIngresso = giornoIngresso;
        this.meseIngresso = meseIngresso;
        this.annoIngresso = annoIngresso;
        this.giornoUscita = giornoUscita;
        this.meseUscita = meseUscita;
        this.annoUscita = annoUscita;
        this.recapito = recapito;
    }

    public Prenotazioni() {
    }

    Scanner inputNumeri = new Scanner(System.in);
    Scanner inputTesti = new Scanner(System.in);

    // Inizio Incapsulamento
    public void setNomeCognome() {
        boolean continua = true;
        do {
            try {
                
            System.out.println("Inserisci Nome e Cognome: ");
            nomeCognome = inputTesti.nextLine();

                if (nomeCognome.length() >= 8) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il nome e cognome devono contenere almeno 8 caratteri.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.print("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setGiornoIngresso() {
        boolean continua = true;

        do {
            try {
                giornoIngresso = inputNumeri.nextInt();

                if (giornoIngresso >= 1 && giornoIngresso <= getMese(meseIngresso)) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il giorno di ingresso non è valido per il mese inserito.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.print("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getGiornoIngresso() {
        return giornoIngresso;
    }

    public void setMeseIngresso() {
        boolean continua = true;

        do {
            try {
                meseIngresso = inputNumeri.nextInt();

                if (meseIngresso >= 1 && meseIngresso <= 12) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il mese di ingresso deve essere compreso tra 1 e 12.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getMeseIngresso() {
        return meseIngresso;
    }

    public void setAnnoIngresso() {
        boolean continua = true;

        do {
            try {
                System.out.println("Inserire data di Ingresso (anno, mese, giorno): ");
                annoIngresso = inputNumeri.nextInt();

                if (annoIngresso >= 2024 && annoIngresso <= 2030) {
                    continua = false;
                } else {
                    throw new InputMismatchException("L'anno di ingresso deve essere compreso tra 2024 e 2030.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getAnnoIngresso() {
        return annoIngresso;
    }

    public void setGiornoUscita() {
        boolean continua = true;

        do {
            try {
                giornoUscita = inputNumeri.nextInt();

                if (giornoUscita >= 1 && giornoUscita <= getMese(meseUscita)) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il giorno di ingresso non è valido per il mese inserito.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getGiornoUscita() {
        return giornoUscita;
    }

    public void setMeseUscita() {
        boolean continua = true;

        do {
            try {
                meseUscita = inputNumeri.nextInt();

                if (meseUscita >= 1 && meseUscita <= 12) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il mese di uscita deve essere compreso tra 1 e 12.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getMeseUscita() {
        return meseUscita;
    }

    public void setAnnoUscita() {
        boolean continua = true;

        do {
            try {
                System.out.println("Inserire data di Uscita (anno, mese, giorno): ");
                annoUscita = inputNumeri.nextInt();

                if (annoUscita >= 2024 && annoUscita <= 2030) {
                    continua = false;
                } else {
                    throw new InputMismatchException("L'anno di uscita deve essere compreso tra 2024 e 2030.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setRecapito() {
        boolean continua = true;

        do {
            try {
            System.out.println("Inserire Recapito Telefonico: ");
            recapito = inputTesti.nextLine();

                if (recapito.length() >= 10) {
                    continua = false;
                } else {
                    throw new InputMismatchException("Il recapito deve contenere almeno 10 caratteri.");
                }
            } catch (InputMismatchException e) {
                System.out.print("Errore: " + e.getMessage());
                inputTesti.nextLine();
            } catch (Exception se) {
                System.out.println("Errore: " + se.getMessage());
                inputTesti.nextLine();
            }

        } while (continua);

    }

    public String getRecapito() {
        return recapito;
    }
    // Fine Incapsulamento

    public int getMese(int mese) {

        switch (mese) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
               return 28;
            case 4, 6, 9, 11:
                return 30;
            default:
                System.out.println("Il mese non corrisponde con il giorno!!");
                return 0;
        }
   
    }

}

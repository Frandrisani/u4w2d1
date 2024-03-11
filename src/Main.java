import Esercizio2.LitriKilometri;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scegli l'esercizio: 0 per l'esercizio 0, 1 per l'esercizio 1, 2 per l'esercizio 2, 3 per l'esercizio 3");
        int esercizio = Integer.parseInt(sc.nextLine());
        switch (esercizio) {
            case 0:
                //Esercizio 0 - Prendere dimestichezza col debugger, impostare qualche breakpoint e sfruttare l’esecuzione Step-by-step
                Scanner sca = new Scanner(System.in);
                try {
                    System.out.println("Inserisci un numero");
                    int x = sca.nextInt();
                    System.out.println("Inserisci un altro numero");
                    int y = sca.nextInt();
                    int z = x / y;
                    System.out.println("Il risultato della divisione è: " + z);
                } catch (ArithmeticException e) {
                    System.err.println("Non puoi dividere per zero");
                } finally {
                    System.out.println("Calcolo eseguito perfettamente. L'applicazione ora verrà chiusa");
                }
                break;
            case 1:
                //Esercizio 1
                 int[] array = new int [5];
                boolean continua =  true;

                 Random rand = new Random();
                 for (int i = 0; i < array.length; i++) {
                     array[i] = rand.nextInt(10) +1 ;
                 }

                System.out.println("Array generato: ");
                 for (int i = 0; i < array.length; i++) {
                     System.out.println(array[i] + "");
        }
                 Scanner scc = new Scanner(System.in);
                 do {
                     System.out.println("Inserisci il numero da selezionare presente nella lista sopra o 0 per uscire: ");
                     int n = scc.nextInt();
                     if (n == 0) {continua = false;}
                     else{
                         for (int i = 0; i < array.length; i++) {
                             if (array[i] == n) {
                                 System.out.println("Il numero " + n + " è presente nella lista e si trova nella posizione " + i);
                                 System.out.println("In quale nuova posizione da 1 a 5 vuoi spostarlo?");
                                 int b = scc.nextInt();
                                 if (b > 5 || b < 1) {                                 System.out.println("Inserisci un numero valido");
                             } else {
                                     int nuovoValore = array[i];
                                     int vecchioValore = array[b - 1];
                                     array[b - 1] = nuovoValore;
                                     array[i] = vecchioValore;
                                     System.out.println("Array modificato: ");
                                     for (int j = 0; j < array.length; j++) {
                                         System.out.println(array[j]);
                             }
                             }
                         }
                     }
                 }}while (continua == false );

                break;
            case 2:
                //Esercizio 2
                Scanner scb = new Scanner(System.in);
                LitriKilometri litriKilometri = new LitriKilometri();
                System.out.println("BENVENUTI NEL CALCOLATORE DEL CONSUMO CARBURANTE");
                System.out.println("Inserisci la distanza percorsa in chilometri: ");
                litriKilometri.setKilometri(scb.nextInt());
                System.out.println("Inserisci il numero di litri di gasolio consumati: ");
                litriKilometri.setLitri(scb.nextInt());
                System.out.println("Il consumo di carburante è di: " + litriKilometri.kilometriAlLitro() + "litri per 100km");
                break;
            case 3:
                //Esercizio 3
                break;
            default:

        }
    }
}

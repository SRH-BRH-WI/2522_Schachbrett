import java.util.Scanner;

public class Schachbrett {

    // Eingabe: Größe des Schachbretts: 8
    // Ausgabe:
    //  1  2  3  4  5  6  7  8
    //  2  3  4  5  6  7  8  9
    //  3  4  5  6  7  8  9 10
    //  4  5  6  7  8  9 10 11
    //  5  6  7  8  9 10 11 12
    //  6  7  8  9 10 11 12 13
    //  7  8  9 10 11 12 13 14
    //  8  9 10 11 12 13 14 15

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Größe des Schachbretts: ");
        int größe = eingabe.nextInt();

        for (int zeile=1; zeile <= größe; zeile++) {

            for (int spalte =zeile; spalte < größe+zeile; spalte++) {
                if (spalte < 10) System.out.print(" ");
                System.out.print(" " + spalte);
            }
            System.out.println();
        }

    }

    public static void main2(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Größe des Schachbretts: ");
        int größe = eingabe.nextInt();

        for (int zeile = 1; zeile <= größe; zeile++) {
            for (int spalte = 0; spalte < größe; spalte++) {
                int wert = zeile + spalte;
                if (wert < 10) System.out.print(" ");
                System.out.print(" " + wert);
            }
            System.out.println();
        }
    }
}

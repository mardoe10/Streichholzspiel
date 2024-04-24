public class Ausgabe {


    //Aufgabe 2 Klasse Ausgabe mit Methoden

    public static void zahlEingeben(){
        System.out.println("Bitte geben sie eine Zahl 1 bis 3 ein: ");
    }

    public static void keineZahl(){
        System.out.println("Das ist keine Zahl!");
    }

    public static void zahlNichtImBereich(){
        System.out.println("Die Eingegebene Zahl liegt nicht im gültigen Bereich!");
    }

    public static void menschGewinnt(){
        System.out.println("Herzlichen Glückwunsch! Du hast gewonnen!");
    }

    public static void computerGewinnt(){
        System.out.println("Der Computer hat gewonnen!  Vieleicht klappts ja beim nächsten mal!");
    }


    public static void zugNichtMoeglich(){
        System.out.println("Der Zug ist nicht möglich! Bitte geben sie eine gültige Zahl ein!");
    }


    public static void spielStand(int anzahlStreichhoelzer){
        System.out.println("Es sind noch " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch!");
    }

    public static void menschZug(int gezogeneStreichhoelzer, int anzahlStreichhoelzer){
        System.out.println("Du hast " + gezogeneStreichhoelzer + " Streichhölzer gezogen! Es sind noch " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch!");
    }

    public static void computerZug(int gezogeneStreichhoelzer, int anzahlStreichhoelzer){
        System.out.println("Der Computer hat " + gezogeneStreichhoelzer + " Streichhölzer gezogen! Es sind noch " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch!");
    }



}

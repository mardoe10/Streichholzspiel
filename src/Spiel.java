import java.util.Random;

public class Spiel {

    // Aufgabe 1 Klasse Spiel mit Variablen und Methoden ohne Inhalte
    private int anzahlStreichhoelzer;

    

    public Spiel(int anzahlStreichhoelzer){
        this.anzahlStreichhoelzer = anzahlStreichhoelzer;
    }

    public void starteSpiel(){
        while(anzahlStreichhoelzer > 0){
            menschZiehen();
            if(anzahlStreichhoelzer <= 1){
                Ausgabe.menschGewinnt();
                break;
            } computerZiehen();
            if(anzahlStreichhoelzer <= 1){
                Ausgabe.computerGewinnt();
                break;
            }
        }
    }
    
    
    
    //Computer zieht zufällig 1-3 Streichhölzer
    public void computerZiehen(){
        
        int gezogeneStreichhoelzer = berechneComputerZug();
        anzahlStreichhoelzer -= gezogeneStreichhoelzer;
        Ausgabe.computerZug(gezogeneStreichhoelzer, anzahlStreichhoelzer);
    }


    //Mensch zieht 1-3 Streichhölzer
    public void menschZiehen(){
        int gezogeneStreichhoelzer = Eingabe.leseHoelzer();
        
        if( gezogeneStreichhoelzer > anzahlStreichhoelzer){
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        } else{
            anzahlStreichhoelzer -= gezogeneStreichhoelzer;
            Ausgabe.menschZug(gezogeneStreichhoelzer, anzahlStreichhoelzer);
        }

    }


    //Berechnet den Computerzug
    private int berechneComputerZug(){
        Random random = new Random();

        if(anzahlStreichhoelzer == 1){
            return 1;
        } else{
            return random.nextInt(3) + 1;
        }
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;   

public class Eingabe {

    //Aufgabe 3 Klasse Eingabe Anlegen und Methoden erstellen

    int zahl;

   //Methode in der die Eingabe des Menschen aus der Konsole eingelesen wir
   public static int leseZahl(){
        Ausgabe.zahlEingeben();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = reader.readLine();
            while(!istZahl(input)){
                Ausgabe.keineZahl();
                Ausgabe.zahlEingeben();
                input = reader.readLine();
            }
            return Integer.parseInt(input);
        } catch(IOException e){
            Ausgabe.keineZahl();
            return leseZahl();
        }
   }

   private static boolean istZahl(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
   }


   public static int leseHoelzer(){
        int zahl;

        do{
            zahl = leseZahl();
            if(zahl < 1 || zahl > 3){
                Ausgabe.zahlNichtImBereich();
            }
        } while(zahl < 1 || zahl > 3);
        return zahl;
   }


}

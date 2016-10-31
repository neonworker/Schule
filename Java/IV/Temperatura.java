import java.util.*;
import java.io.*;
 
 public class Temperatura{
 
   public static void main (String args[]) throws IOException {
     
     String zeileninhalt, datum;
    
     double curr = 0;
     double max = 0;
     double min = 1000;
     double all = 0;
     double durchschnitt = 0;
     int counter = 0;
     
     Scanner datei = new Scanner(new File("Werte.txt"));
     PrintStream ausgabe = new PrintStream (new File ("Ausgabe.txt"));

             while (datei.hasNextLine()) 
             {     
                   zeileninhalt = datei.nextLine();
                   Scanner zeile = new Scanner(zeileninhalt);
                   
                   datum = zeile.next();
                   
                         while (zeile.hasNextDouble()) 
                         { 
                               curr = zeile.nextDouble();
                               
                               if (curr>max) 
                               {
                                  max = curr;
                               }
                               if(curr<min) 
                               {
                                  min = curr;
                               }
                               
                               all = all + curr;
                               counter++;
                         }
                     
                   durchschnitt = all / counter;
                   
                   ausgabe.println("Auswertung for den: " + datum);
                   ausgabe.println("Das Minimum ist: " + min);
                   ausgabe.println("Das Maximum ist: " + max);
                   ausgabe.println("Der Mittelwert ist: " + durchschnitt);
                   ausgabe.println("===========================");
             }
             
             ausgabe.close();
             
 }
}            
              
   
import java.util.*;
/**
 * Created by kdl on 15.08.2016.
 */
public class TempLelUND {
    public static void main(String[] args) {
        double temp1; //erste gemessene Temperatur
        String uhrzeit1; //Uhrzeit von temp1

        double temp2; // zweite gemessene Temperatur
        String uhrzeit2; //Uhrzeit von temp2

        double temp3; // dritte gemessene Temperatur
        String uhrzeit3;//Uhrzeit von temp3

        double quotient; //durchnittliche Temperatur

        double topTemp = 0;
        String topTime = "";

        double minTemp = 0;
        String minTime = "";

        Scanner tastatur; //Scanner initalisieren
        tastatur = new Scanner(System.in); //Scanner Bibliotheksmethode zuweisen

        System.out.println("Bitte Uhrzeit der gemessen Temperatur eingeben:");
        uhrzeit1 = tastatur.next();
        System.out.println("Bitte gemessene Temperatur eingeben:");
        temp1 = tastatur.nextDouble();

        System.out.println("Bitte Uhrzeit der gemessen Temperatur eingeben:");
        uhrzeit2 = tastatur.next();
        System.out.println("Bitte gemessene Temperatur eingeben:");
        temp2 = tastatur.nextDouble();

        System.out.println("Bitte Uhrzeit der gemessen Temperatur eingeben:");
        uhrzeit3 = tastatur.next();
        System.out.println("Bitte gemessene Temperatur eingeben:");
        temp3 = tastatur.nextDouble();

        //Berechnung der geringsten Temperatur und Ausgabeschleife

        if ((temp1 < temp2) && (temp1 < temp3)){
            minTemp = temp1;
            minTime = uhrzeit1;
        }
        else if ((temp2 < temp1) && (temp2 < temp3)){
            minTemp = temp2;
            minTime = uhrzeit2;
        }
        else{
            minTemp = temp3;
            minTime = uhrzeit3;
        }

        System.out.println("Die geringste Temperatur wurde um " + minTime + " gemessen und beträgt " + minTemp + "°C.");

        //Berechnugn der höchsten Temperatur und Ausgabeschleife

        if ((temp1 > temp2) && (temp1 > temp3)){
            topTemp = temp1;
            topTime = uhrzeit1;
        }
        else if ((temp2 > temp1) && (temp2 > temp3)){
            topTemp = temp2;
            topTime = uhrzeit2;
        }
        else{
            topTemp = temp3;
            topTime = uhrzeit3;
        }

        System.out.println("Die höchste Temperatur wurde um " + topTime + " gemessen und beträgt" + topTemp + "°C.");

        //Berechnung der durchschnittlichen Temperatur und Ausgabe

        quotient = (temp1+temp2+temp3)/3;
        quotient = Math.round(100.0 * quotient) / 100.0;
        System.out.println("Die durchschnittliche Temperatur beträgt: " + quotient + "°C.");
    }
}

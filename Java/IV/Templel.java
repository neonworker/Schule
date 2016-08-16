import java.util.*;
/**
 * Created by kdl on 15.08.2016.
 */
public class Templel {
    public static void main(String[] args) {
        double temp1; //erste gemessene Temperatur
        String uhrzeit1; //Uhrzeit von temp1

        double temp2; // zweite gemessene Temperatur
        String uhrzeit2; //Uhrzeit von temp2

        double temp3; // dritte gemessene Temperatur
        String uhrzeit3;//Uhrzeit von temp3

        double quotient; //durchnittliche Temperatur

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
            System.out.println("Die geringste Temperatur wurde um " + uhrzeit1 + " gemessen und beträgt " + temp1 + "°C.");
        }
        else if ((temp2 < temp1) && (temp2 < temp3)){
            System.out.println("Die geringste Temperatur wurde um " + uhrzeit2 + " gemessen und beträgt " + temp2 + "°C.");
        }
        else{
            System.out.println("Die geringste Temperatur wurde um " + uhrzeit3 + " gemessen und beträgt " + temp3 + "°C.");
        }

        //Berechnugn der höchsten Temperatur und Ausgabeschleife

        if ((temp1 > temp2) && (temp1 > temp3)){
            System.out.println("Die höchste Temperatur wurde um " + uhrzeit1 + " gemessen und beträgt " + temp1 + "°C.");
        }
        else if ((temp2 > temp1) && (temp2 > temp3)){
            System.out.println("Die höchste Temperatur wurde um " + uhrzeit2 + " gemessen und beträgt " + temp2 + "°C.");
        }
        else{
            System.out.println("Die höchste Temperatur wurde um " + uhrzeit3 + " gemessen und beträgt " + temp3 + "°C.");
        }

        //Berechnung der durchschnittlichen Temperatur und Ausgabe

        quotient = (temp1+temp2+temp3)/3;
        quotient = Math.round(100.0 * quotient) / 100.0;
        System.out.println("Die durchschnittliche Temperatur beträgt: " + quotient + "°C.");
    }
}

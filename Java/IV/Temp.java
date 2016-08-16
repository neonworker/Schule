import javax.swing.*;

/**
 * Created by kdl on 15.08.2016.
 */
public class Temp {
    public static void main(String[] args) {
        double temp1; //erste gemessene Temperatur
        String uhrzeit1; //Uhrzeit von temp1

        double temp2; // zweite gemessene Temperatur
        String uhrzeit2; //Uhrzeit von temp2

        double temp3; // dritte gemessene Temperatur
        String uhrzeit3;//Uhrzeit von temp3

        double min;//geringste Temperatur
        double max; //höchste Temperatur
        double quotient; //durchnittliche Temperatur

        uhrzeit1 = JOptionPane.showInputDialog("Bitte Uhrzeit eingeben");
        temp1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte erste gemessene Temperatur eingeben:"));

        uhrzeit2 = JOptionPane.showInputDialog("Bitte Uhrzeit eingeben");
        temp2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte zweite gemessene Temperatur eingeben:"));

        uhrzeit3 = JOptionPane.showInputDialog("Bitte Uhrzeit eingeben");
        temp3 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte dritte gemessene Temperatur eingeben:"));

        //Berechnung der geringsten Temperatur und Ausgabeschleife

        min = Math.min(temp1, Math.min(temp2, temp3));

        if (min==temp1){
            JOptionPane.showMessageDialog(null, "Die geringste Temperatur wurde um " + uhrzeit1 + " gemessen und beträgt " + temp1 + "°C.");
        }
        else if (min==temp2){
            JOptionPane.showMessageDialog(null, "Die geringste Temperatur wurde um " + uhrzeit2 + " gemessen und beträgt " + temp2 + "°C.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Die geringste Temperatur wurde um " + uhrzeit3 + " gemessen und beträgt " + temp3 + "°C.");
        }

        //Berrechnung der höchsten Temperatur und Ausgabeschleife

        max = Math.max(temp1, Math.max(temp2, temp3));

        if (max==temp1){
            JOptionPane.showMessageDialog(null, "Die höchste Temperatur wurde um " + uhrzeit1 + " gemessen und beträgt " + temp1 + "°C.");
        }
        else if (max==temp2){
            JOptionPane.showMessageDialog(null, "Die höchste Temperatur wurde um " + uhrzeit2 + " gemessen und beträgt " + temp2 + "°C.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Die höchste Temperatur wurde um " + uhrzeit3 + " gemessen und beträgt " + temp3 + "°C.");
        }

        //Berechnung und Ausgabe der Durchschnittstemperatur

        quotient = (temp1+temp2+temp3)/3;
        JOptionPane.showMessageDialog(null, "Die durchschnittliche Temperatur beträgt: " + quotient + "°C.");
    }
}

import javax.swing.*;

/**
 * Created by berti on 19.10.2015.
 */
public class Max3if {
  
  public static void main(String[] args) {
    
    
    double a = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte ganzzahligen Wert eingeben:"));
    double b = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte ganzzahligen Wert eingeben:"));
    double c = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( null, "Bitte ganzzahligen Wert eingeben:"));
    
    double min = Math.min(a, Math.min(b,c)); //bibliotheksmethode
    JOptionPane.showMessageDialog( null, min);
    
    if ((a > b) && (a > c)) {
      JOptionPane.showMessageDialog( null, "Die groesste Zahl ist " + a + ".");
    }
    
    if ((b > a) && (b > c)) {
      JOptionPane.showMessageDialog( null, "Die groesste Zahl ist " + b + ".");
    }
    
    if ((c > a) && (c > b)) {
      JOptionPane.showMessageDialog (null, "Die groesste Zahl ist " + c + ".");
    }
    
  }
  
}

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Podaj liczbe 1 "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Podaj liczbe 2 "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Podaj liczbe 3 "));

        int max;
        if (a >b){
            max =a;
        }
        else
            max = b;
        if ( max > c){
            JOptionPane.showMessageDialog(null,"Maksymalna liczba to   "+max);
        }
        else
            JOptionPane.showMessageDialog(null,"Maksymalna liczba to   "+c);
        JOptionPane.showConfirmDialog(null,  "DUPA");

    }
}

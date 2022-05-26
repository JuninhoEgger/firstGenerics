package main;

import service.PrintService;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        PrintService<Integer> printService = new PrintService<>();

        int n = parseInt(showInputDialog("HOW MANY VALUES?"));

        for (int i = 0; i < n; i++) {
            Integer value = valueOf(showInputDialog((i + 1) + "º VALUE"));
            printService.addValue(value);
        }

        printService.print();
        Integer x = printService.first();
        showMessageDialog(null, "FIRST: " + x);
    }
}

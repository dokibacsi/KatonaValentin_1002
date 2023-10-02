package kiccica;

import java.util.Scanner;

public class Kiccica {
    Scanner scn = new Scanner(System.in);
    String[] pakli = new String[22];

    public static void main(String[] args) {
        Kiccica kc = new Kiccica();
        kc.inito();
    }
    
    private void inito(){
        bekeres();
        pakliFeltolt();
        kiirat();
        ezVolt();
    }

    private void bekeres() {
        System.out.println("Add meg az oszlop számát: (1-3)");
        int szam = scn.nextInt();
        boolean ertekKozott = szam >= 1 && szam <= 3;
        
        while(!ertekKozott){
            System.out.println("Add meg az oszlop számát: (1-3)");
            szam = scn.nextInt();
            ertekKozott = szam >= 1 && szam <= 3;
        }
    }
    
    private void pakliFeltolt(){
        String[] szinek = {"Piros", "Tök", "Zöld", "Makk"};
        String[] jelek = {"Ász", "Felső", "Alsó", "X", "IX", "VIII"};
        
        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < jelek.length; j++) {
                pakli[i] += szinek[i]+jelek[j];
            }
        }
        
        System.out.println(pakli);
        
    }
    
    private void kiirat() {
        
    }

    private void ezVolt() {
        
    }
}

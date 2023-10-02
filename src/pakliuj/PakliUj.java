package pakliuj;

import java.util.Scanner;

public class PakliUj {
    Scanner scn = new Scanner(System.in);
    String[] pakli = new String[22];

    public static void main(String[] args) {
        PakliUj kc = new PakliUj();
        kc.inito();
    }
    
    private void inito(){
        pakliFeltolt();
        kiirat();
        bekeres();
        keveres();
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
    }
    
    private void kiirat() {
        for (int i = 0; i < pakli.length; i++) {
            if(i % 3 == 0){
                System.out.print("\n");
            }
            System.out.print(pakli[i]);
        }
    }

    private void keveres() {
        String[] tomb = new String[22];
        
        switch(i){
            case 1:
                for (int i = 0; i < pakli.length; i++) {
                    tomb[7] = 20-(i-1)*3;
                    tomb[7-14] = 19-(i-1)*3;
                    tomb[14-21] = 21-(i-1)*3;
                }
            break;
            case 2:
                for (int i = 0; i < pakli.length; i++) {
                    tomb[7] = 19-(i-1)*3;
                    tomb[7-14] = 21-(i-1)*3;
                    tomb[14-21] = 20-(i-1)*3;
                }
            break;
            case 3:
                for (int i = 0; i < pakli.length; i++) {
                    tomb[7] = 20-(i-1)*3;
                    tomb[7-14] = 21-(i-1)*3;
                    tomb[14-21] = 19-(i-1)*3;
                }
            break;
        }
    }
    
    private void ezVolt(){
        System.out.println("A kigondolt lap ez volt:");
    }
}

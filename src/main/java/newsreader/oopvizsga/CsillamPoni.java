/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newsreader.oopvizsga;

/**
 *
 * @author ministar
 */
public class CsillamPoni {
    private String nev;
    private int csillamPont;
    
    public CsillamPoni(String nev, int csillamPont) {
        if(csillamPont < 0){throw new IllegalArgumentException("CsillamPont can't be -");}
        if(nev == null || nev.isEmpty()){throw new IllegalArgumentException("Nev can't be empty");}
        this.nev = nev;  //without "this." the "nev" parameter get's istselves value
        this.csillamPont = csillamPont;
    }
    public void adjCsillamot(int mennyiseg) {
        if(mennyiseg < 0){throw new IllegalArgumentException("CsillamPont can't be -");}
        csillamPont += mennyiseg;
    }
    public int getCsillamPont() {
    
        return csillamPont;
    }
    
    public String getNev()
    {
        return nev;
    }
    
    public String bemutatkozas() {
    
        return nev + ": " + csillamPont;
 }

}

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
    this.nev = nev;  //without "this." the "nev" parameter get's istselves value
    this.csillamPont = csillamPont;
    }
    public void adjCsillamot(int mennyiseg) {
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

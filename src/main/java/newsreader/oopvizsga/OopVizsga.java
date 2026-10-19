/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package newsreader.oopvizsga;

/**
 *
 * @author ministar
 */
public class OopVizsga {

    public static void main(String[] args) {
//        CsillamPoni p = new RepuloCsillamPoni(
//        "CsillamKapitan", 7, "lila");
//        p.adjCsillamot(3);
//        System.out.println(p.bemutatkozas());
        
        CsillamPoni csp = new CsillamPoni("Csillamom", 10);
        CsillamPoni rcsp = new RepuloCsillamPoni(
        "CsillamMester az Elso", 15, "kek");
        
        System.out.println(csp.bemutatkozas());
        System.out.println(rcsp.bemutatkozas());
    }
}

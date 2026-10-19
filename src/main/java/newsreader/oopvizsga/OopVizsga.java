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
        
        CsillamPoni csp = new CsillamPoni("Csillamom", 10); //declaring a new CsillamPoni object
        CsillamPoni rcsp = new RepuloCsillamPoni(
        "CsillamMester az Elso", 15, "kek");  //declaring a new RepuloCsillamPoni object
        
        System.out.println(csp.bemutatkozas());
        System.out.println(rcsp.bemutatkozas());
        
        int[] napiPontok = {4, 7, 9, 9, 8, 2, 10};
        System.out.println(leghosszabbCsillamSorozat(napiPontok, 8));
    }
    
    public static int leghosszabbCsillamSorozat(
            int[] napiPontok, int minimum)
    {
        int length = 0; //the temporary length of the values that were bigger, than the minimum
        int maxi = 0; //the maximum length of the values that were bigger, than the minimum
        for(int i : napiPontok)
        {
            if(i >= minimum)
            {
                length++;
                if(maxi < length)
                {
                    maxi = length;
                }
            }
            else length = 0;
        }
        return maxi;
    }
}

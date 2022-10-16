/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.Comparator;

/**
 *
 * @author manel
 */

/* De la documentació de la interfície Comparador:
*
* Compares its two arguments for order.  Returns a negative integer,
* zero, or a positive integer as the first argument is less than, equal
* to, or greater than the second.<p>
*/
public class ComparadorAvionsPerHoresVol implements Comparator<Avio>{

    @Override
    public int compare(Avio a1, Avio a2) {
        int ret = 0;
        
        if (a1.getHoresVol() == a2.getHoresVol()) ret = 0; 
                else if (a1.getHoresVol() < a2.getHoresVol()) ret = -1;
                    else if (a1.getHoresVol() > a2.getHoresVol()) ret = 1;
        
        return ret;
        
    }
}

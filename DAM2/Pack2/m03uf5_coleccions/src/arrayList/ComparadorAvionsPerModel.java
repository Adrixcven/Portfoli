/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

import java.util.Comparator;
import arrayList.Avio;

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
public class ComparadorAvionsPerModel implements Comparator<Avio>{

    @Override
    public int compare(Avio a1, Avio a2) {
        return a1.getModel().compareTo(a2.getModel());
    }
}

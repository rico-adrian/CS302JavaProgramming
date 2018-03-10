package asd;

/*  * 14E1 contains  */
import java.util.Iterator;
/**
 * * * @author lulofse
 */
import java.lang.Object;
import java.util.ArrayList;

public class HashLib {

    ArrayList<Object> collection = new ArrayList<Object>();

    // Sequential Search
    /*
	 * Determines if this AbstractCollection object contains a specified
	 * element. The worstTime(n) is O(n).
	 * 
	 * @param obj � the element searched for in this AbstractCollection object.
	 * 
	 * @return true � if this AbstractionCollection object contains obj;
	 * otherwise, return false.
     */
    public boolean contains(Object obj) {
        Iterator<Object> e = collection.iterator();
        if (obj == null) {
            while (e.hasNext()) {
                if (e.next() == null) {
                    return true;
                }
            }
        } // if obj == null  
        else {
            while (e.hasNext()) {
                if (obj.equals(e.next())) {
                    return true;
                }
            }
        } // obj != null 
        return false;
    } // method contains     

    /* add wrapper to the generic type used in this exercise     
	     *  @param obj � the element searched for in this     
	     *  AbstractCollection object.     
     */
    public void add(Object obj) {
        collection.add(obj);
    }

    public HashLib() {
    } // default constructor }
}

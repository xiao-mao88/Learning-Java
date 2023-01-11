package CookieOrderLab;
import java.util.ArrayList;

public class MasterOrder {
    private ArrayList<CookieOrder> order= new ArrayList<CookieOrder>(0);

    //constructors
    public MasterOrder () {
        ArrayList<CookieOrder> order= new ArrayList<CookieOrder>(0);
    }

    public MasterOrder (String variety, int numBoxes) {
        ArrayList<CookieOrder> order= new ArrayList<CookieOrder>(0);
        CookieOrder newCookie= new CookieOrder(variety, numBoxes);
        order.add(newCookie);
    }

    //add stuff
    public void addOrder (CookieOrder theOrder) {
        order.add(theOrder);
    }

    //total number of boxes
    public int getTotBoxes() {
        int totBoxes=0;
        for (int i=0; i<order.size(); i++) {
            totBoxes+= order.get(i).getNumBoxes();
        }
        return totBoxes;
    }

    //remove variety
    public int removeVariety (String cookieVar) {
        int removedBoxes=0;
        for (int i=order.size()-1; i>=0; i--) {
            if(cookieVar.equals(order.get(i).getVariety())){
                removedBoxes+=order.get(i).getNumBoxes();
                order.remove(i);
            }
        }
        return removedBoxes;
    }

    public String toString() {
        String result= "[";

        for(int i=0; i<order.size(); i++) {
            result+=order.get(i);
            if(i!=order.size()-1) {
                result+=", ";
            }
        }
        result+="]";
        return result;
    }
}
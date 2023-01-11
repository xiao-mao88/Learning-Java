package CookieOrderLab;

public class CookieTester {
    public static void main(String[] args) {
        MasterOrder myOrder = new MasterOrder();
        System.out.println ("There are " + myOrder.getTotBoxes() + " boxes of cookies" );
        myOrder.addOrder (new CookieOrder ("ThinMints", 1));
        myOrder.addOrder (new CookieOrder ("Tagalongs", 2));
        myOrder.addOrder (new CookieOrder ("ThinMints", 10));
        myOrder.addOrder (new CookieOrder ("Samoas", 4));
        myOrder.addOrder (new CookieOrder ("ShortBread", 5));
        myOrder.addOrder (new CookieOrder ("Samoas", 5));
        myOrder.addOrder (new CookieOrder ("ShortBread", 7));
        myOrder.addOrder (new CookieOrder ("ShortBread", 3));
        myOrder.addOrder (new CookieOrder ("Tagalongs", 6));
        System.out.println ("There are " + myOrder.getTotBoxes() + " boxes of cookies" );
        System.out.println ("Complete List - " + myOrder);
        System.out.println (myOrder.removeVariety ("Samoas") + " Samoas removed: " );
        System.out.println (myOrder.removeVariety("Tagalongs") + " Tagalongs removed. ");
        System.out.println (myOrder.removeVariety("ShortBread")+ " ShortBread removed. ");
        System.out.println (myOrder.removeVariety ("Trefoils") + " Trefoils removed. ");
        System.out.println ("There are " + myOrder.getTotBoxes() + " boxes of cookies" );
        System.out.println ("Complete list: " + myOrder);
    }
}

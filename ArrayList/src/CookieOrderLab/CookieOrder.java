package CookieOrderLab;

public class CookieOrder {
    private String cookieVariety;
    private int boxes;

    public CookieOrder (String variety, int numBoxes) {
        cookieVariety= variety;
        boxes= numBoxes;
    }

    public String getVariety() {
        String var= cookieVariety;
        return var;
    }

    public int getNumBoxes() {
        int numofboxes= boxes;
        return numofboxes;
    }

    public String toString() {
        return cookieVariety+ " " + boxes;
    }
}

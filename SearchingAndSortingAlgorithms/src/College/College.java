package College;

public class College {
    private String name;
    private int pop; // population

    public College (String n, int p) {
        name = n;
        pop = p;
    }

    public String getName() {
        return name;
    }
    public int getPop() {
        return pop;
    }
    public String toString () {
        return name + " " + pop;
    }
}

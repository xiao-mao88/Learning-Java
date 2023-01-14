package College;

import java.util.ArrayList;

public class CollegeTester {
    public static void sortByName(ArrayList<College> schools) {
        for (int i = 0; i < schools.size(); i++) {
            int index = i;
            for (int j = i + 1; j < schools.size(); j++) {
                if (schools.get(j).getPop() < schools.get(index).getPop()) {
                    index = j;
                }
            }
            College smallerSchool = schools.get(index);
            schools.set(index, schools.get(i));
            schools.set(i, smallerSchool);
        }
    }

    public static void sortByPopulation (ArrayList < College > schools) {
        for (int i = 0; i < schools.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < schools.size() - 1; j++) {
                int count = 0;
                String uni1 = schools.get(j).getName();
                String uni2 = schools.get(index).getName();
                boolean bleh = true;
                int compare = uni1.substring(count, count + 1).compareTo(uni2.substring(count, count + 1));

                //if the characters are the same
                while (compare == 0 && bleh == true) {
                    count++;
                    if (count >= uni1.length() - 1 || count >= uni2.length() - 1) {
                        if (uni1.length() < uni2.length()) {
                            index = j;
                            bleh = false;
                        }
                    }
                    compare = uni1.substring(count, count + 1).compareTo(uni2.substring(count, count + 1));
                }

                //when the characters are different
                if (compare < 0) {
                    index = j;
                }
            }
            College smallerSchool = schools.get(index);
            schools.set(index, schools.get(i));
            schools.set(i, smallerSchool);
        }
    }

    public static void main (String[] args){
        ArrayList <College> mySchools = new ArrayList <College>();
        mySchools.add(new College("NYU",51100));
        mySchools.add(new College("Ohio State",47000));
        mySchools.add(new College("Penn State",39800));
        mySchools.add(new College("U of Maryland",47000));
        mySchools.add(new College("RIT",18600));
        mySchools.add(new College("Rutgers",37400));
        mySchools.add(new College("Texas A&M",55600));
        mySchools.add(new College("Virginia Tech",30600));

        System.out.println(mySchools);// unsorted
        sortByName(mySchools);
        System.out.println(mySchools); //sorted

        sortByPopulation(mySchools);
        System.out.println(mySchools);
    }
}
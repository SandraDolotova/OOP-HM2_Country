import java.util.*;

/**
 * There is an interface Measurable:
 * public interface Measurable {
 * double getMeasure();
 * }
 * Write and test a method
 * public static Measurable maximum(Measurable[] objects)
 * that returns the object with the largest measure.
 * Use that method to determine the country with the largest area from an array of countries.
 */


public class Main {
    public static void main(String[] args) {


        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("China", 10.2));
        countryList.add(new Country("Germany", 4.4));
        countryList.add(new Country("Andorra", 1));
        System.out.println("List of countries:" + countryList);


        Measurable measurable = Country.maximum(countryList);
        System.out.println("The Larges country from the List: " + measurable);


    }


}

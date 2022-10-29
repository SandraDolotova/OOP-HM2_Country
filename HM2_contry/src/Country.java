import java.util.List;

public class Country implements Measurable {

    private String name;
    private double km;

    public Country(String name, double km) {
        this.name = name;
        this.km = km;
    }

    @Override
    public double getMeasure() {
        return km;
    }

    public static Measurable maximum(List<Country> objects){
        Measurable max = null;
        for (Measurable obj: objects) {
            if (max == null || obj.getMeasure() > max.getMeasure()){
                max = obj;
            }
        }
        return max;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", km=" + km +
                '}';
    }
}

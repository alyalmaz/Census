import java.util.ArrayList;

public class Municipality {
    private String name;
    private ArrayList<City> cities;

    public Municipality(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addCity(City city) { cities.add(city); }

    public int calculatePopulation() {
        int total = 0;
        for (City c : cities) total += c.getPopulation();
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ":\n");
        for (City c : cities) sb.append("  - ").append(c).append("\n");
        return sb.toString();
    }
}

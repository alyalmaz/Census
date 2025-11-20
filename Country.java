import java.util.ArrayList;

public class Country {
    private String name;
    private ArrayList<Province> provinces;

    public Country(String name) {
        this.name = name;
        this.provinces = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addProvince(Province p) { provinces.add(p); }

    public int calculateTotalPopulation() {
        int total = 0;
        for (Province p : provinces) total += p.calculatePopulation();
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Country: " + name + "\n");
        for (Province p : provinces) sb.append(p).append("\n");
        sb.append("Total population: ").append(calculateTotalPopulation());
        return sb.toString();
    }
}

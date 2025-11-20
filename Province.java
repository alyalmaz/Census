import java.util.ArrayList;

public class Province {
    private String name;
    private ArrayList<Municipality> municipalities;

    public Province(String name) {
        this.name = name;
        this.municipalities = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addMunicipality(Municipality m) { municipalities.add(m); }

    public int calculatePopulation() {
        int total = 0;
        for (Municipality m : municipalities) total += m.calculatePopulation();
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ":\n");
        for (Municipality m : municipalities) sb.append(m).append("\n");
        return sb.toString();
    }
}

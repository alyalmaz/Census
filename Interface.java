import java.util.Scanner;

public class Interface {
    private Country country;
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.print("Enter country name: ");
        country = new Country(sc.nextLine());

        int option;
        do {
            System.out.println("\n1. Add Province\n2. Show Summary\n0. Exit");
            option = sc.nextInt(); sc.nextLine();

            switch (option) {
                case 1 -> addProvince();
                case 2 -> System.out.println(country);
            }
        } while (option != 0);
    }

    private void addProvince() {
        System.out.print("Province name: ");
        Province p = new Province(sc.nextLine());
        country.addProvince(p);
        System.out.println("Province added!");
    }
}

import java.util.Scanner;

public class TestSolarSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// creates 3 SolarPanels objects
SolarPanels panel1 = new SolarPanels();
SolarPanels panel2 = new SolarPanels();
SolarPanels panel3 = new SolarPanels();

// get user input for panel 1
System.out.print("Enter name for Panel 1: ");
panel1.setName(scanner.nextLine());
System.out.print("Enter number of panels for Panel 1: ");
panel1.setNumber(scanner.nextInt());
System.out.print("Enter energy for Panel 1: ");
panel1.setEnergy(scanner.nextDouble());

// clear scanner buffer
scanner.nextLine();

// get user input for panel 2
System.out.print("Enter name for Panel 2: ");
panel2.setName(scanner.nextLine());
System.out.print("Enter number of panels for Panel 2: ");
panel2.setNumber(scanner.nextInt());
System.out.print("Enter energy for Panel 2: ");
panel2.setEnergy(scanner.nextDouble());

// clear scanner buffer
scanner.nextLine();

// get user input for panel 3
System.out.print("Enter name for Panel 3: ");
panel3.setName(scanner.nextLine());
System.out.print("Enter number of panels for Panel 3: ");
panel3.setNumber(scanner.nextInt());
System.out.print("Enter energy for Panel 3: ");
panel3.setEnergy(scanner.nextDouble());

// outputs the information for each panel
System.out.println(panel1);
System.out.println(panel2);
System.out.println(panel3);

// calculates the total energy production
double totalEnergyProduction = panel1.totalEnergy() + panel2.totalEnergy() + panel3.totalEnergy();

// outputs total energy production
System.out.println("Total Energy Production: " + totalEnergyProduction + " Watt/hour");

// closes the scanner
scanner.close();
}
}
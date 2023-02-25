/**

The SolarPanels class represents a solar panel with a name, number, energy, and a static loss rate.
*/
public class SolarPanels implements Comparable<SolarPanels> {

private String name; // the name of the solar panel
private int number; // the number of solar panels
private double energy; // the energy output of each solar panel
private static double lossRate = 0.05; // the static loss rate for all solar panels

/**

Default Constructor
*/
public SolarPanels() {
}
/**

Constructs a new SolarPanels object with the given name, number, and energy values.
@param name the name of the solar panel
@param number the number of solar panels
@param energy the energy output of each solar panel
*/
public SolarPanels(String name, int number, double energy) {
this.name = name;
this.number = number;
this.energy = energy;
}
/**

Returns the name of the solar panel.
@return the name of the solar panel
*/
public String getName() {
return name;
}
/**

Sets the name of the solar panel.
@param name the new name of the solar panel
*/
public void setName(String name) {
this.name = name;
}
/**

Returns the number of solar panels.
@return the number of solar panels
*/
public int getNumber() {
return number;
}
/**

Sets the number of solar panels.
@param number the new number of solar panels
*/
public void setNumber(int number) {
this.number = number;
}
/**

Returns the energy output of each solar panel.
@return the energy output of each solar panel
*/
public double getEnergy() {
return energy;
}
/**

Sets the energy output of each solar panel.
@param energy the new energy output of each solar panel
*/
public void setEnergy(double energy) {
this.energy = energy;
}
/**

Calculates and returns the total energy output of all solar panels, accounting for the static loss rate.
@return the total energy output of all solar panels
*/
public double totalEnergy() {
double lossAmount = lossRate * (number * 250);
return (number * 250) - lossAmount;
}
/**

Returns a string representation of the solar panel, including its name, number, energy output, and total energy output.
@return a string representation of the solar panel
*/
@Override
public String toString() {
return "Solar Panel: " + name + "\nNumber: " + number + "\nEnergy: " + energy + "\nTotal Energy: " + totalEnergy() + " Watt/hour\n";
}
/**

Compares this solar panel to another solar panel based on their energy output values.
@param o the solar panel to compare to
@return a negative integer, zero, or a positive integer as this solar panel is less than, equal to, or greater than the specified solar panel
*/
@Override
public int compareTo(SolarPanels o) {
return Double.compare(this.energy, o.energy);
}
}
/**
 * 
 * @author Keegan Henderson
 * MallClass decribes a mall and there variables
 */
public class MallClass extends BusinessClass {
	/**
	 * variables numRentedUnits, numParkingSpaces, and medianUnitSize
	 */
	private int numRentedUnits, numParkingSpaces;
	private double medianUnitSize;
	
	public MallClass(){
		
	}
	public MallClass(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	/**
	 * Draw method
	 * temporarily prints out "Drawing a 'obj'"
	 */
	public void Draw() {
		System.out.println("drawing a " + occupancyGroup);
	}
	
	/**
	 * displayData method displays all variables related to the mall.
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("");
		sb.append("===================================\n");
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: "+ completeAddress + "\n");
		sb.append("Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: "+ occupancyGroup + "\n");
		sb.append("Subgroup: "+ subgroup + "\n");
		sb.append("Rented Units: "+numRentedUnits+"\n");
		sb.append("Available Parking Spaces: "+numParkingSpaces+"\n");
		sb.append("Median Unit Size: "+medianUnitSize+ "\n");
		sb.append("===================================");
		String r = sb.toString();
		return r;
	}
	/**
	 * Getters and Setters for variables 
	 * numRentedUnits,numParkingSpaces, and medianUnitSize
	 * 
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	
	
}

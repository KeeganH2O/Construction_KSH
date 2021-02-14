/**
 * 
 * @author Keegan Henderson
 * Business Class is child of BuildingClass
 * 
 */
public class BusinessClass extends BuildingClass {
	/**
	 *	variables
	 */
	protected int numRentableUnits;
	
	/**
	 * BusinessClass empty Contructor 
	 * 
	 */
	public BusinessClass(){
		
	}
	/**
	 * BusinessClass Contructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public BusinessClass(String projectName, String completeAddress, double totalSquareFeet,String occupancyGroup, String subgroup){
		
	}
	
	/**
	 * Draw method
	 * temporarily prints out "Drawing a 'obj'"
	 */
	public void Draw() {
		System.out.println("drawing a " + occupancyGroup);
	}
	
	/**
	 * Prints out all the data for BusinessClass
	 */
	public String DisplayData() {
		StringBuilder sb = new StringBuilder("");
		/*
		sb.append("===================================\n");
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: "+ completeAddress + "\n");
		sb.append("Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: "+ occupancyGroup + "\n");
		sb.append("Subgroup: "+ subgroup + "\n");
		*/
		sb.append("Rentable Units: "+numRentableUnits+"\n");
		sb.append("===================================");
		String r = sb.toString();
		return r;
	}
	
	/**
	 * Getters and Setters for numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	
	
}

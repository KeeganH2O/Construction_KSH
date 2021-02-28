
public class ApartmentClass extends ResidentialClass {
	/**
	 * variables numRentableUnits, avgUnitSize, and parkingAvailable
	 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * ApartmentClass Constructor (empty)
	 */
	public ApartmentClass() {
		
	}
	/**
	 * ApartmentClass Contructor 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public ApartmentClass(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	/**
	 * draw method temp says drawing 'obj'
	 */
	public void Draw() {
		System.out.println("drawing a " + occupancyGroup);
	}
	/**
	 * displayData method displays all variables within the class
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("==========================================\n");
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: "+ completeAddress + "\n");
		sb.append("Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: "+ occupancyGroup + "\n");
		sb.append("Subgroup: "+ subgroup + "\n");
		sb.append("Number of Rentable Units: "+numRentableUnits+"\n");
		sb.append("Average Unit Size: "+avgUnitSize+"\n");
		sb.append("Parking Available: " +parkingAvailable+"\n");
		sb.append("==========================================");
		String r = sb.toString();
		return r;
	}
	
	/**
	 * Getters and Setters for numRentableUnits,avgUnitSize,parkingAvailable
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

}

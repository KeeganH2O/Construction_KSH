
public class ResidentialClass extends BuildingClass{
	/**
	 * variables: numBedrooms,numBathrooms, and laundryRoom
	 */
	protected int numBedrooms,numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * ResidentialClass constructor (empty)
	 */
	public ResidentialClass(){
		
	}
	
	/**
	 * ResidentialClass constructor includes:
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public ResidentialClass(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	/**
	 * Draw method: temp method to tell whats being drawn
	 */
	public void Draw() {
		System.out.println("drawing a " + occupancyGroup);
	}
	
	/**
	 * Prints out all the data for ResidentialClass
	 */
	public String DisplayData() {
		StringBuilder sb = new StringBuilder("");
		sb.append("===================================\n");
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: "+ completeAddress + "\n");
		sb.append("Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: "+ occupancyGroup + "\n");
		sb.append("Subgroup: "+ subgroup + "\n");
		sb.append("Ammount of Bedrooms: "+numBedrooms+"\n");
		sb.append("Ammount of Bathrooms: "+numBathrooms+"\n");
		sb.append("Has a Laundry Room: "+laundryRoom+"\n");
		sb.append("===================================");
		String r = sb.toString();
		return r;
	}

	/**
	 * Getters and Setters for numBedrooms,numBathrooms, and laundryRoom
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	

	
}

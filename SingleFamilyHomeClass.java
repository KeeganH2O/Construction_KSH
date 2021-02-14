
public class SingleFamilyHomeClass extends ResidentialClass{
	/**
	 * variable garage 
	 */
	private boolean garage;
	
	/**
	 * SingleFamilyHomeClass Constructor
	 */
	public SingleFamilyHomeClass(){
		
	}
	/**
	 * SingleFamilyHomeClass Constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public SingleFamilyHomeClass(String projectName, String completeAddress,double totalSquareFeet, String occupancyGroup, String subgroup) {
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
		sb.append("Ammount of Bedrooms: "+numBedrooms+"\n");
		sb.append("Ammount of Bathrooms: "+numBathrooms+"\n");
		sb.append("Has a Laundry Room: "+laundryRoom+"\n");
		sb.append("Garage: "+garage+"\n");
		sb.append("===================================");
		String r = sb.toString();
		return r;
	}
	/**
	 * getters and setters for garage
	 * @return
	 */
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
}

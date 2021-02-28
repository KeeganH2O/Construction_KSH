/**
 * @version 1.0
 * @author Keegan Henderson
 * the BuildingClass is the Super class
 */
public class BuildingClass {
	protected String projectName,completeAddress, occupancyGroup, subgroup;
	protected double totalSquareFeet;
	
	/**
	 * BuildingClass constructor
	 */
	public BuildingClass(){
		
	}
	
	/**
	 * BuildingClass constructor 
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public BuildingClass(String projectName,String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup){
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
	 * DisplayData method 
	 * displays project name, address,sq ft, occupancy group, and subgroup.
	 * @return
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("");
		sb.append("===================================\n");
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: "+ completeAddress + "\n");
		sb.append("Square Feet: " + totalSquareFeet + "\n");
		sb.append("Occupancy Group: "+ occupancyGroup + "\n");
		sb.append("Subgroup: "+ subgroup + "\n");
		sb.append("===================================");
		String r = sb.toString();
		return r;
	}
	
	/**
	 * Getters and Setters for:
	 * projectName
	 * completeAddress
	 * occupancyGroup
	 * Subgroup
	 * totalSquareFeet
	 * @return
	 */
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	
	
	
}//end BuildingClass Class

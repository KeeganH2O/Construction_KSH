
public class ContructionApplication {

	public static void main(String[] args) {
		
		BuildingClass Building = new BuildingClass("Test Project","10501 Edgewater rd.", 3000.0, "Residential", "R1");
		Building.Draw();
		System.out.println(Building.displayData());
		
		//Single Family Home Test
		SingleFamilyHomeClass SFH = new SingleFamilyHomeClass("Single Family Home", "10001 West pl.", 3500.0, "Residential", "R1");
		SFH.setNumBedrooms(4);
		SFH.setNumBathrooms(2);
		SFH.setLaundryRoom(true);
		SFH.setGarage(true);
		System.out.println(SFH.displayData());
		
		//Apartment Test
		ApartmentClass AC = new ApartmentClass("Apartment", "1001 East St.", 2000.0,"Residential", "R2");
		AC.setNumBedrooms(3);
		AC.setNumBathrooms(1);
		AC.setParkingAvailable(true);
		AC.setNumRentableUnits(12);
		AC.setAvgUnitSize(AC.getTotalSquareFeet()/AC.getNumRentableUnits());
		System.out.println(AC.displayData());
		
		//Mall Test
		MallClass MC = new MallClass("St.Matthews Mall", "50012 Shelbyville rd.", 100000.0, "Business", "B");
		MC.setNumRentedUnits(10);
		MC.setNumRentableUnits(11);
		MC.setNumParkingSpaces(1000);
		MC.setMedianUnitSize(MC.getTotalSquareFeet()/MC.getNumRentableUnits());
		System.out.println(MC.displayData());
	}

}

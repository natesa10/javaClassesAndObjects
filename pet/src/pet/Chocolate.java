package pet;

public class Chocolate {
	private String locationGrown;
	private String typeOfChocolate;
	private boolean hasNuts;
	
	public Chocolate() {
		this.locationGrown="";
		this.typeOfChocolate="";
		this.hasNuts=false;
	}
	public Chocolate(String locationGrown,String typeOfChocolate) {
		this.locationGrown=locationGrown;
		this.typeOfChocolate=typeOfChocolate;
		this.hasNuts=false;
	}
	public Chocolate(String locationGrown,String typeOfChocolate,boolean hasNuts) {
		this.locationGrown=locationGrown;
		this.typeOfChocolate=typeOfChocolate;
		this.hasNuts=hasNuts;
	}
	public String getLocationGrown() {
		return locationGrown;
	}
	public String getTypeOfChocolate() {
		return typeOfChocolate;
	}
	public boolean getHasNuts() {
		return hasNuts;
	}
	public void setLocationGrown(String newLoc) {
		locationGrown = newLoc;
	}
	public void setTypeOfChocolate(String newType) {
		typeOfChocolate = newType;
	}
	public void setHasNuts(boolean changeNuts) {
		hasNuts = changeNuts;
	}
}

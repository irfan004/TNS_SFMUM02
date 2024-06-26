package employee;

public class Manager extends Employees {

	private String MngrName;
	private int Rating;
	public String getMngrName() {
		return MngrName;
	}
	public void setMngrName(String mngrName) {
		MngrName = mngrName;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	
}

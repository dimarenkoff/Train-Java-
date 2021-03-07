package Train;

public class Bed{
	private int number;

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}

	private boolean nearWindow;
	public boolean getNearWindow() {return nearWindow;}
	public void setNearWindow(boolean nearWindow) {this.nearWindow = nearWindow;}

	private boolean reserved;
	public boolean getReserved() {return reserved;}
	public void setReserved(boolean reserved) {this.reserved = reserved;}

	public Bed(int number) {this.number=number;}
	public Bed(int number, boolean reserve) {this.number=number;this.reserved=reserve;}

}

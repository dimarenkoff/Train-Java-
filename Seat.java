package Train;

class Seat {
	
	private int number;

	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}

	private boolean nearWindow;
	public boolean getNearWindow() {return nearWindow;}
	public void setNearWindow(boolean nearWindow) {this.nearWindow = nearWindow;}

	private boolean reserved;
	public boolean getReserved() {return reserved;}
	public void setReserved(boolean reserved) {this.reserved = reserved;}

	public Seat(int number) {this.number=number;}
	public Seat(int number, boolean reserve) {this.number=number;this.reserved=reserve;}
	
	public String toString() {return "Misto: "+this.number;}
	
}

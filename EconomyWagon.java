package Train;

public class EconomyWagon extends PersonalWagon {
	private Person steward;
	public Person getSteward() {return steward;}
	public void setSteward(Person steward) {this.steward = steward;}
	
	public EconomyWagon(int number) {super(number);}
	public String toString(){return "Vagon typu: "+this.getClass().getSimpleName()+"Steward je: "+this.steward+", pocet sedadel: "+this.getNumberOfSeats();}	

}

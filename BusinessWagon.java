package Train;

public class BusinessWagon extends PersonalWagon {
		private Person steward;
		public Person getSteward() {return steward;}
		public void setSteward(Person steward) {this.steward = steward;}
		
		public BusinessWagon(int number) {super(number);}
		public String toString(){return "Vagon typu: "+this.getClass().getSimpleName()+" Steward "+this.steward+", pocet sedadel: "+this.getNumberOfSeats();}	

}

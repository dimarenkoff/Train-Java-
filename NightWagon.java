package Train;

import java.util.ArrayList;

public class NightWagon extends PersonalWagon {
		private ArrayList<Bed>beds=new ArrayList<Bed>();
		private Person steward;
		public Person getSteward() {return steward;}
		public void setSteward(Person steward) {this.steward = steward;}
		private int numberOfBeds;
		public int getNumberOfBeds() {return numberOfBeds;}
		public void setNumberOfBeds(int numberOfBeds) {this.numberOfBeds = numberOfBeds;}
		
		public NightWagon(int number, int numberBeds) {super(number);this.numberOfBeds=numberBeds; for(int i=1;i<=numberBeds;i++) {this.beds.add(new Bed(i));}}
		
		public String toString(){return "Vagon typu: "+this.getClass().getSimpleName()+"Steward je: "+this.steward+" pocet sedadel: "+this.getNumberOfSeats()+" Pocet luzek: "+this.numberOfBeds;}	

}

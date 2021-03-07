package Train;

public class Hopper {
	private double loadingCapacity;
	public double getLoadingCapacity() {return loadingCapacity;}
	public void setLoadingCapacity(int loadingCapacity) {this.loadingCapacity = loadingCapacity;}
	
	public Hopper(double capacity) {this.loadingCapacity=capacity;}
	public String toString(){return "Vagon typu: "+this.getClass().getSimpleName()+"Nosnost: "+this.loadingCapacity+"t";}
	public void ConnectWagon(Train vlak) {vlak.ConnectWagon(this);}
}

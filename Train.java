package Train;
import java.util.ArrayList;

class Train {
	
	private Locomotive lokomotiva;
	public Locomotive getLokomotiva() {return lokomotiva;}
	public void setLokomotiva(Locomotive lokomotiva) {this.lokomotiva = lokomotiva;}
	
	private ArrayList<Object>wagons=new ArrayList<Object>();
	public ArrayList<Object> getWagons() {return wagons;}
	public void setWagons(ArrayList<Object> wagons) {this.wagons = wagons;}

	public Train() {}
	public Train(Locomotive lokomotiva) {this.lokomotiva=lokomotiva;}
	public Train(Locomotive lokomotiva, ArrayList<Object> wagons) 
	{
		this.lokomotiva=lokomotiva; 
		if ((this.lokomotiva.engine.GetType()=="Parni")&&(wagons.size()<=5)) 
		{this.wagons=wagons;}
		else {System.out.println("K parni lokomotive nejde pripojit vic jak 5 vagonu");}
		
		if ((this.lokomotiva.engine.GetType()!="Parni")){this.wagons=wagons;}
		
	}
	public void ConnectWagon(Object wagon) 
	{
		if(this.lokomotiva.engine.GetType()!="Parni")
			{this.wagons.add(wagon);}
		else if((this.lokomotiva.engine.GetType()=="Parni")&&(wagons.size()<5))
			{this.wagons.add(wagon); }
		else if ((this.lokomotiva.engine.GetType()=="Parni")&&(wagons.size()>=5)){System.out.println("K parni lokomotive nejde pripojit vic jak 5 vagonu");}
		
	}
	public void Disconectwagon(Object wagon) {this.wagons.remove(wagon);}
	public void reserveSeat(int numberOfWagon, int numberOfChair) 
	{
		try 
		{
			PersonalWagon wagon=(PersonalWagon)this.wagons.get(numberOfWagon-1);
			Seat SeatReserve=wagon.getSeats().get(numberOfChair-1);
			if(SeatReserve.getReserved()==false)
			{
				SeatReserve.setReserved(true);
				System.out.println("Misto cislo "+SeatReserve.getNumber()+" rezervovano ve vagonu cislo: "+(numberOfWagon));
			}
			else { System.out.println("Sedadlo je jiz obsazene");}
			
		}
		catch (ClassCastException e) {{System.out.println("Do vagonu typu "+this.wagons.get(numberOfWagon-1).getClass().getSimpleName()+" Nelze pridat cestujiciho");}}
	}
		
	public String ListofReservedSeats() 
	{
		String s="Seznam rezervovanych mist:\n";
		for(int i=0;i<this.wagons.size();i++) 
		{
			if(!this.wagons.get(i).getClass().getSimpleName().equals("Hopper"))
			{
				PersonalWagon wagon=(PersonalWagon)this.wagons.get(i);
				for (int j=1;j<=wagon.getSeats().size();j++)
				{
					Seat sedadlo=wagon.getSeats().get(j-1);
					if (sedadlo.getReserved()==true)s+="Vagon cislo: "+(i+1)+" "+sedadlo.toString()+"\n";
				}
			}	
		}
		return s;
	}
	public String toString() 
	{
		String s= "Vlak se sklada z lokomotivy: "+this.lokomotiva+"\n";
		for (int i=1;i<=wagons.size();i++)
		{
			s+=i+this.wagons.get(i-1).toString()+"\n";
		}
	return s;	
	}
}

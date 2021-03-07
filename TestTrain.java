package Train;

import java.util.ArrayList;

public class TestTrain {

	public static void main(String[] args) {
		Engine Diesel=new Engine("Diesel");
		Engine Steam=new Engine("Parni");
		Engine Elektro=new Engine("Elektro");
		BusinessWagon b1=new BusinessWagon(25);
		b1.setSteward(new Person("Lenka", "Kozakova"));
		BusinessWagon b2=new BusinessWagon(25);
		b2.setSteward(new Person("Lenka", "Penka"));
		Hopper h1=new Hopper(150);
		NightWagon n1=new NightWagon(25,10);
		n1.setSteward(new Person("Bozena", "Fialova"));
		Locomotive lokomotiva1=new Locomotive((new Person("Karel","Novak")),Diesel);
		Hopper h2=new Hopper(150);
		Train tr1=new Train(lokomotiva1);
		tr1.ConnectWagon(h2);
		Locomotive lokomotiva2=new Locomotive((new Person("Bobik","Robik")),Steam);
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(b1);list.add(b2);list.add(h1);list.add(n1);list.add(h1);
		Train tr2=new Train(lokomotiva2,list);
		tr2.ConnectWagon(b1);
		tr2.reserveSeat(3, 5);
		tr2.reserveSeat(1, 5);
		tr2.reserveSeat(1, 6);
		tr2.reserveSeat(2, 1);
		tr2.reserveSeat(2, 1);
		System.out.println(tr2.ListofReservedSeats());
		System.out.println(tr1);
		System.out.println(tr2);
	
	}

}

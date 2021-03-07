package Train;

import java.util.ArrayList;


class PersonalWagon {
private ArrayList<Door> doors=new ArrayList<Door>();
private ArrayList<Seat>seats=new ArrayList<Seat>();
public ArrayList<Seat> getSeats() {return seats;}
public void setSeats(ArrayList<Seat> seats) {this.seats = seats;}

private int numberOfSeats;
public int getNumberOfSeats() {return numberOfSeats;}
public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

public PersonalWagon(int number) {this.numberOfSeats=number; for (int i=1;i<=number;i++) {seats.add(new Seat(i));}}
public void ConnectWagon(Train vlak) {vlak.ConnectWagon(this);}



}

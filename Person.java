package Train;

class Person {
private String firstname;
private String lastname;
public Person(String fname, String Lname) {this.firstname=fname;this.lastname=Lname;}
public String getFirstname() {return firstname;}
public void setFirstname(String firstname) {this.firstname = firstname;}
public String getLastname() {return lastname;}
public void setLastname(String lastname) {this.lastname = lastname;}
public String toString() {return this.firstname+" "+this.lastname;}
}

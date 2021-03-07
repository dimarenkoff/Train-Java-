package Train;

public class Locomotive {
Person driver;
Engine engine;

public Locomotive() {}
public Locomotive(Person driver, Engine eng) {this.engine=eng;this.driver=driver;}
public String toString() {return engine.toString();}
}

package assignment;

public class Vehicle {
public static void main(String args[]) {
	Engine e1=new Inline();
	Car c=new Car(e1);
	c.EngineName();
	c.totalTime(10, 15);
}
}

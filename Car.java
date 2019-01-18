package assignment;

public class Car extends Time {
	
Engine engineType;
Car(Engine engineType)
{
	this.engineType=engineType;
}

void EngineName(){
	engineType.run();
}
//Example of Abstract class 
void totalTime(int startTime, int stopTime){
	System.out.println("Engine Running Time: "+(startTime+stopTime));
}

//example of final

}

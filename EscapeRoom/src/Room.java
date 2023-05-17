//class created for room 
public class Room {
	//given two parameters 
	String situation;
	String options;
	
	Room(String situation, String options){
	
		this.situation = situation;
		this.options = options;
	
}
	//used to print information as one to the console.
	public void printInfo() {
		System.out.println(situation);
		System.out.println(options);
	}
}

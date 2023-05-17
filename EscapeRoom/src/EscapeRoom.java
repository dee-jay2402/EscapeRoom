//imported scanner
import java.util.Scanner;

public class EscapeRoom {

	public static void main(String[] args) {
		
		//description and game instructions 
		System.out.println("Welcome to the Escape Room!");
		System.out.println("Situation: You have been upducted by Mr Murder man and you wake up in the basement and need to escape without getting killed.");
		System.out.println("How to play: This is a multiple choice text game. You will be presented with a situation and then given 3 possible choices in each situation, where you will need to choice which one of them would result in the best outcome by entering the corrosponding number: 1 2 or 3");

		//calling room class with new object
		Room basement = new Room(
				//room situation
				"You are in the basement. You need to find a way out, you look around and see a door that looks like it leads upwards. ",
				//room choices
				"You look around the room and identify 3 objects but you can only carry one which do you choose?"
				+ " 1) - a hammer, 2) - a bobbypin or 3) - an axe");
		//prints the above to the console
		basement.printInfo();
		System.out.println();
		//scanner activation
		Scanner sc = new Scanner(System.in);
		//prompt to ask user for input
		System.out.print("Enter your choice: 1, 2 or 3");
		//takes user input as an integer and prints to console
		int num = sc.nextInt();
		
		//use of if statements to determine the outcome of the choice made
		if (num == 1) {

			System.out.println("You try to smash down the door with a hammer and end up dying of exhaustion"
					+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num == 2) {
			System.out.println("You sneak up to the door and manage to pick the lock. The door opens...");
		} else if (num == 3) {
			System.out.println(
					"You begin to try breaking down the door but you hear loud footsteps coming towards you... The murderer sees what you are doing and decides to punish you by death."
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else {
			//incase invalid entry is given
			System.out.println("incorrect entry, please try again.");
			//terminates the game
			System.exit(0);
			//closes scanner
			sc.close();
		}
		
		//calling room class again to create another new object
		Room hallway = new Room(
				"You quietly tip toe up the staircase till you reach the hallway and suddenly hear a loud noise. Its Mr Murder man chopping up his dinner for tonight.",
				"There are 3 things you can do: 1) Stay put and hope that he goes out soon. 2) Run into the kitchen where he is and stab him with the bobbypin in your hand. 3) Run into the next room");
		hallway.printInfo();
		System.out.println();
		Scanner choice2 = new Scanner(System.in);
		//prompts user for input
		System.out.print("Enter your choice 1, 2 or 3");

		int num1 = sc.nextInt();
		if (num1 == 1) {
			System.out.println(
					"You decide to wait behind a the wall in the staircase but Mr Murder man starts heading your way. You decide to retreat back down to the basemant but trip and end up tumbling down the stairs and end up bleeding out"
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num1 == 2) {
			System.out.println(
					"You charge towards Mr Murder man with a bobbypin he clocks you and slices you in half with the knife he was using whilst cooking"
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num1 == 3) {
			System.out.println(
					"you run into the next room but a floorboard creaks on your way and now you are panicking");
		} else {
			System.out.println("incorrect entry, please try again.");
			//terminates the game
			System.exit(0);
			//closes scanner
			choice2.close();
		}

		//calling room class again to create another new object
		Room livingRoom = new Room(
				"You are in the living room and are worried that Mr Murder man has heard the noise so you need to pick a good hiding spot",
				"Pick a hiding spot quick!: 1) Under the table. 2) Behind the curtain 3) Hide behind the sofa");
		livingRoom.printInfo();
		System.out.println();
		Scanner choice3 = new Scanner(System.in);
		//prompts user for input
		System.out.print("Enter your choice 1, 2 or 3");

		int num2 = sc.nextInt();
		if (num2 == 1) {
			System.out.println(
					"You have chosen to  hide under the table, and not very well ... Mr Muder man spots your feet poking out and its game over for you."
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num2 == 2) {
			System.out.println(
					"You decide to hide behind the curtain, poor choice! Mr Murder man spots you straight away."
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num2 == 3) {
			System.out.println(
					"you curl up in a ball behind the sofa and are holding your breath. Mr Murder man comes bursting into the living room looking everywhere but cannot find you. He then heads down to the basement");
		} else {
			System.out.println("incorrect entry, please try again.");
			//terminates the game
			System.exit(0);
			//closes scanner
			choice3.close();
		}
		
		//calling room class again to create another new object
		Room kitchen = new Room("You run into the kitchen as soon as he goes downstairs to see what you can find",
				"What do you do: 1) Pick up the knife on the kitchen counter. 2) Pick up the long metal pole up against the wall. 3)Try the back door and hope that it is open");
		kitchen.printInfo();
		System.out.println();
		Scanner choice4 = new Scanner(System.in);
		//prompts user for input
		System.out.print("Enter your choice 1, 2 or 3");

		int num3 = sc.nextInt();
		if (num3 == 1) {
			System.out.println(
					"You pick up the knife on the side and hear Mr Muder man roar from down in the basement... He comes marching up the stairs and spots you in the kitchen. You walk towards him with your knife but slip on some blood from his chopping earlier and he strikes you with the hammer he picked up from the basement. its game over for you."
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else if (num3 == 2) {
			System.out.println(
					"You opt for the long metal pole and hear Mr Murder man roar from down in the basement... He comes marching up the stairs and you begin to charge towards him with the metal pole with such force it knocks him down the bottom of the stairs and leaves him knocked out");
		} else if (num3 == 3) {
			System.out.println(
					"You hear Mr Muder man roar from down in the basement and you try to escape by opening the door to the garden in the kitchen but of course it is locked! By this time you turn around Mr Murder man is stood behind you ready to strike"
							+ "Run the game again and try again!");
			//terminates the game
			System.exit(0);
		} else {
			System.out.println("incorrect entry, please try again.");
			//terminates the game
			System.exit(0);
		}

		System.out.println(
				"You search his pockets and find the key! You sprint up the stairs and unlock the door in the kitchen."
						+ " Well done you have escaped!!");
		//closes scanner
		choice4.close();
	}
}




package assignment1;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int totalFloor = sc.nextInt();
		
		FloorFactory ff = new FloorFactory();
		ff.insertValue(totalFloor);
		sc.close();
	}

}

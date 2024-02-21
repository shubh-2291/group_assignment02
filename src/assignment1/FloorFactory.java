package assignment1;

import java.util.Scanner;

public class FloorFactory {

	Scanner sc = new Scanner(System.in);

	public void insertValue(int totalFloor) {
		int[] floors = new int[totalFloor];
		for (int i = 0; i < totalFloor; i++) {
			System.out.println("enter the floor size given on day :" + (i + 1));
			int value = sc.nextInt();
			for (int j = 0; j <= i; j++) {
				if (value == floors[j]) {
					System.out.println("Duplicate value is not allowed");
					i--;
					break;
				}

			}

			floors[i] = value;
		}

//		for (int i = 0; i < totalFloor; i++) {
//			System.out.println("Day :" + (i + 1) + "\n" + floors[i]);
//		}

		floorCount(floors, totalFloor);
	}

	public void floorCount(int floors[], int totalFloor) {
//		int index = 0;
//		while (index < floors.length) {
//			if (floors[index] == totalFloor) {
//				System.out.println("Day :" + index + "\n " + floors[index]);
//				totalFloor--;	totalFloor
//			}
//		}

//		while (totalFloor > 0) {

		for (int i = 0; i < floors.length; i++) {

			if (floors[i] == totalFloor) {
				System.out.println("Day :" + (i + 1) + "\n " + floors[i]);
				totalFloor--;
				for (int j = 0; j < i; j++) {
					if (floors[j] == totalFloor) {
						System.out.println(" " + floors[j]);
						totalFloor--;
					}
					for (int k = 0; k < j; k++) {
						if (floors[k] == totalFloor) {
							System.out.println(" " + floors[k]);
							totalFloor--;
						}
						for (int l = 0; l < k; l++) {
							if (floors[l] == totalFloor) {
								System.out.println(" " + floors[l]);
								totalFloor--;
							}

						}
//						floorCount(floors, totalFloor);
					}
				}

			} else {
				System.out.println("Day :" + (i + 1) + "\n ");

			}
		}
	}
}

//}

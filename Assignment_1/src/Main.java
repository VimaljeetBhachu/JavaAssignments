import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {

	static Logger mainlogger = Logger.getLogger(Main.class);

	public static void main(String[] argsS) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		mainlogger.info("Entered Main class");

		char ch = 'y';
		do {

			System.out.println(
					"Assingmnet 1\n1. Find Missing Number\n2. Find Largest Three ELement\n3. Find Common ELements\n4. All Zeros at end");
			int option = sc.nextInt();

			switch (option) {
			case 1: {
				try {
					System.out.println("Enter size of array between 0-10");
					int n = sc1.nextInt();
					int[] arr = new int[n];
					System.out.println("Enter array values between 0-10");
					for (int i = 0; i < n; i++) {
						arr[i] = sc1.nextInt();
					}
					System.out.println("missing number is " + FindMissingNumber.findNumber(arr));
				} catch (Exception e) {
					System.out.println(e);
				}
				break;

			}
			case 2: {

				System.out.println("Enter size of array btn 3-10");
				int n = sc2.nextInt();
				int[] arr = new int[n];
				System.out.println("Enter array values");
				for (int i = 0; i < n; i++) {
					arr[i] = sc2.nextInt();
				}
				int newarray[] = LargestThreeElements.findLargestThreeElements(arr);
				System.out.print("Largest: " + newarray[0] + " Second Largest: " + newarray[1] + " Third Largest: "
						+ newarray[2]);
				break;
			}
			case 3: {
				try {
					int[] arr1 = { 1, 5, 10, 20, 40, 80 }, arr2 = { 6, 7, 20, 80, 100 },
							arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
					for (int i = 0; i < arr1.length; i++) {
						System.out.print(arr1[i] + " ");
					}
					int[] actual = FindCommonElements.findCommonElements(arr1, arr2, arr3);
					int[] arr = new int[actual.length];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = (int) actual[i];
					}
					System.out.print("Common elements in three arrays ");
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					break;
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			case 4: {
				try {
					System.out.println("Enter size of array btn 0-10");
					int n = sc4.nextInt();
					int[] arr = new int[n];
					System.out.println("Enter array values");
					for (int i = 0; i < n; i++) {
						arr[i] = sc4.nextInt();
					}
					int newarray[] = PushZeroAtEnd.pushZero(arr);
					System.out.print("Sorted array with all zeros at end: ");
					for (int i = 0; i < n; i++) {
						System.out.print(newarray[i]);
					}
					break;
				} catch (Exception e) {
					System.out.println(e);
				}
			}

			}
			System.out.println("Do you want to continue?y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'y');
	}
}

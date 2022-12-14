package school_ch_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// TODO: 1번
	public static void printArray(double arr[][]) {
		int len = arr.length;
		System.out.println("The number of rows in the array: " + len);
		for (int index = 0; index < arr.length; index++) {
			System.out.print("arr[" + index + "]");
			for (int i = 0; i < arr[index].length; i++) {
				System.out.print(" " + arr[index][i]);
			}
			System.out.println("");
		}
	}

	// TODO: 2번
	public static double[][] run1(Scanner s) {
		// The number of rows in the real-number non-square array: 4
		System.out.print("The number of rows in the real-number non-square array: ");
		// // 1. run1()은 먼저 비정방형 배열의 행의 개수를 입력 받고,
		int input = s.nextInt();

//    2. 비정방형 배열을 선언하고 이 배열을 위한 레퍼런스 배열을 할당받는다. (예제 3-11 참고)
		double[][] dArr = new double[input][];

		// 3. for문을 이용하여 각 행별로 필요한 레퍼런스 배열을 할당 받는다. (예제 3-11 참고)
		for (int first = 0; first < input; first++) {
			dArr[first] = new double[first + 1];
			System.out.print("Input " + (first + 1) + " real numbers in row " + (first + 1) + ": ");

			for (int second = 0; second < first + 1; second++) {
				// 4. for문을 이용하여 각 행의 길이만큼 키보드로부터 실수 값을 입력 받아 해당 배열 원소에 저장한다.
				dArr[first][second] = s.nextDouble();
			}
		}
		// 5. 생성된 배열을 반환한다. (예제 3-12 참고)
		return dArr;
	}

	// TODO: 3번
	public static double[][] run2(Scanner s) {
		while (true) {
			try {
				System.out.print("The number of rows in the real-number non-square array: ");
				int input = s.nextInt();

				double[][] dArr = new double[input][];

				for (int first = 0; first < input; first++) {
					dArr[first] = new double[first + 1];
					System.out.print("Input " + (first + 1) + " real numbers in row " + (first + 1) + ": ");

					try {
						for (int second = 0; second < first + 1; second++) {
							dArr[first][second] = s.nextDouble();
						}
					} catch (InputMismatchException e) {
						System.out.println("Input an integer or a real number!");
						s.nextLine();
						first = first - 1;
						continue;
					}
				}
				return dArr;
			} catch (NegativeArraySizeException e) {
				s.nextLine();
				System.out.println("Input a positive integer!");
				continue;
			} catch (InputMismatchException e) {
				s.nextLine();
				System.out.println("Input an integer!");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		// TODO: 1번
		double array[][] = { { 0 }, { 1, 2 }, { 3, 4, 5 } };
		printArray(array);

		System.out.println(); // 이상은 기존과 동일

		// TODO: 2번
//        scanner 변수 생성 및 초기화; // 필요한 파일 import시킬 것
		Scanner scanner = new Scanner(System.in);
		double dArr1[][] = run1(scanner);
		printArray(dArr1);
		System.out.println();

		// TODO: 3,4번
		double dArr2[][] = run2(scanner);
		printArray(dArr2);
		System.out.println();

		scanner.close();
		System.out.println("Exit."); // 기존과 동일
	}
}
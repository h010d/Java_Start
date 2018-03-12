package Lesson_03;

public class Mas_1_Task_9_homework {

	public static void main(String[] args) {
		int arrASize = 10;
		int arrBSize = 5;
		int arrA[] = new int[arrASize];
		int arrB[] = new int[arrBSize];
		int arrC[] = new int[arrA.length + arrB.length];
		int dgtA = 0;
		int dgtB = 1;
		//fill the array A
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = dgtA + 2;
			dgtA += 2;

		}
		//fill the array B
		for (int i = 1; i < arrB.length; i++) {
			arrB[i] = dgtB;
			dgtB += 2;
		}
		//Print the array A
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(" arrA[" + i + "] = " + arrA[i] + ",");
		}
		//Print the array B
		System.out.println(" ");
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(" arrB[" + i + "] = " + arrB[i] + ",");
		}
		System.out.println("\n");
		int indA = 0;
		int indB = 0;
		
		//Sort and split the array A + B
		for (int i = 0; i < arrA.length + arrB.length; i++) {

			if (indA < arrA.length) {
				if(indB < arrB.length) {
					if(arrA[indA] < arrB[indB]) {
						arrC[i] = arrA[indA++];
					}else {
						arrC[i] = arrB[indB++];
					}
				}else {
					arrC[i] = arrA[indA++];
				}
			}else {
				arrC[i] = arrB[indB++];
			}
		}
		//Print the array C
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(" arrC[" + i + "] = " + arrC[i] + ",");
		}

	}

}

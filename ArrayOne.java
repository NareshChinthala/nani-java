package al_exam_demo;

import java.util.Scanner;

public class ArrayOne {
	int[] firstNumber;
	int[] secondNumber;
	int[] sumArray;

	void firstArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter  the size ? : ");
		int size = scanner.nextInt();

		System.out.println("Enter digits:");
		firstNumber = new int[size];
		for (int i = 0; i < size; i++) {
			firstNumber[i] = scanner.nextInt();
		}
	}

	void secondArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size1 ? :  ");
		int size1 = scanner.nextInt();

		System.out.println("Enter digits:");
		secondNumber = new int[size1];
		for (int i = 0; i < size1; i++) {
			secondNumber[i] = scanner.nextInt();
		}
	}

	void result() {
		String s="";
		String s1="";
		int digit1=0;
		int digit2=0;
		int sum=0;

		for (int i = 0; i < firstNumber.length; i++) {
			s=s+firstNumber[i];
			digit1=Integer.parseInt(s);
			}
		for (int i = 0; i < secondNumber.length; i++) {
			s1=s1+secondNumber[i];
			digit2=Integer.parseInt(s1);
			}
		int max=firstNumber.length+secondNumber.length;
		
		sumArray=new int[max];
		
		for (int j=0;j<sumArray.length;j++) {
			sum=digit1+digit2;
			
		}
		System.out.println(sum);
				
	}

	

}

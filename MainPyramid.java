package al_exam_demo;

import java.util.Scanner;

public class MainPyramid {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length=scanner.nextInt();
		System.out.println("Enter the brick : ");
		char brick=scanner.next().charAt(0);
		System.out.println("Enter the top : ");
		int top=scanner.nextInt();
		System.out.println("Enter the left : ");
		int left=scanner.nextInt();
		
		Pyramid obj=new Pyramid();
		obj.setLength(length);
		obj.setBrick(brick);
		obj.setTop(top);
		obj.setLength(length);
		obj.drawPyramid();
		
		
		
		
	}

}

package al_exam_demo;

public class Pyramid {
	private int length;
	private char brick;
	private int top;
	private int left;

	public void setLength(int length) {
		this.length = length;
	}

	public void setBrick(char brick) {
		this.brick = brick;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public void drawPyramid() {
		for (int i = 1; i < top; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");

			}
			System.out.println();
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < top + length-i-1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2*i+1; k++) {
				System.out.print(brick);
			}
			for (int m = 0; m < left; m++) {
				System.out.print(" ");
			}
			
			System.out.println();

		}
	}

}

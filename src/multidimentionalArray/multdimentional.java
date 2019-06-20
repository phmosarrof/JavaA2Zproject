package multidimentionalArray;

public class multdimentional {

	public static void main(String[] args) {
		
		
		int XYZ [][]= {{10,12,10,88},{10,55,66,88}};
		int ABC [][] = {{77,84,8,88},{77},{99,10}};
		

		System.out.println("First one");
		display(XYZ);
		System.out.println("Second one");
		display(ABC);

	}

	public static void display(int x[][]) {
		for (int row=0; row<x.length;row++) {
			//int row;
			for(int column=0;column<x[row].length;column++) {
				System.out.println(x[row] [column]);
			}
			System.out.println();
		           }
		
		
	}

	
}

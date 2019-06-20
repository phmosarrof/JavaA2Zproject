package multidimentionalArray;

public class MinimumNumberArray {

	public static void main(String[] args) {

		int matrix[][] = {{5,2,7},{4,0,5}};
		int min  = matrix[0][0];
		
		int mincolumn;
		for (int i=0; i<2; i++) 
		{

			for(int j=0; j<3; j++) {

				if ( matrix[i][j]<min )
				{
					min= matrix[i][j];	
					//mincolumn=j;
					//System.out.println(mincolumn);
				}

			}
//int k=0;
 //int maxcolumn=matrix[1][mincolumn];
 //while (k<3) {
	 
 //}
		}
		
		System.out.println(min);
		
	}

}

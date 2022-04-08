package Array;

public class GradeArray {

	public static void main(String[] args) {
		//declaration and intilisation in one line by using multidimentional array
		char arr[][]= {{'A','B'},{'C','D'}};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println("");
		}
	}

}

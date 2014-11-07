import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Matrix {

	private int[][] myMatrix;


	public Matrix(int x, int y)	{
			this.myMatrix = myMatrix;
			myMatrix = new int[x][y];

				for(int i=0; i < myMatrix.length; i++){
					for(int j=0; j < myMatrix.length; j++){
									myMatrix[i][j] = 1;

									}
								}

				}


			public int[][] setElement(int x, int y, int z){

						if (x > myMatrix.length || y > myMatrix[x].length){
							System.out.println("Invalid");
							return myMatrix;

						}
						myMatrix[x][y] = z;
						return myMatrix;
					}

			public int[][] setRow(int x, String str){

					this.myMatrix = myMatrix;

					if (x < myMatrix.length || (str.length()/2) < myMatrix[x].length){
						int j = 0;
									StringTokenizer st = new StringTokenizer(str, ",");

									while (st.hasMoreTokens()){
										int y = Integer.parseInt(st.nextToken());
										myMatrix[x][j] = y;
										j++;
									}
					return myMatrix;
			}
			System.out.println("Invalid");
			return myMatrix;
		}

			public int[][] setColumn(int x, String str){

					this.myMatrix = myMatrix;

					if (x < myMatrix.length || (str.length()/2) < myMatrix.length){
						int j = 0;
									StringTokenizer st = new StringTokenizer(str, ",");

									while (st.hasMoreTokens()){
										int y = Integer.parseInt(st.nextToken());
										myMatrix[j][x] = y;
										j++;
									}
							return myMatrix;
					}
					System.out.println("Invalid");
					return myMatrix;
			}

		public void toStringPrint(){


					System.out.print("{");
					for(int i=0; i < myMatrix.length; i++){
							for(int j=0; j < myMatrix.length; j++){
										System.out.print(myMatrix[i][j] + ",");
											}
									System.out.print(":");
								}
					System.out.print("}");
		}

		public void prettyPrint(){

					for(int i=0; i < myMatrix.length; i++){
							for(int j=0; j < myMatrix.length; j++){
										System.out.print(myMatrix[i][j] + "\t");
											}
									System.out.println("\t");
								}
		}



		public boolean check1DArray(int [][] myMatrix, int x, int y){


				int[] new1DArray = new int[y];

					for(int i=0; i < myMatrix.length; i++){
						new1DArray[i] = myMatrix[x][i];
				}

				MatrixChecker newCheck = new MatrixChecker();

				boolean result1 = newCheck.isSymmetrical(new1DArray);
				return result1;

		}
	public boolean check2DArray(int [][] myMatrix, int x, int y){

				MatrixChecker newCheck = new MatrixChecker();
				boolean result2 = newCheck.isSymmetrical(myMatrix);
				return result2;
	}
}
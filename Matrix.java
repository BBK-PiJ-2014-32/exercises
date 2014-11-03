import java.util.Arrays;

public class Matrix {

	private int[][] myMatrix;


	public Matrix(int x, int y)	{
			myMatrix = new int[x][y];

				for(int i=0; i < myMatrix.length; i++){
					for(int j=0; j < myMatrix.length; j++){
									myMatrix[i][j] = 1;
					}
				}
			}

			public int[][] setElement(int x, int y, int z){

						if (x < myMatrix.length && y < myMatrix[x].length){
							myMatrix[x][y] = z;
							return myMatrix;
						}
						return myMatrix;

					}



	}
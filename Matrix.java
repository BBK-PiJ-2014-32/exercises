import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	private int[][] myMatrix;


	public Matrix(int x, int y)	{
			myMatrix = new int[x][y];

				for(int i=0; i < myMatrix.length; i++){
					for(int j=0; j < myMatrix.length; j++){
									myMatrix[i][j] = 1;
									System.out.println(myMatrix[i][j]);
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
					if (x < myMatrix.length || str.length() < myMatrix[x].length){

							Scanner scanner = new Scanner(str);

								while (scanner.hasNext()){

										if (scanner.hasNextInt()){
											myMatrix[x][myMatrix[x].length-1] = scanner.nextInt();
										}
								scanner.close();
								return myMatrix;
					}
					return myMatrix;
				}


					System.out.println("Invalid");
					return myMatrix;
			}



	}
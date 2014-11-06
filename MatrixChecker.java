import java.util.Arrays;
import java.util.Scanner;

public class MatrixChecker {

	private int[] myArray;
	private int[][] myMatrix;

		public MatrixChecker(){

				this.myArray = myArray;
				this.myMatrix = myMatrix;
		}

			public boolean isSymmetrical(int[] myArray) {
						boolean result = false;

						for(int i=0; i < myMatrix.length; i++){
							if (myMatrix[i] == myMatrix[myMatrix.length-1]){
									result = true;
							}else {
									result = false;
							}
					}
					return result;
			}

			public boolean isSymmetrical(int[][] myMatrix) {
						boolean result = false;

						for(int i=0; i < myMatrix.length; i++){
									for(int j=0; j < myMatrix.length; j++){
										if (myMatrix[i][j] == myMatrix[myMatrix.length-1][j]){
											result = true;
										}else {
											result = false;
										}
								}
						}
						return true;
			}

			public boolean isTriagular(int[][] myMatrix){
						return true;
			}

}
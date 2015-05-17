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
						int count = 0;

						for(int i=0; i < myArray.length; i++){
							if (myArray[i] != myArray[myArray.length-1]){
									count++;
							}
					}
							if (count > 1){
									result = false;
							}else{
									result = true;
						}
					return result;
			}

			public boolean isSymmetrical(int[][] myMatrix) {
						boolean result = false;
						int count = 0;

						for(int i=0; i < myMatrix.length; i++){
									for(int j=0; j < myMatrix.length; j++){
										if (myMatrix[i][j] != myMatrix[myMatrix.length-1][j]){
											count++;
										}
									}
							}

							if (count > 1){
									result = false;
							}else{
								result = true;

						}
						return result;
			}

			public boolean isTriangular(int[][] myMatrix){
						boolean result = false;

						for(int i=0; i < myMatrix.length; i++){
									for(int j=0; j < myMatrix.length; j++){
										if (i > j && myMatrix[i][j] == 0){
										result = true;
									} else {
										result = false;
								}
							}
					}
						return result;
			}

}
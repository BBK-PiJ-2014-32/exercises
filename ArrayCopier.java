import java.util.Arrays;

public class ArrayCopier {

	private int[] src;
	private int[] dst;

	public ArrayCopier(int[] src, int[] dst)	{
			this.src = src;
			this.dst = dst;
		}

		public void copy(int[] src, int[] dst){
					if (src.length == dst.length) {
						for (int i = 0; i < src.length; i++)	{
							dst[i] = src[i];
						}
					System.out.println("The arrays are equal therefore the new array is: " + Arrays.toString(dst));

				} else if (src.length > dst.length) {
						for (int i = 0; i <  dst.length; i++)	{
							dst[i] = src[i];
						}
					System.out.println("Array 1 is longer than array 2 therefore the new array is: " + Arrays.toString(dst));

				}else if (src.length < dst.length) {
						for (int i = 0; i <  src.length; i++)	{
							dst[i] = src[i];
						}
					System.out.println("Array 1 is shorter than array 2 therefore the new array is: " + Arrays.toString(dst));
			}


		}

	}
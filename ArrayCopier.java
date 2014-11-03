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
						for (int i = 1; i <=  src.length; i++)	{
							dst[i] = src[i];
						}
				} System.out.println(Arrays.toString(dst));

		}

	}
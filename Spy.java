public class spy{
	private static in spyCount = 0;

	public Spy(){
		spyCount++;

		}

		public static in getNumberOfSpies(){
			return spyCount;
			}

		public void die(){
			spyCount--;
			}
	}

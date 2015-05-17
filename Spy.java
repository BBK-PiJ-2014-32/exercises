public class Spy{

	private static int spyCount = 0;
	private int spyID;

	public Spy(int x){
				this.spyID = spyID;
				spyID = x;
				spyCount++;
				System.out.println("New spy: " + spyID + ", registered.");
				System.out.println("There are currently: " + spyCount + " spies.");
		}

		public static int getNumberOfSpies(){
				return spyCount;
			}

		public void die(){
				this.spyID = spyID;
				spyCount--;
				System.out.println("Spy " + spyID + " has been detected and eliminated");
			}

	public static void main(String [] args){

				Spy spy1 = new Spy(12);
				Spy spy2 = new Spy(123);
				Spy spy3 = new Spy(007);
				Spy spy4 = new Spy(6);

				spy4.die();
				spy1.die();

				int x = spy2.getNumberOfSpies();
				System.out.println("There are " + x + " spies remaining.");
			}

	}
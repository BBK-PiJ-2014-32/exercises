public class doPracticeWhileNotUnderstood {

	//private int mark;
	//private int stuNumber;
	//private int dists;
	//private int passes;
	//private int fails;

	public doPracticeWhileNotUnderstood(){

			//this.mark = mark;
			//this.stuNumber = stuNumber;
			//this.dists = dists;
			//this.passes = passes;
			//this.fails = fails;

	}

	public void markInputOutput(){

			int markIn;
			int stu = 0;
			int dist = 0;
			int pass = 0;
			int fail = 0;
			int inval = 0;

				do {
					System.out.print("Input a mark: ");
					String str = System.console().readLine();
					markIn = Integer.parseInt(str);
					stu++;
						if (markIn >= 70 && markIn <= 100){
								dist++;
					} else if (markIn >= 50 && markIn <= 69){
								pass++;
					} else if (markIn >= 0 && markIn <= 49){
								fail++;
					} else	{
								inval++;
					}
				}
				while(markIn != -1);

	System.out.println("There are " + stu + " students: " + dist + " distinctions, " + 1 + " pass, " + fail + " fails (plus " + inval + " invalid).");

		}
}

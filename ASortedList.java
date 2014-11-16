public class ASortedList {
		private IntegerNode newList = null;

		public static void main(String[] args){

			ASortedList sortedList = new ASortedList();
			sortedList.launch();
		}

			//add ints.
			public void launch(){
				IntegerNode l1 = new IntegerNode(45);
				newList = l1;
				IntegerNode l2 = new IntegerNode(22);
				newList.setNextSort(l2);
				IntegerNode l3 = new IntegerNode(30);
				newList.setNextSort(l3);
				IntegerNode l4 = new IntegerNode(41);
				newList.setNextSort(l4);
				IntegerNode l5 = new IntegerNode(18);
				newList.setNextSort(l5);
				IntegerNode l6 = new IntegerNode(12);
				newList.setNextSort(l6);
				IntegerNode l7 = new IntegerNode(75);
				newList.setNextSort(l7);
				IntegerNode l8 = new IntegerNode(36);
				newList.setNextSort(l8);
				IntegerNode l9 = new IntegerNode(25);
				newList.setNextSort(l9);
				IntegerNode l10 = new IntegerNode(26);
				newList.setNextSort(l10);	
				
				newList.printList();
			
			}
}
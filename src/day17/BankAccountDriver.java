package day17;

public class BankAccountDriver implements Runnable {

	private BankAccount b;
	
	public BankAccountDriver(BankAccount bank){
		this.b = bank;
	}
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		for (int i = 0; i < 100; i++) {
			BankAccountDriver money = new BankAccountDriver(bank);
			Thread t = new Thread(money);
			t.start();
				synchronized(t){
					try{
						t.wait();
					} catch (InterruptedException ex){
						ex.printStackTrace();
					}
				}
			}
		}
		
		

	@Override
	public void run() {
		System.out.println("Opening balance " + b.getBalance());
		for (int i = 0; i < 1000; i++) {
				b.deposit(i);
				b.retrieve(i);
			}
		System.out.println("Closing balance " + b.getBalance());
		}
		
}

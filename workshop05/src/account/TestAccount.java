package account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account("441-0290-1203",500000,7.3);
		System.out.println("��������: "+a.getAccount()+" �����ܾ�: "+a.getBalance());
		a.withdraw(600000);
		a.deposit(20000);
		System.out.println("��������: "+a.getAccount()+" �����ܾ�: "+a.getBalance());
		System.out.println("����: "+a.calculateInterest());
	}
}

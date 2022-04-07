package layer3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount baObj = new BankAccount(9000);
		
		baObj.showBalance();
		
		AccountRepository accRepo = new AccountRepository(baObj);
		AccountService accService = new AccountService(accRepo);
		AccountController accControl = new AccountController(accService);
		
		AngularForm	angForm = new AngularForm(accControl);
		angForm.withdraw(5000);
		angForm.deposit(5000);
		angForm.transfer(10921253463,20131143699,8000);
		baObj.showBalance();
		baObj.getBalance();
		
	}

}
class BankAccount
{
	int acno;
	float balance;
	
	BankAccount(int acno,float b)
	{
		balance = b;
	}
	void withdraw(int acno,float amt) {
		System.out.println("BankAccount(float): withdraw: "+amt);
		balance = balance - amt;
	}
	void showBalance() {
		System.out.println("Balance : "+balance);
	}
	float getBalance(int acno) {
		return balance;
	}
	void deposit(int acno,float amt) {
		System.out.println("BankAccount(float): deposit: "+amt);
		balance = balance + amt;
	}
	void transfer(BankAccount acc1, BankAccount acc2, float amt) {
		System.out.println("BankAccount(float): transfer: "+amt+" from "+acc1+" to "+acc2);
		acc1.withdraw(acno,amt);
		acc2.deposit(acno,amt);
	}
}
class AccountRepository	{
	ArrayList<BankAccount> balist = new ArrayList<BankAccount>();
	BankAccount baObj1 = new BankAccount(9000);
	BankAccount baObj2 = new BankAccount(9000);
	BankAccount baObj;
	
	AccountRepository(BankAccount ref) {
		System.out.println("AccountRepository(BankAccount)...ctor...");
		baObj = ref;
	}
	void withdraw(float amt) {
		baObj.withdraw(amt);
	}
	float getBalance() {
		return baObj.getBalance();
	}
	void deposit(float amt)
	{
		baObj.deposit(amt);
	}
	void transfer(BankAccount acc1, BankAccount acc2, float amt)
	{
		baObj.transfer(acc1,acc2,amt);
	}
	
}
class InsufficientBalanceException extends RuntimeException 
{
	InsufficientBalanceException(String str) {
		super(str);
	}
}
class PANCardRequiredException extends RuntimeException
{
	PANCardRequiredException(String str)
	{
		super(str);
	}
}
class AccountService
{
	AccountRepository accRepo;
	AccountService(AccountRepository ref) {
		System.out.println("AccountService(AccountRepository)...ctor...");
		accRepo = ref;
	}
	void withdraw(float amt) {
		if(accRepo.getBalance() > amt)
			accRepo.withdraw(amt);
		else
			throw new InsufficientBalanceException("Balance is not sufficient to withdraw : "+amt); 
	}
	void deposit(float amt) {
		if(amt < 50000 )
			accRepo.deposit(amt);
		else
			throw new PANCardRequiredException("PAN card number required to deposit amount more than 50000");		
	}
	void transfer(BankAccount acc1, BankAccount acc2, float amt)
	{
		acc1.withdraw(amt);
		acc2.deposit(amt);
	}
}


class AccountController	{
	AccountService accService;
	
	AccountController(AccountService ref) {
		System.out.println("AccountController(AccountService)...ctor...");
		accService = ref;
	}
	void withdraw(float amt) {
		accService.withdraw(amt);
	}
	void deposit(float amt)
	{
		accService.deposit(amt);
	}
	void transfer(BankAccount acc1, BankAccount acc2, float amt)
	{
		accService.transfer(acc1,acc2,amt);
	}
	
}
class AngularForm	{
	
	AccountController	accCtrl;
	
	AngularForm(AccountController ref) {
		System.out.println("AngularForm(AccountController)...ctor...");
		accCtrl = ref;
	}
	void withdraw(float amt) {
		accCtrl.withdraw(amt);
	}
	void deposit(float amt) {
		accCtrl.deposit(amt);
	}
	void transfer(BankAccount acc1, BankAccount acc2, float amt)
	{
		accCtrl.transfer(acc1, acc2, amt);
	}

}
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount baObj1 = new BankAccount();
		BankAccount baObj2 = new BankAccount();
		BankAccount baObj3 = new BankAccount();
		BankAccount baObj4 = new BankAccount();
		BankAccount baObj5 = new BankAccount();
		
		MovieTicket m1 = new MovieTicket();
		m1.setTicketNumber(123);
		m1.setTicketName("abc");
		m1.setTicketCost(200);
		m1.setSeatNumber(22);
		m1.setMovieDateTime(LocalDateTime.of(2022, 03, 25, 3, 15));
		
		System.out.println("movie ticket is "+m1);
		
		baObj1.setBankAccount(100, "aaa", 98522.0f, LocalDate.of(2015,10,30), LocalDate.of(1991,1,15));
		baObj1.printBankAccount();
		
		float updateBalance = baObj1.withdraw(52000);
		System.out.println("Current balance is.."+updateBalance);
		
		
		
		baObj2.setBankAccount(101, "bbb", 95662, LocalDate.of(2015,8,30), LocalDate.of(1991,2,15));
		baObj3.setBankAccount(102, "ccc", 96632, LocalDate.of(2015,9,24), LocalDate.of(1991,3,15));
		baObj4.setBankAccount(103, "ddd", 95662, LocalDate.of(2015,5,30), LocalDate.of(1991,4,15));
		baObj5.setBankAccount(104, "eee", 98682, LocalDate.of(2015,6,30), LocalDate.of(1991,5,15));
		
		
		baObj2.printBankAccount();
		baObj3.printBankAccount();
		baObj4.printBankAccount();
		baObj5.printBankAccount();
		
		
		 
	}

}
 class BankAccount
 {
	 private int accountNumber;
	 private String accountHolderName;
	 private float accountBalance;
	 private LocalDate accountOpeningDate;
	 private LocalDate accountHolderBirthdate;
	 private int age;
	 
	 void setBankAccount(int accountNumber, String accountHolderName, float accountBalance, LocalDate accountOpeningDate, LocalDate accountHolderBirthdate)
	 {
		 System.out.println("Setting the bank account details...");
		 this.accountNumber = accountNumber;
		 this.accountHolderName = accountHolderName;
		 this.accountBalance = accountBalance;
		 this.accountOpeningDate = accountOpeningDate;
		 this.accountHolderBirthdate = accountHolderBirthdate;
		 
		 LocalDate todaysDate = LocalDate.now();
		 age = todaysDate.getYear() -accountHolderBirthdate.getYear();
		
	 }
	 void printBankAccount()
	 {
		 System.out.println("Account Number             : "+accountNumber);
		 System.out.println("Account Holder Name        : "+accountHolderName);
		 System.out.println("Account Balance            : Rs "+accountBalance+" /-");
		 System.out.println("Account Opening Date       : "+accountOpeningDate);
		 System.out.println("Account Holder's Birthdate : "+accountHolderBirthdate);
	     System.out.println("Account Holder's Age      : "+age);
		 float SI = calculateSimpleInterest();
		 System.out.println("Bank SI is.."+SI);
		 System.out.println("------------------------------");
	 }
	 private float calculateSimpleInterest()
	 {
		 System.out.println("Calculating simple interest....");
		 float si = accountBalance * 1*2.5f/100;
		 return si;
	 }
	 float withdraw(float amountToWithdraw)
	 {
		 System.out.println("Withdrawing amount is..."+amountToWithdraw); 
		 if (amountToWithdraw>accountBalance)
		 {
			 System.out.println("insufficient funds"); 
		 }
		 else if (amountToWithdraw > 50000)
		 {
			 System.out.println("Please provide PAN card details");
		 }
		 else 
		 {
			 accountBalance = accountBalance - amountToWithdraw;
		 }
		 return accountBalance;
	 }
	 float deposit(float amountToDeposit)
	 {
		 System.out.println("Depositing amount is..."+amountToDeposit);
		 if (amountToDeposit > 50000)
		 {
			 System.out.println("Please specify source of income"); 
		 }
		 else
		 {
			 accountBalance = accountBalance + amountToDeposit;
		 }
		 return accountBalance;
	 }
	 
 }
 class MovieTicket
 {
	 private int ticketNumber;
	 private String ticketName;
	 private float ticketCost;
	 private int seatNumber;
	 private LocalDateTime movieDateTime;
	public void setMovieTicket(int ticketNumber, String ticketName, float ticketCost, int seatNumber,
			LocalDateTime movieDateTime) {
		
		this.ticketNumber = ticketNumber;
		this.ticketName = ticketName;
		this.ticketCost = ticketCost;
		this.seatNumber = seatNumber;
		this.movieDateTime = movieDateTime;
	}
	@Override
	public String toString() {
		return "MovieTicket [ticketNumber=" + ticketNumber + ", ticketName=" + ticketName + ", ticketCost=" + ticketCost
				+ ", seatNumber=" + seatNumber + ", movieDateTime=" + movieDateTime + "]";
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public LocalDateTime getMovieDateTime() {
		return movieDateTime;
	}
	public void setMovieDateTime(LocalDateTime movieDateTime) {
		this.movieDateTime = movieDateTime;
	}
	 
 }
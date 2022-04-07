
public class MyJavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salarystatus();
		salaryslip("march");
		float netsalary=netSalary(70000,25000);
		System.out.println("netsalary is "+netsalary);
		
		
	}
		static void salarystatus()
		{
			System.out.println("salary not generated for this month");
		}
		static void salaryslip(String month)
		{
			System.out.println("salaryslip generated for the month "+month);
		}
		static float netSalary(int grosssalary, int deduction)
		{
			float netSalary= grosssalary-deduction;
			return netSalary;
		}
		static float emi()
		{
		 float houseloan = 15700;
	     float carloan = 3750;	
	     float totalemi = houseloan+carloan;
	     return totalemi;
		}
}

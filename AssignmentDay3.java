import java.util.InputMismatchException;

public class AssignmentDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
          studentNameInvalidException.ReportCard rp = studentNnew ReportCard();
          System.out.println("showing students detail....");
          rp.setReportCard(101, "aaa");
          System.out.println(" "+rp);
          
          studentNameInvalidException.AcademicReportCard arp = new studentNameInvalidException.AcademicReportCard();
          arp.setAcademicReportCard(41,56,68);
          arp.showMarks(41,56,68);
          arp.totalMarksObtained(41,56,68);
          
          studentNameInvalidException.ExtraCurricularReportCard erp = new studentNameInvalidException.ExtraCurricularReportCard();
          erp.setExtraCurricularReportCard("good", "good");
          erp.showPerformance("good", "good");
          
          
	}

}
class studentNameInvalidException extends Exception
{
	studentNameInvalidException (String str) {
		super(str);
	}
class ReportCard
{
		int studentRollNo;
		String studentName;
		
		ReportCard()
		{
			System.out.println("report card const....");
		}
		public void setReportCard(int studentRollNo, String studentName) {
			this.studentRollNo = studentRollNo;
			if(studentName.matches("[a-zA-Z]+"))
				this.studentName = studentName;
			else {
				throw new studentNameInvalidException("Student's name must be in alphabets");
			
		}
		@Override
		public String toString() {
			return "ReportCard [studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
		}
	    	
}

class AcademicReportCard extends ReportCard
{
	int s1;
	int s2;
	int s3;
	AcademicReportCard()
	{
		System.out.println("Academic report card const....");
	}
	
	public void setAcademicReportCard(int s1, int s2, int s3) {
		super.setReportCard(studentRollNo, studentName);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	void showMarks(int s1,int s2,int s3)
	{
		System.out.println("subject 1 : "+s1);
		System.out.println("subject 2 : "+s2);
		System.out.println("subject 3 : "+s3);

	
	}
	@Override
	public String toString() {
		return "AcademicReportCard [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", studentRollNo=" + studentRollNo
				+ ", studentName=" + studentName + ", toString()=" + super.toString() + "]";
	}

	float totalMarksObtained(int s1,int s2,int s3)
	{
		 
		float t1;
		t1 = s1+s2+s3;
		System.out.println("Total marks obtained is.."+t1);
		return t1;
		
		
	}
	
		
	
}
class ExtraCurricularReportCard extends ReportCard
{
	String sportsActivity;
	String culturalActivity;
	
	ExtraCurricularReportCard()
	{
		System.out.println("Extra Curricular report card const....");
	}

	public void setExtraCurricularReportCard(String sportsActivity, String culturalActivity) {
		super.setReportCard(studentRollNo, studentName);
		this.sportsActivity = sportsActivity;
		this.culturalActivity = culturalActivity;
	}
	void showPerformance(String sp, String cu)
	{
		System.out.println("sports   : "+sp);
		System.out.println("cultural : "+cu);
		
	}

	@Override
	public String toString() {
		return "ExtraCurricularReportCard [sportsActivity=" + sportsActivity + ", culturalActivity=" + culturalActivity
				+ ", toString()=" + super.toString() + "]";
	}
}

}
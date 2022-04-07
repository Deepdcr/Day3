
public class UniqueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

{
	String studentName;
	int studentRollNo;
	float studentPercentage;
	private int totalMarks = 500;
	float totalMarksObtained;
	
	void setStudentDetail(String n, int r, float p )
	{
		studentName = n;
		studentRollNo = r;
		studentPercentage = p;
	}
	float calculatinTotalMarksObtained(float s1, float s2, float s3, float s4, float s5)
	{
		System.out.println("calaculating total marks obtained....");
		float TotalMarksObtained = s1 + s2 + s3 + s4 + s5;
		return TotalMarksObtained;
	}
	float calculateTotalPercentageOfStudent()
	{
		System.out.println("calaculating total percentage of student....");
		float TotalPercentage = totalMarksObtained/totalMarks * 100;
		return TotalPercentage;
	}
	}
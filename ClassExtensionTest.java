
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Doctor();
		d.setDoctor("MBBS", 500);
		System.out.println(" "+d);
		d.diagnose();
		
		Surgeon s = new Surgeon();
		s.setSurgeon("MBBS", 1500,"MD");
		System.out.println(" "+s);
		s.diagnose();
		s.doCut();
		s.doSurgery();
		s.doStiching();
		
		HeartSurgeon hs = new HeartSurgeon();
		hs.setHeartSurgeon("MBBS", 6000, "MS","MHS");
		System.out.println(" "+hs);
		hs.diagnose();
		hs.doCut();
		hs.doSurgery();
		hs.doStiching();
	}

}
class Doctor
{
	String qualification;
	int fees;
	
	public void setDoctor(String qualification, int fees) {
		this.qualification = qualification;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + ", fees=" + fees + "]";
	}

	void diagnose()
	{
		System.out.println("doctor is diagnosing....EENTT..");
	}
	
}
class Surgeon extends Doctor
{
	String specializedQualification;

	public void setSurgeon(String qualification, int fees, String specializedQualification) {
		super.setDoctor(specializedQualification, fees);
		this.specializedQualification = specializedQualification;

	}

	@Override
	public String toString() {
		return "Surgeon [specializedQualification=" + specializedQualification + ", qualification=" + qualification
				+ ", fees=" + fees + ", toString()=" + super.toString() + "]";
	}
	void diagnose()
	{
		System.out.println("surgeon is diagnosing.....EENTT...CT SCAN.");
	}
	void doCut()
	{
		System.out.println("surgeon is cutting......");
	}
	void doSurgery()
	{
		System.out.println("surgeon is doing surgery......");
	}
	void doStiching()
	{
		System.out.println("surgeon is stiching......");
	}
	
}
class HeartSurgeon extends Surgeon
{
	String heartSurgeryQualification;

	public void setHeartSurgeon(String qualification, int fees, String specializedQualification, String heartSurgeryQualification) {
		super.setSurgeon(qualification, fees, specializedQualification);
		this.heartSurgeryQualification = heartSurgeryQualification;
	}

	@Override
	public String toString() {
		return "HeartSurgeon [heartSurgeryQualification=" + heartSurgeryQualification + ", specializedQualification="
				+ specializedQualification + ", qualification=" + qualification + ", fees=" + fees + ", toString()="
				+ super.toString() + "]";
	}
	void diagnose()
	{
		System.out.println("heartsurgeon is diagnosing.....EENTT...CT SCAN...ECG..");
	}
	void doCut()
	{
		System.out.println("heartsurgeon is cutting......");
	}
	void doSurgery()
	{
		System.out.println("heartsurgeon is doing surgery......");
	}
	void doStiching()
	{
		System.out.println("heartsurgeon is stiching......");
	}
	
}
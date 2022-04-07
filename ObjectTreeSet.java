import java.util.Iterator;
import java.util.TreeSet;

public class ObjectTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChemicalElement ce = new ChemicalElement(1,2,"H","Hydrogen");
		TreeSet<ChemicalElement> treeCe = new TreeSet<ChemicalElement>();
		System.out.println("tree is created....");
		treeCe.add(new ChemicalElement(2,4,"He","Helium"));
		
		System.out.println("comparing and creating...");
		treeCe.add(ce);
		
		System.out.println("comparing and creating...");
		treeCe.add(new ChemicalElement(3,6,"Li","Lithium"));
		
		System.out.println("comparing and creating...");
		treeCe.add(new ChemicalElement(5,10,"B","Boron"));
		
		System.out.println("comparing and creating...");
		treeCe.add(new ChemicalElement(6,12,"C","Carbon"));
		
		System.out.println("Tree created...");
		
	Iterator<ChemicalElement> iterator = treeCe.iterator();
		
		while(iterator.hasNext()) 
		{
			ChemicalElement ce1 = iterator.next();
			System.out.println("employee is : "+ce1);
			
		}
		
	}

}
class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	int atomicWeight;
	String atomicFormula;
	String atomicName;
	public ChemicalElement(int atomicNumber, int atomicWeight, String atomicFormula, String atomicName) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
		this.atomicFormula = atomicFormula;
		this.atomicName = atomicName;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", atomicFormula="
				+ atomicFormula + ", atomicName=" + atomicName + "]";
	}
	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		System.out.println(atomicNumber+ "is compare to" +o.atomicNumber);
		return Integer.compare(o.atomicNumber, atomicNumber);
	}
	
	
		
}
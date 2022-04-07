import java.util.HashSet;
import java.util.Iterator;

public class ObjectHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(1234,"aaa","zzz",200.0f);
		
		HashSet<Book> hashBk = new HashSet<Book>();
		
		hashBk.add(new Book(111,"bbb","xxx",500.0f));
		hashBk.add(b);
		hashBk.add(new Book(222,"ccc","yyyy",300.0f));		
		hashBk.add(new Book(115,"bdb","xfx",550.0f));		
		hashBk.add(new Book(911,"nbb","xxh",900.0f));	
		hashBk.add(new Book(181,"bmb","dxx",700.0f));		
		hashBk.add(new Book(121,"bfb","xxxa",600.0f));
		
	Iterator<Book> iterator = hashBk.iterator();
		
		while(iterator.hasNext()) 
		{
			Book bk = iterator.next();
			System.out.println("employee is : "+bk);
			
		}
		
	}

}
class Book
{
	int bookNo;
	String bookName;
	String author;
	float price;
	
	public Book(int bookNo, String bookName, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
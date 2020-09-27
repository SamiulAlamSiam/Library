
public class LibraryMain {

	public static void main(String[] args) {
		
		Library l = new Library("AIUB","KURATOLI");
		l.ShowInfo();
		
		Book java = new Book("Head First JAVA", "Bert Bates and Kathy Sierra", "Programming Language", 1, 10);
		
		Book cSharp = new Book("Head First C#", "Andrew Stellman", "Programming Language", 2, 15);
		
		System.out.println("\n\n\n");
		
		System.out.println("\n\n After Add JAVA Book \n");
		l.AddBook(java);
		l.ShowInfo();
		
		System.out.println("\n\n After Add C# Book \n");
		l.AddBook(cSharp);		
		l.ShowInfo();
		
		System.out.println("\n\n After Add 10 More Books Of JAVA \n");
		l.AddNewBookCopy(java, 10);		
		l.ShowInfo();
		
		
		System.out.println("\n\n After Add 10 More Books Of C# \n");		
		l.AddNewBookCopy(cSharp, 10);
		l.ShowInfo();
		
		
		System.out.println("\n\n After Delete Books Of JAVA \n");
		l.DeleteBook(java);
		l.ShowInfo();
		
		System.out.println("\n\n After Delete Books Of JAVA \n");
		l.DeleteBook(java);
		l.ShowInfo();		

	}

}

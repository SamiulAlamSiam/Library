import java.util.ArrayList;

public class Library {
	
	private String libName;
	private String libAddress;
	
	private ArrayList<Book> listOfBook;
	
	
	public Library(String libName, String libAddress)
	{
		this.libName = libName;
		this.libAddress = libAddress;
		
		listOfBook = new ArrayList<Book>();
	}
	
	public Library()
	{
		this("", "");
	}
	
	public void ShowInfo()
	{
		System.out.println("Library Name : "+ this.libName);
		System.out.println("Library Address :"+ this.libAddress);
		
		for(Book b : listOfBook)
		{
			b.ShowInfo();
		}
	}
	
	public void AddBook(Book book)
	{
		for(Book b : listOfBook)
		{
			if(b.equals(book))
			{
				System.out.println("Book Already Exit");
				return;
			}
		}
		listOfBook.add(book);
	}
	
	public void DeleteBook(Book book)
	{
		for(Book b : listOfBook)
		{
			if(b.equals(book))
			{
				listOfBook.remove(book);
				return;
			}
		}
		System.out.println("That Book Not Exit");
	}
	
	public void AddNewBookCopy(Book book, int copy)
	{
		for(Book b : listOfBook)
		{
			if(b.equals(book))
			{
				b.AddBookCopy(copy);
				return;
			}
		}
		System.out.println("That Book Not Exit");
	}

}

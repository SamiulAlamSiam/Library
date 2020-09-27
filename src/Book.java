
public class Book {
	
	private String bookName;
	private String bookAuthor;
	private String bookType;
	private int bookID;
	private int bookCopy;
	
	private static int bookCounter = 0;
	
	public Book(String bookName, String bookAuthor, String bookType, int bookID, int bookCopy)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
		this.bookID = bookID;
		this.bookCopy = bookCopy;
		
		bookCounter++;
	}
	
	public Book()
	{
		this("", "", "", -1, -1);
	}

	public void AddBookCopy(int copy)
	{
		this.bookCopy+=copy;
	}
	
	public void ShowInfo()
	{
		System.out.println("Book Name :" + this.bookName);
		System.out.println("Book Author : " + this.bookAuthor);
		System.out.println("Book Copy :" + this.bookCopy);
		System.out.println("Book Type : " + this.bookType);
	}
	
	public static void ShowBookInfo()
	{
		System.out.println("Total Book : " +bookCounter);
	}

}

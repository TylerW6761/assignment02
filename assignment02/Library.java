package assignment02;

public class Library
{
	public static void main(String[] args)
	{
		Book[] library = new Book[3];
		
		library[0] = new Book("firstBookTitle", 100);
		library[1] = new Book("secondBookTitle", 200);
		library[2] = new Book("thirdBookTitle", 300);
		
		for (int i = 0; i < library.length; i++)
		{
			System.out.println(library[i].getTitle());
		}
		
		for (Book currentBook : library)
		{
			System.out.println(currentBook.getNumPages());
		}
	
		var expectedTotalPages = 600;
		var expectedMostPages = 300;

		System.out.println("Expected Total Pages: 600");
		System.out.println("Actual" + numPagesInLibrary(library));

		if (numPagesInLibrary(library) == expectedTotalPages)
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}

		System.out.println("Expected Most Pages: 300");
		System.out.println("Actual" + mostPages(library));

		if (mostPages(library) == expectedMostPages)
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}

	}

	
	public static int numPagesInLibrary(Book[] books)
	{	
		int totalNumPages = 0;
		
		if (books != null)
		{		
			for (int i = 0; i < books.length; i++)
			{
				if (books[i] != null)
				{				
					totalNumPages += books[i].getNumPages();
				}
			}
		}		

		return totalNumPages;
	}

	public static int mostPages(Book[] books)
	{
		int currentMost = 0;
		if (books != null && books.length > 0)
		{
			for (Book book : books)
			{
				if (book != null)
				{
					if (book.getNumPages() > currentMost)
					{
						currentMost = book.getNumPages();
					}				
				}	
			}
		}
		
		return currentMost;	
		
	}

}

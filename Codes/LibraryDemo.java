package com.company.exception;

class Book{
	private int bookId;
	private String bookTitle;
	private String authorName;
	private boolean isIssued;

	public Book(int bookId, String bookTitle, 
				String authorName, boolean isIssued) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.isIssued = isIssued;
	}
	public String getTitle() {
		return bookTitle;
	}
	public int getId() {
		return bookId;
	}

	public void issueBook() {
		this.isIssued = true;
	}
	
	public void returnBook() {
		this.isIssued = false;
	}
	
	public boolean isBookIssued() {
		return isIssued;
	}

	public void displayBook() {
		System.out.println("Id: " + bookId);
		System.out.println("Name: " + bookTitle);
		System.out.println("Author: " + authorName);
		System.out.println("Availbility: " + !isIssued);
	}
}


class Library {
    private Book[] bookarr;
    private int index = -1;

    public Library(int numberOfBooks) {
        if (numberOfBooks <= 0) {
            throw new IllegalArgumentException(
                "Library capacity must be positive."
            );
        }
        bookarr = new Book[numberOfBooks];
    }

    public void addBook(Book book) {
        try {
            if (book == null) {
                throw new IllegalArgumentException(
                    "Book object cannot be null."
                );
            }

            if (index + 1 >= bookarr.length) {
                throw new IndexOutOfBoundsException(
                    "Library capacity is full."
                );
            }

            bookarr[++index] = book;
            System.out.println("Book added successfully.");

        } catch (IllegalArgumentException |
                 IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Add book operation completed.");
        }
    }

    public void issueBook(String title) {
        try {
            if (title == null || title.isBlank()) {
                throw new IllegalArgumentException(
                    "Book title cannot be empty."
                );
            }

            for (Book book : bookarr) {
                if (book != null &&
                    book.getTitle().equalsIgnoreCase(title)) {

                    if (book.isBookIssued()) {
                        throw new IllegalStateException(
                            "Book already issued."
                        );
                    }

                    book.issueBook();
                    System.out.println("Book issued successfully.");
                    return;
                }
            }

            throw new IllegalStateException(
                "Book not found."
            );

        } catch (IllegalArgumentException |
                 IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Issue book operation completed.");
        }
    }

    public void returnBook(int id) {
        try {
            for (Book book : bookarr) {
                if (book != null && book.getId() == id) {

                    if (!book.isBookIssued()) {
                        throw new IllegalStateException(
                            "Book has not been issued."
                        );
                    }

                    book.returnBook();
                    System.out.println("Book returned successfully.");
                    return;
                }
            }

            throw new IllegalStateException(
                "No book found with ID: " + id
            );

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Return book operation completed.");
        }
    }

    public void displayAllBooks() {
        try {
            boolean found = false;

            for (Book book : bookarr) {
                if (book != null && !book.isBookIssued()) {
                    book.displayBook();
                    found = true;
                }
            }

            if (!found) {
                throw new IllegalStateException(
                    "No available books in the library."
                );
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Display operation completed.");
        }
    }
}
public class LibraryDemo {
	public static void main(String[] args) {
		
		Book b1 = new Book(101, "Java", "H.Schild", false);
		Book b2 = new Book(102, "OS", "John", false);
		Book b3 = new Book(103, "C#", "Herbert Sharma", false);
		Book b4 = new Book(104, ".net", "H.Schild", false);
		Book b5 = new Book(105, "COBOL", "D.Schild", false);
		
		Library library = new Library(3);
		
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		
		library.displayAllBooks();
		
		System.out.println("===================");
		library.issueBook("OS");
		library.issueBook("OS");
		library.displayAllBooks();
		
		System.out.println("===================");
		library.returnBook(102);
		library.displayAllBooks();
		
		System.out.println("===================");
		library.addBook(b4);
		
		library.returnBook(102);
		
	}
}
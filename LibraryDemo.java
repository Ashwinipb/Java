package in.ac.kletech.Employee;

public class LibraryDemo {

	public static void main(String[] args) {
		Library book=new Library(2,15,"department");
		book.ReferenceSection();
		book.LendingSection();
		book.Digitallibrary();
        book.QuestionPaper();
	}

}

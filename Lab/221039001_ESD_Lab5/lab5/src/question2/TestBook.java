package question2;

public class TestBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Chethan Bhagat", "IamChethan@gmail.com", 'M');
        Book book1 = new Book("One Indian Girl", author,1000, 100);
        Book book2 = new Book("Half Girlfriend", author,800);
       
        assert(book1.getName().equals("One Indian Girl"));
        assert(book2.getName().equals("Half Girlfriend"));
        assert(book1.getAuthor().getName().equals("Chethan Bhagath"));
        assert(book2.getAuthor().getEmail().equals("IamChethan@gmail.com"));
        assert(book1.getPrice() == 1000);
        assert(book2.getPrice() == 800);
        book1.setPrice(1200);
        assert(book1.getPrice() == 1200);
        assert(book1.getQty() == 150);
        assert(book2.getQty() == 0);
        book2.setQty(70);
        assert(book2.getQty() == 70);
        assert(book1.toString().equals("Book[name=One Indian Girl,Author[name=Chethan Bhagat,email=IamChethan@gmail.com,gender=M],price=1200,qty=150]"));
        assert(book2.toString().equals("Book[name=Half Girlfriend,Author[name=Chethan Bhagat,email=IamChethan@gmail.com.com,gender=M],price=800,qty=70]"));
    }
}

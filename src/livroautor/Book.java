package livroautor;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = 0;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this(name, authors, price);
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		String authorsString = "";
		
		for (int i = 0; i < authors.length - 1; i++) {
			authorsString += authors[i] + ", "; 
		}
		
		authorsString += authors[authors.length-1];
		 //   0      1        2      3
		// autor1, autor2, autor3, autor4
		
		return "Book [name=" + name + ", authors={" + authorsString + "}, price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	
}

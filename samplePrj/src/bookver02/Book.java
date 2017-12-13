
package bookver02;


public class Book implements Comparable<Book>{
	private String title;
	private int price;
	
	public Book(){
	}

	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price<0){
			System.out.println("가격이 0보다 작습니다.");
		return;	
		}
		this.price = price;
	}
	

	public void display(){
		System.out.printf("서지정보[서명:%s  가격:%d]%n",title,price);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book[");
		sb.append(title);
		sb.append(",");
		sb.append(price);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		
		return getTitle().compareTo(o.getTitle());
	}
	
	
	
	
}

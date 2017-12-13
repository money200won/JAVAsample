
package bookver01;


public class Book {
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
			System.out.println("������ 0���� �۽��ϴ�.");
		return;	
		}
		this.price = price;
	}
	

	public void display(){
		System.out.printf("��������[����:%s  ����:%d]%n",title,price);
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
	
	
	
}

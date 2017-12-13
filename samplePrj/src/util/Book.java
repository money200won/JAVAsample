
package util;

import day10.Bookmgr;

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
			System.out.println("가격이 0보다 작습니다.");
		return;	
		}
		this.price = price;
	}
	
	
	
}

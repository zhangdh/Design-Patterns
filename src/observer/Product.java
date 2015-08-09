package observer;

import java.util.Observable;

public class Product extends Observable{
	private String name = "";
	private double price;
	private int count;       
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		
		//当数量改变时通知其观察者
		this.setChanged();
		
		this.notifyObservers(price);
	}
	public  Product(String name,double price,int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		//当改变价格时通知其观察者
		this.setChanged();
		
		this.notifyObservers(price);
	}
	
}

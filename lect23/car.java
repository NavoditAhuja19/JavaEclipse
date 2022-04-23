package lect23;

public class car implements Comparable<car> {
	int speed;
	int price;
	String color;

	public car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;

	}

	@Override
	public String toString() {

		String str;
		str = this.speed + " " + this.price + " " + this.color + "...";

		return str;

	}

	@Override
	public int compareTo(car other) {
		// return this.speed - other.speed;

		 return other.price-this.price;
		// return this.color.compareTo(other.color);
	}

}

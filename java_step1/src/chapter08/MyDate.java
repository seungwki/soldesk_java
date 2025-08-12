package chapter08;

public class MyDate {
	int day;
	int month;
	int year;

	public MyDate() {
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		MyDate date1 = new MyDate(16, 8, 2025);
		System.out.println("오늘 >>" + date1.getYear() + date1.getMonth() + date1.getDay());
		MyDate date2 = new MyDate();
		System.out.println("오늘 >>" + date2.getYear() + date2.getMonth() + date2.getDay());
		date1.printThis();
		date2.printThis();
	}
}

package chapter07;

import javax.swing.JOptionPane;

public class Student {
	// 필드 == 멤버 변수
	private String std_name;
	private String std_num;
	private int java, oracle, spring;

	// getter, setter
	public String getStd_name() {return std_name;}
	public void setStd_name(String std_name) {this.std_name = std_name;}
	public String getStd_num() {return std_num;}
	public void setStd_num(String std_num) {this.std_num = std_num;}
	public int getJava() {return java;}
	public void setJava(int java) {this.java = java;}
	public int getOracle() {return oracle;}
	public void setOracle(int oracle) {this.oracle = oracle;}
	public int getSpring() {return spring;}
	public void setSpring(int spring) {this.spring = spring;}
	// 생성자(기본 생성자는 생략 가능)
	/*
	public Student() {
		// TODO Auto-generated constructor stub
	}
	 */
	
	// 메서드
	public void sum() {
		int total = java+oracle+spring;
		System.out.println("sum : "+total);
	}
	public void avg() {
		double total = (double)(java+oracle+spring)/3;
		System.out.println("sum : "+total);
	}
	
	public static void main(String[] args) {
		Student std1;
		std1 = new Student();
		//학생 필드 받기
		std1.std_num = JOptionPane.showInputDialog("학 번");
		std1.std_name = JOptionPane.showInputDialog("이 름");
		//3개 점수 받기
		std1.java = Integer.parseInt(JOptionPane.showInputDialog("좌바"));
		std1.oracle = Integer.parseInt(JOptionPane.showInputDialog("우라클"));
		std1.spring = Integer.parseInt(JOptionPane.showInputDialog("서퍼링"));
		//학번 - , 이름 - 의 성적입니다
		System.out.printf("학번 - %s, 이름 - %s의 성적입니다.\n",std1.std_num, std1.std_name);
		//합계, 평균 출력하기
		std1.sum();
		std1.avg();
	}
}
package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> userList = new ArrayList<>();
		String id;
		String pw;
		User user;
		outer: while (true) {
			user = new User();
			System.out.println("user Info");
			System.out.print("ID <<< ");
			id = sc.nextLine();
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getId().equals(id)) {
					System.out.println("Exist Id. write again");
					continue outer;
				}
			}
			System.out.print("PW <<< ");
			pw = sc.nextLine();
			user.setId(id);
			user.setPw(pw);
			userList.add(user);
			for (int i = 0; i < userList.size(); i++) {
				System.out.println("ID >> " + userList.get(i).getId());
				System.out.println("PW >> " + userList.get(i).getPw());
			}
		}
//		sc.close();
	}
}
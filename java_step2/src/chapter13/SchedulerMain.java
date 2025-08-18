package chapter13;

import java.util.Scanner;

public class SchedulerMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int command;
		Scheduler sch;
		boolean run = true;
		while (run) {
			sch = null;
			System.out.println("Input command(r, l, p, q)");
			System.out.println("r = round robin, l = least job, p = priority allocation");
			System.out.println("q = exit");
			System.out.print(">>>");
			command = sc.nextLine().toLowerCase().charAt(0);
			switch (command) {
			case 'r':sch = new RoundRobin();break;
			case 'l':sch = new LeastJob();break;
			case 'p':sch = new PriorityAllocation();break;
			case 'q':System.out.println("Quit"); run = false;break;
			default:
				System.out.println("wrong command. select again.");
				break;
			}
			if(sch!=null) {
				sch.getNextCall();
				sch.sendCallToAgent();
			}
		}
		sc.close();
	}
}

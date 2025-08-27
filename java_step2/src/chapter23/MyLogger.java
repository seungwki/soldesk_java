package chapter23;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {
	// 현재 시간
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void log(Object obj) {
		String time = LocalTime.now().format(formatter);
		System.out.printf("%s\t[%9s]\t%s\n", time, Thread.currentThread().getName(), obj);
	}
}
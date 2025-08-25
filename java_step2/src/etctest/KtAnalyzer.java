package etctest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class KtAnalyzer {
	public static void main(String[] args) {
//		File file = new File("test.txt");
		File file = new File("C:\\Users\\d\\git\\soldesk_java_2\\java_step2\\src\\etctest\\chat903.txt");//위 파일의 절대경로
//		System.out.println("Absolute path: " + file.getAbsolutePath());
//		System.out.println("Exists: " + file.exists());
//		/*
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int len;
			boolean save = false;
			StringBuilder sb = new StringBuilder();
			Map<String, Integer> counter = new TreeMap<String, Integer>();
			while ((line = br.readLine()) != null) {
				len = line.length();
				for (int i = 0; i < len; i++) {
					if(line.charAt(i)=='[') {save = true;}//좌대괄호면 기록 시작
					if(line.charAt(i)==']') {save = false;}//우대괄호면 기록 종료
					if(save) {//저장 상태면 char 받아서 append
						sb.append(line.charAt(i));
					}
					if(!save && sb.length()!=0) {//저장상태가 아니고 sb에 뭐 들어있으면 저장하시오
						if(!counter.containsKey(sb.toString())) {
							counter.put(sb.toString(), 1);
						}else {
							counter.put(sb.toString(), counter.get(sb.toString())+1);
						}
						sb.delete(0,sb.length());
					}
				}//for
			}//while
			//파일 기록하기
//			for (Map.Entry<String, Integer> kv : counter) {}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
		}//finally
		//*/
		
		
	}//main
}//class
package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		int val;
		System.out.print("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+ (char)val);
		
		System.in.read();
		System.in.read();
		
		System.out.print("2번째 입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+ (char)val);
		
		//throws IOException 입력 예외 처리, input 사용시 필요
		}
}

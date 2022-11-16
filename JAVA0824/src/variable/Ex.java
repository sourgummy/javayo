package variable;

public class Ex {

	public static void main(String[] args) {
		//1. 기본 리터럴
		System.out.println(1); //정수형 리터럴
		System.out.println(3.14); //실수형 리터럴
		System.out.println('A'); //문자형 리터럴
		System.out.println(true); //논리형 리터럴
		
		//2. 확장형 리터럴
		System.out.println(5L); //정수형(long)형 리터럴 >> 숫자 뒤에 접미사 L 붙임
		System.out.println(1.5f); //실수형(float)형 리터럴 >> 숫자 뒤에 접미사 f 또는 F 붙임
		System.out.println("Hello, World~"); //문자열형(String) 리터럴
		
		//=====================
		//정수형 리터럴에서 진법 표현하는 방법
//		b=binary
//		h=hexa decimal
		System.out.println(10); //10진수
		
		System.out.println(0b1010); //2진수 1010 = 10진수 10
//		System.out.println(ob1234); //오류 발생! 0 또는 1만 사용
		
		System.out.println(012); //8진수 012 = 10진수 10
//		System.out.println(0789); //오류 발생! 0 ~ 7 사이만 사용 가능
		
		System.out.println(0xA); // 16진수 A = 10진수 10
//		System.out.println(oxG); // 오류 발생! 0 ~ 9 와 A ~ F 사이만 사용 가능!
	}

}

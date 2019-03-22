package jet190221;

public class Main1 {

	public static void main(String[] args) {
		
		//NullPointerException : 참조형 변수에 null이 대입되어 있는데 .을 이용해 멤버를 호출할 때 발생하는 예외
		/*
		int [] br = null;
		System.out.printf("%d\n", br.length); 
		*/
		//변수에 저장된 인스턴스 참조가 있는지 확인
		
		
		//NumberFormatException
		String num1 = "176";
		String num2 = "1 7";
		int n1 = Integer.parseInt(num1);	//'문자열'을 '정수'로 전환하는 구문
		int n2 = Integer.parseInt(num2);		
		
		
		int a = 10;
		System.out.printf("A : %d\n", a);
		
		int [] ar = {100, 200, 300};
		System.out.printf("Ar[0] : %d\n", ar[0]);
		//ArrayIndexOutOfBoundsException
		System.out.printf("Ar[3] : %d\n", ar[3]); //데이터가 3개 이므로 0-2번까지 존재하는데 범위를 넘어섰습니다.

		try {
		int r = 100/0;
		System.out.printf("R : %d\n", r);
		}catch(Exception e) {
			System.out.printf("예외가 발생했습니다.\n");		
		}
		
		System.out.printf("정상적으로 종료\n");
	
	}

}

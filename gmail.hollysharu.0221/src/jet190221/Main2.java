package jet190221;

public class Main2 {

	public static void main(String[] args) {
		//예외가 생기는 3가지 경우
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {	
		String str = "Hello";
		throw new NumberFormatException(); //강제 NumberFormatException을 발생 시킴
		//NullPointerException 발생
		//System.out.printf("%s\n", str.toUpperCase());
		
		//정수로 변경하려다 예외 발생 - NumberFormatException
		//int num = Integer.parseInt("2_2");
		
		/*
		}
		//NullPointerException이 발생했을 때 호출되는 블럭
		catch(NullPointerException | NumberFormatException e) {
			System.out.printf("%s\n", e.getMessage());	
		}
		*/
		
		/*
		//NumberFormatException 처리
		catch(NumberFormatException e) {
			System.out.printf("NumberFormatException\n");	
		}
		*/

		//상위 클래스의 참조형 변수에는 하위 클래스 타입의 인스턴스 참조를 대입할수 있습니다.
		//'NumberFormatException'클래스와 'NullPointerException'클래스는 모두 'RuntimeException' 클래스로부터 상속 받았기 때문에
		//'RuntimeException' 클래스의 참조형 변수에 대입이 가능합니다.
		//'RuntimeException' 클래스는 'Exception' 클래스로 부터 상속 받았으므로
		//'Exception'으로 수정해도 동일한 결과가 나옵니다.
		}
		catch(Exception e) {
		System.out.printf("%s\n", e.getMessage());	
		}
		
		//예외 발생 여부에 상관없이 수행
		finally {
			System.out.printf("Free Pass\n");
		}
		
		System.out.printf("Shut Down.\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package jet190221;

public class Main2 {

	public static void main(String[] args) {
		//���ܰ� ����� 3���� ���
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {	
		String str = "Hello";
		throw new NumberFormatException(); //���� NumberFormatException�� �߻� ��Ŵ
		//NullPointerException �߻�
		//System.out.printf("%s\n", str.toUpperCase());
		
		//������ �����Ϸ��� ���� �߻� - NumberFormatException
		//int num = Integer.parseInt("2_2");
		
		/*
		}
		//NullPointerException�� �߻����� �� ȣ��Ǵ� ��
		catch(NullPointerException | NumberFormatException e) {
			System.out.printf("%s\n", e.getMessage());	
		}
		*/
		
		/*
		//NumberFormatException ó��
		catch(NumberFormatException e) {
			System.out.printf("NumberFormatException\n");	
		}
		*/

		//���� Ŭ������ ������ �������� ���� Ŭ���� Ÿ���� �ν��Ͻ� ������ �����Ҽ� �ֽ��ϴ�.
		//'NumberFormatException'Ŭ������ 'NullPointerException'Ŭ������ ��� 'RuntimeException' Ŭ�����κ��� ��� �޾ұ� ������
		//'RuntimeException' Ŭ������ ������ ������ ������ �����մϴ�.
		//'RuntimeException' Ŭ������ 'Exception' Ŭ������ ���� ��� �޾����Ƿ�
		//'Exception'���� �����ص� ������ ����� ���ɴϴ�.
		}
		catch(Exception e) {
		System.out.printf("%s\n", e.getMessage());	
		}
		
		//���� �߻� ���ο� ������� ����
		finally {
			System.out.printf("Free Pass\n");
		}
		
		System.out.printf("Shut Down.\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

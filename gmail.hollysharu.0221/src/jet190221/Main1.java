package jet190221;

public class Main1 {

	public static void main(String[] args) {
		
		//NullPointerException : ������ ������ null�� ���ԵǾ� �ִµ� .�� �̿��� ����� ȣ���� �� �߻��ϴ� ����
		/*
		int [] br = null;
		System.out.printf("%d\n", br.length); 
		*/
		//������ ����� �ν��Ͻ� ������ �ִ��� Ȯ��
		
		
		//NumberFormatException
		String num1 = "176";
		String num2 = "1 7";
		int n1 = Integer.parseInt(num1);	//'���ڿ�'�� '����'�� ��ȯ�ϴ� ����
		int n2 = Integer.parseInt(num2);		
		
		
		int a = 10;
		System.out.printf("A : %d\n", a);
		
		int [] ar = {100, 200, 300};
		System.out.printf("Ar[0] : %d\n", ar[0]);
		//ArrayIndexOutOfBoundsException
		System.out.printf("Ar[3] : %d\n", ar[3]); //�����Ͱ� 3�� �̹Ƿ� 0-2������ �����ϴµ� ������ �Ѿ���ϴ�.

		try {
		int r = 100/0;
		System.out.printf("R : %d\n", r);
		}catch(Exception e) {
			System.out.printf("���ܰ� �߻��߽��ϴ�.\n");		
		}
		
		System.out.printf("���������� ����\n");
	
	}

}

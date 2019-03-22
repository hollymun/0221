package ObjectTest;

public class Main {

	public static void main(String[] args) {
		
		// ��ȣ�� 1, �̸��� ���̸��� data �ν��Ͻ� ����
		Data data1 = new Data();
		data1.setNum(1);
		data1.setName("���̸�");
		
		
		//��ȣ�� 2, �̸��� ������ Data �ν��Ͻ��� ����
		Data data2 = new Data(2, "����");
		
		//data3�� ��ȣ '1'�� �̸� '���̸�'�� ����
		Data data3 = new Data(1, "���̸�");
		
		
		//data1, data2, data3 �� ���� 'new'�� �����߱� ������ ���ο� �޸𸮰����� �Ҵ� �޾ҽ��ϴ�.
		//�׷��� ������ ����Ű�� �ִ� ������ ��� �ٸ��ϴ�.
		//*'=='�� �����ϰ� �ִ� �����͸� ��
		System.out.printf("Data1 == Data2 : %b\n", data1 == data2);
		System.out.printf("Data1 == Data3 : %b\n", data1 == data3);
		
		
		Data data4 = data1;
		System.out.printf("Data1 == Data4 : %b\n", data1 == data4);
		
		
		System.out.printf("Data1 Equls Data2 : %b\n", data1.equals(data2));
		
		//data1�� data3�� ������ ����������� num�� ���� ���Ƽ� 'true'
		System.out.printf("Data1 Equls Data3 : %b\n", data1.equals(data3));
		
		//������ ����
		Data data5 = data1.clone();
		
		
		//�Ϲ� ������ ������ ���, ��� ������ ���� �����͸� �����ϸ� �ٸ��ʿ� ������ �ݴϴ�.
		data4.setName("����");
		System.out.printf("%s\n", data1.getName());
		
		
		//������ ����� ���� ���� �����ʹ� ���������� ���� �ٸ� ��ҿ� �����͸� ������ �ִ� ���̱� ������
		//��� ������ ������ �ٸ� �����Ϳ� ������ ���� �ʽ��ϴ�.
		data5.setNum(7);
		System.out.printf("%d\n", data1.getNum());
		
		
		//'���ڿ�'�� ���ϼ��� Ȯ���� �� '=='�� ����ϸ� �ȵǰ� 'equals'�� �̿��ؾ� �մϴ�.
		String id = "Ci";
		String copy = new String("Ci");
		System.out.println(id.equals(copy));
		System.out.println(id == "Ci");
		
		
		
	}

}

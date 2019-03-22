package ObjectTest;

//��ȣ�� �̸��� (���)�����ϴ� Ŭ����
public class Data {
	//������ private����
	private int num;
	private String name;
	
	
	
	//�Ű������� ���� ������ - default constructor 
	public Data() {
		super();
	}


	//�Ű������� 2�� �ִ� ������
	public Data(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}



	//������ �����Ҽ� �ִ� �޼ҵ� - ������ �޼ҵ�
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//������ ���ϴ� equals �޼ҵ�
	public boolean equals(Data other) {
		return this.num == other.num;
	}
	
	
	
	//�ڱ� �ڽŰ� ������ ������ ���� �����͸� �����ϴ� �޼ҵ�
	public Data clone() {
		//���ο� �ν��Ͻ� ����
		Data other = new Data();
		//���� �����͸� ����
		other.setNum(this.num);
		other.setName(this.name);
		//������� �ν��Ͻ��� ����
		return other;
		
	}
		
}

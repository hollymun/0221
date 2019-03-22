package ObjectTest;

//번호와 이름을 (묶어서)저장하는 클래스
public class Data {
	//변수는 private으로
	private int num;
	private String name;
	
	
	
	//매개변수가 없는 생성자 - default constructor 
	public Data() {
		super();
	}


	//매개변수가 2개 있는 생성자
	public Data(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}



	//변수에 접근할수 있는 메소드 - 접근자 메소드
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
	
	
	
	//내용을 비교하는 equals 메소드
	public boolean equals(Data other) {
		return this.num == other.num;
	}
	
	
	
	//자기 자신과 동일한 내용을 가진 데이터를 복사하는 메소드
	public Data clone() {
		//새로운 인스턴스 생성
		Data other = new Data();
		//세부 데이터를 복사
		other.setNum(this.num);
		other.setName(this.name);
		//만들어진 인스턴스를 리턴
		return other;
		
	}
		
}

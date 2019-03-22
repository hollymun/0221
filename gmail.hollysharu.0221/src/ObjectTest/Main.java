package ObjectTest;

public class Main {

	public static void main(String[] args) {
		
		// 번호가 1, 이름이 아이린인 data 인스턴스 생성
		Data data1 = new Data();
		data1.setNum(1);
		data1.setName("아이린");
		
		
		//번호가 2, 이름이 수지인 Data 인스턴스를 생성
		Data data2 = new Data(2, "수지");
		
		//data3에 번호 '1'과 이름 '아이린'을 저장
		Data data3 = new Data(1, "아이린");
		
		
		//data1, data2, data3 은 전부 'new'를 생성했기 때문에 새로운 메모리공간을 할당 받았습니다.
		//그렇기 때문에 가리키고 있는 참조가 모두 다릅니다.
		//*'=='는 저장하고 있는 데이터만 비교
		System.out.printf("Data1 == Data2 : %b\n", data1 == data2);
		System.out.printf("Data1 == Data3 : %b\n", data1 == data3);
		
		
		Data data4 = data1;
		System.out.printf("Data1 == Data4 : %b\n", data1 == data4);
		
		
		System.out.printf("Data1 Equls Data2 : %b\n", data1.equals(data2));
		
		//data1과 data3는 별개로 만들어졌지만 num의 값이 같아서 'true'
		System.out.printf("Data1 Equls Data3 : %b\n", data1.equals(data3));
		
		//데이터 복제
		Data data5 = data1.clone();
		
		
		//일반 참조를 복사한 경우, 어느 한쪽이 세부 데이터를 변경하면 다른쪽에 영향을 줍니다.
		data4.setName("혜리");
		System.out.printf("%s\n", data1.getName());
		
		
		//복제를 사용한 경우는 현재 데이터는 동일하지만 서로 다른 장소에 데이터를 가지고 있는 것이기 때문에
		//어느 한쪽의 변경이 다른 데이터에 영향을 주지 않습니다.
		data5.setNum(7);
		System.out.printf("%d\n", data1.getNum());
		
		
		//'문자열'은 동일성을 확인할 때 '=='를 사용하면 안되고 'equals'를 이용해야 합니다.
		String id = "Ci";
		String copy = new String("Ci");
		System.out.println(id.equals(copy));
		System.out.println(id == "Ci");
		
		
		
	}

}

package 자동차클래스상속예제;
/*
 * 승용차(PassengerCar) 클래스 => 자식(하위) 클래스 역할
 */
public class PassengerCar extends Car {  //자식클래스이름 extends 부모클래스이름
//	부모 클래스에 default 생성자를 만들어줘야지 에러가 발생 안한다.
//	아래에 있는 것을 "부모(상위) 클래스"에 디폴트(default) 생성자 생성 => 코드 재사용 개념
	
//	[중요] 다형성 구현의 한가지 방법 => 메소드 오버라이딩
	/*
	 * 메소드 오버라이딩이란? => "상속" 관계인 경우 부모 클래스의 메소드 이름과
	 *                            자식 클래스의 메소드 이름이 같으면
	 */
	public void speedUp(int velocity) {
		speed = speed + velocity;
//		속도에 제한을 둔다.
		if (speed > 100) {  //고속도로 경부선이라 가정하자
			speed = 100;  //100이 넘으면 100으로 맞춰줘라
		}
	}
	
	public static void main(String[] args) {
		PassengerCar myCar = new PassengerCar();
		myCar.speedUp(130);
		System.out.println("PassengerCar speed is " + myCar.speed);
//		PassengerCar speed is 100 출력됨
		
	}

}

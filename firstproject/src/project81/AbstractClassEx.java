package project81;

abstract class Animal{// 추상 클래스는 생성시, 상속시 반드시 빈메서드를 구현해야함.
	public static void main(String[] args) {}
}
		
	
	// 구현 == {} << 중괄호 있으면 됨. 문법적으로 내용은 중요하지 않음.
/*	public void moving() {
		System.out.println("움직인다.");
		
	}
	public abstract void sound(); {// 추상메서드
		//동물은 움직인다는 기능은 다 가지고 있고, 소리도 다 가지고 있지만
		//소리는 다 다르므로 이 클래스를 사용하면 sound() 클래스를 무조건 만들어서 사용 해야함..
		//반 완성 클래스 
	}
}
*/
//	public class AbstractClassEx{
//		Animal ani = new Animal() {
//			
//			@Override
//			public void sound() {
//				
//						
//			}
//		};
//	}
//}

// 추상 클래스 - 일반 클래스에 추상 메서드를 포함하고 있는 것.
// 일반 클래스 + 완성되지 않은 메서드를 1개라도 포함 하고 잇는 것.
// 완성되지 않은 클래스는 body( {} )가 없는것
// void plus(); <== 추상 메서드 ==> 이런식으로 중괄호 없이 끝남 
// 그냥은 쓸 수 없고 상속 받아서 쓸 수 있음.
// 공통된 특성을 추출해서 메서드를 뽑아 놓은 것.
// 사용할 때 반드시 오버라이드 해줘야 함.
// 이 클래스를 상속 받으려면 반드시 완성해서 사용 할 수 있도록 강제함. 
// 추상클래스 라는 의미로 abstract 라는 예약어를 사용함.
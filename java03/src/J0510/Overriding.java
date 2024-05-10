package J0510;

class Weapon{
	protected int fire() {
		return 1;// 공 1 파벳
	}
}
class Cannon extends Weapon{
	@Override // @는 어노테이션(시스템 주석)=>생략해도 문제없음
	protected int fire() {
		return 10;// 탱크 공 10
	}
}

public class Overriding {
	public static void main(String[] args) {
	
	Weapon weapon;
	weapon = new Weapon();
	
	System.out.println("기본 무기의 공력력 : "+weapon.fire());
	
	weapon = new Cannon();// 업캐스팅
	System.out.println("오버라이딩된 대포의 공격력 : "+weapon.fire());
		
	}
}

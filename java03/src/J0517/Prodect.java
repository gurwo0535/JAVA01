package J0517;


//T = Tv , M = String

public class Prodect<T,M> {
	private T kind;//4.tv
	private M model;//4.스마트 TV
	
	//T = Tv 메소드 리턴타입
	public T getKind() {
		return kind;
	}
	
	//T = Tv 매개변수 타입
	public void setKind(T kind) {//2.tv
		this.kind = kind;//3.tv / 값 저장 
	}
	
	// M = String 메소드 리턴타입
	public M getModel() {
		return model;
	}
	
	// M = String 매개변수 타입
	public void setModel(M model) {//2.스마트 TV
		this.model = model;//3.스마트 TV / 값 저장
	}
	

	
}

package J0517;


public class ProdectExample {
	public static void main(String[] args) {
		Prodect<Tv, String> product1 = new Prodect<>();
		
		//0.tv
		product1.setKind(new Tv());
		//0.스마트 TV
		product1.setModel("스마트 TV");
		
		// Tv 객체
		Tv tv = product1.getKind();
		
		//J0517.Tv@3d012ddd (패키지.클래스@해시코드)
		System.out.println(tv);
		
		//스마트 TV
		String tvModel = product1.getModel();
		System.out.println(tvModel);
		
		
		Prodect<Car, String> prodect2 = new Prodect<>();
		prodect2.setKind(new Car());
		prodect2.setModel("디젤");
		
		Car car = prodect2.getKind();
		
		//J0517.Car@5e91993f (패키지,클래스,해시코드)
		System.out.println(car);
		
		//디젤 
		String carModel = prodect2.getModel();
		System.out.println(carModel);
	}
}

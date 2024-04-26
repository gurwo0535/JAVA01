package chapter02;



public class Main {
    public static void main(String[] args) {
        Grade grade1 = new Grade("강백호", 90.0, 85.5, 70.0);
        Grade grade2 = new Grade("채치수", 82.0, 92.0, 60.5);
        
        System.out.println("강백호의 평균 점수: " + grade1.avg);
        System.out.println("채치수의 평균 점수: " + grade2.avg);
    }
}
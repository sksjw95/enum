package enum1;

public class Main {
    public static void main(String[] args) {

        Seasons seasons = Seasons.SPRING;
        switch (seasons){
            case Seasons.SPRING:
                System.out.println("봄");
                break;
            case Seasons.SUMMER:
                System.out.println("여름");
                break;
            case Seasons.FALL:
                System.out.println("가을");
                break;
            case Seasons.WINTER:
                System.out.println("겨울");
                break;
        }
    }
}
// 오류가 발생한다. 왜냐면 switch문의 조건은 char,byte,short,int,Character,Byte,Integer,String,enum
// 타입만 가능하기 때문이다.
package enum1;

public class Main2 {
    public static void main(String[] args){
        Seasons2 seasons = Seasons2.SPRING;
        switch (seasons){
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
    }
}

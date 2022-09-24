public class OneTest {
    public static void main(String[] args) {
        One staticField1 = new One(); // 객체 생성
        One staticField2 = new One();

        staticField1.num1 = 100;
        staticField2.num1 = 2000;

        System.out.println(staticField1.num1);
        System.out.println(staticField2.num1);

        staticField1.num2 = 150;
        staticField2.num2 = 2000;
        System.out.println(staticField1.num2);
        System.out.println(staticField2.num2);

    }
}

class One {
    int num1 = 10;
    static int num2 = 15;
}
public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);
        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
// 반가워요 나의 나이는 20살 이에요.
String result = s1 + age + "살 이에요";
System.out.println(result);

//n1을 0으로 나눈 결과를 출력해 보세요.
      //  System.out.println(n1 / 0);

        //비교 연산자
        // >, <, >=, <==, ==, !=
        //논리 연산자
        //&&(and), ||(or), !(not)
        //비교판단 --- if

        //비교연산과 논리연산의 결과는 항상 논리값이다.
        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 != 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 >= 2);
        System.out.println(trueOrFalse);

        //x라는 int 변수가 있어요.
        //x가 1~10 사이의 값이면, true를 그렇지 않으면 False
        //1<= x <=10
        //x는 1보다 크거나 같고 x는 10보다 작거나 같다.
        int x = 9;
        trueOrFalse = (1 <= x && x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (1 <= x || x <= 10);
        System.out.println(trueOrFalse);

        System.out.println("========");
        //문자열 비교
        String grade = "VIP";
        String myGrade = "VIP";
        trueOrFalse = grade == (myGrade);
        trueOrFalse = grade.equals(myGrade);
        System.out.println(trueOrFalse);
 }
}

public class Calcurator {
    //두 수 a = 20, b = 5
    //두 수를 더하고, 빼고, 곱하고, 나눈 결과를
    // 각각 출력
    public static void main(String[] args) {
        int a = 20;
        int b = 3;


        //1. 덧셈
        int sum = a + b;
        System.out.println(a + b);
        //2. 나눗셈
        int minus = a - b;
        System.out.println(a - b);
        //3. 곱셈
        int multiply = a * b;
        System.out.println(a * b);
        //4. 나눗셈
        double divide = (double) a / b;
        System.out.println("나눗셈 결과 : " + divide);
        //5. 나머지를 구하는 연산자(%)
        //7을 3으로 나눈 나머지
        System.out.println(7 %3);
        //3을 7로 나눈 나머지
        System.out.println(3 %7);

        // 문제. 7을 3으로 나눈 나머지와 몫을 구하시오
        //출력형식은 다음과 같이
        //목 : 2, 나머지 : 1
        //1. 몫
        int result = 7 / 3;
        String r1 = "몫은 : " + result;
        System.out.println(r1);
        //2. 나머지
        int less = 7 % 3;
        String r2 = "나머지는 : " + less;
        System.out.println("나머지는 : " + less);
        //3. 합해서 출력
        System.out.println(r1 + r2);

    }

}

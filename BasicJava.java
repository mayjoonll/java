public class BasicJava {
    public static void main(String[] args) {
        //1. a를 temp에 넣는다.
        //2. b를 a로 보낸다.
        //3. temp를 b로 보낸다.
        //4. 바꾼 이후 a와 b를 출력해본다.
        //
        //a와 b변수와 temp 선언하고, 초기값을 준다.
        int a = 10;
        int b = 20;
        int temp;
        // 바꾸기 전 a, b 를 출력
        System.out.println("A = " + a + ", B = " +b);
        System.out.println(a + b);
        temp = a;
        a = b;
        b = temp;
        //두 수 a,b를 바꾸는 작업을 합니다
        temp = a; //a값을 temp에 할당(넣는다.)
        System.out.println(a + b);
//        "a = " + 10 + ", b = " + b
        System.out.println("A = " + a + ", B = " +b);
    }
}

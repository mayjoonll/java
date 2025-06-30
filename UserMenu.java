package ch02;

import java.util.Scanner;

public class UserMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //a 좋아하는 그룹 번호를 선택하세요.
        //b 1.ive 2.세븐틴 3.에스파
        //->2
        //c 당신은 세븐틴 광팬입니다. ->e
        //만약 없는 번호를 선택하면..
        //d 잘 못 선택했습니다. -> a출력
        //e 종료하시겠습니까?(Y/N)

        // for (초기식; 조건식; 증감식)
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("좋아하는 그룹 번호를 선택하세요.");
            System.out.println("1.ive 2.세븐틴 3.에스파");

            String status = sc.next();

            switch (status){
                case "1":
                    System.out.println("당신은 ive 광팬입니다.");
                    break;
                case "2":
                    System.out.println("당신은 세븐틴 광팬입니다.");
                    break;
                case "3":
                    System.out.println("당신은 에스파 광팬입니다");
                    break;
                default:
                    System.out.println("잘 못 입력했어요");
                    continue;
            }

            System.out.println("종료하시겠습니까? Y/N");
            String endpoint = sc.next();

            if (endpoint.equals("Y")) {
                break;
            } else if (endpoint.equals("N")) {
                continue;
            } else {
                System.out.println("잘 못 입력");
                continue;
            }
        }
    }
}
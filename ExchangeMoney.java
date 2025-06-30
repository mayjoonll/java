public class ExchangeMoney {
    //2680원을 1000원, 500원, 100원, 10원
    //각각 몇개씩 최소로 필요한지 출력하세요
    public static void main(String[] args) {


        int coin = 2680; //초기 금액을 저장
        int restCoin = coin;

        System.out.println("바꿀 돈 :" + coin);

        restCoin = restCoinPrint(restCoin, 1000);
        restCoin = restCoinPrint(restCoin, 500);
        restCoin = restCoinPrint(restCoin, 100);
        restCoin = restCoinPrint(restCoin, 50);
        restCoin = restCoinPrint(restCoin, 10);
        //잔액을 출력하는 함수를 호출
        //잔액을 출력하는 함수;

    }
    static int restCoinPrint(int restCoin, int don){
        System.out.println(don + "원 개수 :" + (restCoin / don));
        restCoin = restCoin % don;
        System.out.println("잔액 :" + restCoin);
        return restCoin;
    }
}

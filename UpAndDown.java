package CodingPlay;
import java.util.Scanner;

//UpAndDown 게임 (Self-made)
public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPass = true; //초기값을 true로 지정(게임 진행)
        int num = (int) (Math.random() * 100) + 1; //랜덤 숫자


        while(isPass == true) {
            Rule(); //게임 룰 함수 설정
            for (int i = 0; i <= 10; i++) {
                int find = sc.nextInt(); // 입력값
                String unknownNum = ComputerRandomNum(find, num); //
                System.out.println("compuer : " + num);
                System.out.println(unknownNum);
                if (unknownNum.equals("성공입니다!")) {
                    System.out.println("총 카운트는 : " + i +"번에 성공하셨습니다..");
                    System.out.println("------------------------------------");
                    isPass = false;
                    break;
                }
                else if(i == 10){
                    System.out.println("실패 : 총 카운트 횟수가 끝났습니다.");
                    System.out.println("------------------------------------");
                    isPass = false;
                    break;
                }
            }
            while(isPass == false){
                System.out.println("[게임을 종료하시겠습니까? [종료] [재시작]]");
                String restart = sc.next();
                if(restart.equals("종료")){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
                else if(restart.equals("재시작")){
                    System.out.println("게임을 재시작합니다.");
                    isPass = true;
                    break;
                }
                else{
                    System.out.println("다시 입력해주십시오.");
                }
            }
        }
}
    public static String ComputerRandomNum(int n,int cn) {
        if(n <= 100 && n >= 1){
                if(n == cn){
                    return "성공입니다!";
                }
                else if(cn > n){
                    return "UP 입니다!";
                }
                else{
                    return "DOWN 입니다!";
                }
            }
        else{
            return "잘못된 값입니다.";
        }
    }
    public static void Rule(){
        System.out.println("[UP AND DOWN 게임!!!]");
        System.out.println("------------------------------------------------");
        System.out.println("[게임 설명]");
        System.out.println("[1. 1부터 100중 랜덤으로 숫자가 지정됩니다.");
        System.out.println(" 2. 지정된 숫자를 맞추는데 기회는 총 10번입니다.");
        System.out.println(" 3. 기회 안에 지정된 숫자를 맞추면 성공 못 맞히면 실패!] ");
        System.out.println("------------------------------------------------");
        System.out.println("[게임 시작!]");
    }
}


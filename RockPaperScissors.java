package CodingPlay;
//가위바위보 게임(Self-made game)
import java.util.Scanner;
    public class RockPaperScissors {
        public static void main(String[] args) {
            for(;;) {
                Scanner sc = new Scanner(System.in);
                int com = (int) ((Math.random() * 3) + 1); //컴퓨터 랜덤 값 1~3
                System.out.println("[가위바위보 게임]");
                System.out.println("---------------------------");
                System.out.println("[가위 : 1] [바위 : 2] [보 : 3]");
                System.out.println("[0을 입력할 시 게임을 종료합니다.]");
                int Input = sc.nextInt(); // 내가 입력하는 값
                while (Input != 0) {
                    String output = rockPaperScissors(Input); //내가 입력하는 값
                    System.out.println("ME : " + output);
                    String comput = computer(com);
                    System.out.println("Compurter : " + comput);
                    String output1 = result(Input, com);
                    System.out.println(output1);
                    break;
                }
                if(Input == 0){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }
        }
        public static String rockPaperScissors(int i){
            if(i == 1){
                return "가위 입니다.";
            }
            else if(i == 2){
                return "바위 입니다.";
            }
            else if(i == 3){
                return "보 입니다.";
            }
            else {
                return "잘못된 입력값입니다.";
            }
        }
        public static String computer(int i) {
            if (i == 1) {
                return "가위 입니다.";
            } else if (i == 2) {
                return "바위 입니다.";
            } else{
                return "보 입니다.";
            }
        }
        public static String result(int num1, int num2){
            if(num1 == num2){
                return "무승부!";
            }
            else if((num1 == 1 && num2 == 2)||(num1 == 2 && num2 == 3)||(num1 == 3 && num2 == 1)){
                return "COMPUTER WIN";
            }
            else {
                return "ME WIN";
            }
        }
    }

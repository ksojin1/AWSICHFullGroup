import java.util.Scanner;

public class FlowEx1 {
	public static void main(String[] args) {
		
//		조건문
//		조건문은 프로그램의 흐름(flow)을 바꾸는 역할을 한다
//		if(조건식) { 블럭(block)
//			//조건식이 true일 때 수행될 문장들을 적는다
//		}
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("입력한 숫자는 0입니다");
		}
		scan.close();
		
	}
}

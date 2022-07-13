import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		
//		중첩 if문
//		
//		if(조건식1) {
//			조건식1이 true 일때
		
//			if(조건식2) {
//				조건식2이 true 일때
//			}else {
//				조건식1이 true이고, 조건식2이 false일 때
//			}
		
//		}else {
//			조건식1이 false일 때
//		}
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		System.out.println("점수를 입력하세요");
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade = grade + "+";
			}else if(score <= 92) {
				grade = grade + "-";
			}
		}else if(score >= 80) {
			grade = "B"; 
			if(score >= 85) {
				grade = grade + "+";
			}else if(score <= 82) {
				grade = grade + "-";
			}
		}else if(score >= 70){
			grade = "C";
			if(score >= 75) {
				grade = grade + "+";
			}else if(score <= 72) {
				grade = grade + "-";
			}
		}else if(score >= 60){
			grade = "D";
			if(score >= 65) {
				grade = grade + "+";
			}else if(score <= 62) {
				grade = grade + "-";
			}
		}else {
			grade = "F";
		}	
		
		System.out.println("당신의 점수는 "+ score + "이고 등급은 "
		+ grade + "입니다");
		
		scan.close();
	}
}

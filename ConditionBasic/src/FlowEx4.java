public class FlowEx4 {
	public static void main(String[] args) {
		
//		if-else if문
//		
//		if(조건식1) {
//			조건식1이 true 일때 수행
//		}else if(조건식2){
//			조건식2이 true 일때 수행
//		}else if(조건식3){
//			조건식3이 true 일때 수행
//		}else {
//			위의 어느 조건식도 만족하지 않을 때 수행
//		}
		
		int score = 0;
		String gradeStr = "";
		
		score = 70;
		
		if(score >= 90) {
			gradeStr = "A";
		}else if(score >= 80) {
			gradeStr = "B";
		}else {
			gradeStr = "F";
		}
		
		System.out.println("당신의 학점은 " + gradeStr + "입니다");
	}
}

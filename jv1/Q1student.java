package sys;

public class Q1student {

	String college;
	int stuNum;
	
	public void prtInfo() {
		System.out.println("학과 : "+ this.college);
		System.out.println("학번 : "+ this.stuNum);
	}
	
	public static void main(String[] args) {
		
		Q1student stu = new Q1student();
		stu.college = "컴퓨터 정보 공학과";
		stu.stuNum = 20131603;
		stu.prtInfo();

	}

}

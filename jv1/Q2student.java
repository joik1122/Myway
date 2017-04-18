package sys;

public class Q2student {

	private String college;
	private int stuNum;
	
	public void setter(String col, int num) {
		this.college = col;
		this.stuNum = num;
	}
	
	public void getter() {
		System.out.println("학과 : "+ this.college);
		System.out.println("학번 : "+ this.stuNum);
	}
	
	
	public static void main(String[] args) {
		
		Q2student stu = new Q2student();
		stu.setter("컴퓨터 정보 공학과", 20131603);
		stu.getter();

	}

}
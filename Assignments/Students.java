package week4.day2.Assignments;

public class Students {
	
	public void getStudentInfo(int id, String Name) {
		System.out.println(id +" "+ Name);
	}
	
	public void getStudentInfo(String email, long phoneNum) {
		System.out.println(email +" "+ phoneNum);
	}
	
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.getStudentInfo(123, "Aysha");
		obj.getStudentInfo("aysha.patkar95@gmail.com", 9876543210l);

	}


}
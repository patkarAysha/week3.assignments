package week4.day1.Assignments;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Aysha");

	}

	public void studentDept() {
		System.out.println("MCA");

	}

	public void studentId() {
		System.out.println("D16");

	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
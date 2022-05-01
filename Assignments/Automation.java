package week4.day2.Assignments;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		
		Automation obj = new Automation();
		
		obj.python();
		obj.Java();
		obj.ruby();
		obj.Selenium();

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}

}
package my.testing.examples;

class Student {
	private String name;
	private int age;
	private int grade;
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
} // public class Student

class Classes extends Student{
	private String className;
	
	public Classes(String name, int age, int grade, String className) {
		super(name, age, grade);
		// TODO Auto-generated constructor stub
		this.className = className;
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
}

public class Example_OOP {
	
	public static void main(String[] args) {
		Student myStudent = new Student("West", 34, 15);
		System.out.println(myStudent.getName());
		
		Classes myClasses = new Classes(myStudent.getName(), myStudent.getAge(), myStudent.getGrade(), "Math");
		System.out.println("myClasses.getClassName()=" + myClasses.getClassName() + " myClasses.getAge()=" + myClasses.getAge());
	}
}

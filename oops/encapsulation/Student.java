package encapsulation;

public class Student {
private String name;
private int mark;
private char grade;
public Student(String name, int mark) {
	super();
	
	this.name = name;
	this.mark = mark;
	this.gradeCalculate();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMark() {
	return mark;
}

public void setMark(int mark) {
	this.mark = mark;
}

public void gradeCalculate() {
	if(mark>90) {
		grade='A';
	}
	else if(mark>=80 && mark<=90) {
		grade='B';
	}
	else if(mark>=70 && mark<=80) {
		grade='C';
	}
	else if(mark>=60 && mark<=70) {
		grade='D';
	}
	else {
		grade='E';
	}
}
@Override
public String toString() {
	return "Student [name=" + name + ", mark=" + mark + ", grade=" + grade + "]";
}


}

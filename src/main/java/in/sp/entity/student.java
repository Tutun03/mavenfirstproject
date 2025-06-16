package in.sp.entity;

public class student {
private String name;
private int rollno;
private float marks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
}


}

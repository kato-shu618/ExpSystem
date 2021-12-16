import java.util.ArrayList;

public class StudentList{
	private ArrayList<Student> arrayList = new ArrayList<Student>();
	
	public StudentList(){
	}
	public void add(Student student){
		this.arrayList.add(student);
	}
	public Student get(int index){
		return this.arrayList.get(index);
	}
	public int size(){
		return this.arrayList.size();
	}
	public Student remove(int index){
		return this.arrayList.remove(index);
	}
}
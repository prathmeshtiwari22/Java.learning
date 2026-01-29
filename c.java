import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 //HashMap<Integer, Student> hashmap = new HashMap<>();
	 //hashmap.put(1,new Student(1,"Klaus",90));
	 //hashmap.put(2,new Student(2,"laus",91));
	 //hashmap.put(3,new Student(3,"aus",93));
	 //for(Map.Entry<Integer,Student> s: hashmap.entrySet()){
	   //  Student st=s.getValue();
	     //  System.out.println(
        //"Key: " + s.getKey() +
        //", RollNo: " + st.getRollNo() +
        //", Name: " + st.getName() +
        //", Marks: " + st.getMarks()           
    //);
    //<Student> hashset = new HashSet<>();
    //hashset.add(new Student(1,"Klaus",98)); //hashcode and 
    //for (Student s : hashset) {
      //  System.out.println(s.getName());
//}
    TreeMap<Integer, Student> map = new TreeMap<>();

map.put(1, new Student(1, "Java", 89));
map.put(2, new Student(2, "Python", 86));
map.put(3, new Student(3, "C++", 90));

for (Map.Entry<Integer, Student> entry : map.entrySet()) {
    Student s = entry.getValue();
    System.out.println(
        "Key: " + entry.getKey() +
        ", Name: " + s.getName() +
        ", Marks: " + s.getMarks()
    );
}


	 }
	}

class Student {

    // private data members)
    private int rollNo;
    private String name;
    private double marks;

    // constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for marks
    public double getMarks() {
        return marks;
    }

    // setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }
}

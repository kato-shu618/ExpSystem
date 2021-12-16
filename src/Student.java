public class Student {
    private String name;
    private String id;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
}
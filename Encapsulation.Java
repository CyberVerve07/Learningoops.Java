class Student {
    private String name;
    private int rollNo;
    private int marks;
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public int getMarks() {
        return marks;
    }
    
    // Setter methods
    public void setName(String newName) {
        name = newName;
    }
    
    public void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }
    
    public void setMarks(int newMarks) {
        marks = newMarks;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rahul");
        s1.setRollNo(101);
        s1.setMarks(85);
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());
    }
}

class Student {
    String name;
    int mark;
}


public class objectstring{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name ="sanjeev";
        s1.mark = 99;

        System.out.println(s1.name + " : " + s1.mark);
    }
    
}
class studentdashboard{
    void yourname(){
        System.out.print("My name is :");
    }
    static void yourcollege(){
        System.out.print("My college name is : ");
    }
}



public class methodpractice {
    public static void main (String [] args){

        studentdashboard student1 = new studentdashboard();
        student1.yourname();
        System.out.println("Sanjeev");

        studentdashboard.yourcollege();
        System.out.print("Kncet");
    }

}
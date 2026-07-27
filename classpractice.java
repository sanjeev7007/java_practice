class Addition{
    public int add(int a , int b)
    {
        return a + b;
    }
}
public class classpractice{
    public static void main(String a[]){

        Addition add = new Addition();
        int result = add.add(8,9);
        System.out.println(result);
    }
}
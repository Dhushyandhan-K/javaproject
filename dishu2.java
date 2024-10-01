interface printable{
    void print();
    
}
interface showable{
    void print();
}
class A7 implements prnintable,showable
{
    public void print()
    {
        System.out.println("hello");
        
    }
    public void show()
    {
        System.out.println("welcome");
        
    }
     public static void main (String[] args) {
        A7 obj=new A7();
        obj.print();
        obj.show();
        
        
    }
}
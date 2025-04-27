 class A
{
    void bca()
    {
        System.out.println("Hello JAVA");
    }
} 
class b extends A
{
    void Ajay()
    {
        int c=1000;
        if(c%2==0)
        {
            System.out.println("value is even");
        }
        else{
            System.out.println("value is odd");
        }
    }
}
class mca extends b
{
    public static void main(String[] args) {
        mca m=new mca();
        m.bca();
        m.Ajay();
    }
}
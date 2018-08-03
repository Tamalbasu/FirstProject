public class TestSigleton implements  Cloneable{
    private static TestSigleton ourInstance = new TestSigleton();

    public static TestSigleton getInstance() {
        return ourInstance;
    }



    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}

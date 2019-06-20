package arrayListCollections;
public class MainClasshy
{
    public static void main(String[] args) 
    {
        Object[] stringArray = new Integer[5];   //No compile time error : String[] is auto-upcasted to Object[]
         
        stringArray[1] = 20;     
         
        stringArray[2] = 100;     //No compile time error, but this statement will throw java.lang.ArrayStoreException at run time
         
        //because we are inserting integer element into an array of strings
    }
}
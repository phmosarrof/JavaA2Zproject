package arrayListCollections;
public class enhancedforloop 
{ 
    public static void main(String args[]) 
    { 
        String [] array = {"Ron", "Harry", "Hermoine", "Karim", "Done"}; 
        System.out.println(array.length); 
        
        int [] data = {3,9,15,7,4,8,234,99,0,6};
  
        //enhanced for loop 
        for (String a:array) 
        { 
            System.out.println(a); 
        } 
        for (int x: data) 
        { 
            if(x<200 && x%2+1==2 || x>0 && x/3==3) {
            	System.out.println(x);
            }
        } 
  
        /* for loop for same function
        for (int i = 0; i < array.length; i++) 
        { 
            System.out.println(array[i]); 
        } 
        */
    } 
}
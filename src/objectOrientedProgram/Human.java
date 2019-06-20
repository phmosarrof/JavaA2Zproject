package objectOrientedProgram;

class Human1 {
    
    char gender; // 'M' 'F' 'U' N  // Member variable declaration
    String fname; // "M" // Member variable declaration
    String lname; // Member variable declaration
    int age; // 45 // Member variable declaration
    float weight; // 145 // Member variable declaration
    double height;  
    boolean isAlive;   // true or false
    boolean isUSCitizen;
    
    String dob; // "12/5/1968"  
    String ssn;  // 265529655 
    String phoneNo; // "2052396211"
    
    public Human1() {
    	
    }
    
    public String Human1() {
    	System.out.println("It's a constructor");
		return dob;
    }
    
   
    
    
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public boolean isUSCitizen() {
        return isUSCitizen;
    }
    public void setUSCitizen(boolean isUSCitizen) {
        this.isUSCitizen = isUSCitizen;
    }
    public int getAge() { //get   ter
        return age;
    }
    
    public void setAge(int age) {  // setter
        
        this.age = age;
    }
    
}   // End of the Human class

public class Human {
    public static void main(String[] args) {
        int ismail;
        ismail = 15;
        //int ismail = 15;
                
        Human1 faisal = new Human1();
        
        //System.out.println();
        
        
        
       /* Human1 mahdi = new Human1();
        Human1 munim = new Human1();
        
        ((Human1) faisal).setAge(25);
        
        mahdi.setAge(1);
        munim.setAge(10);
        
        System.out.println("faisal's age = " + faisal.getAge());
        System.out.println("faisal's citizenship = " + faisal.isUSCitizen);
        
        System.out.println("mahdi's age = " + mahdi.getAge());
        System.out.println("munim's age = " + munim.getAge());*/
        
        
    }
}  // End of HelloWorld2 class 
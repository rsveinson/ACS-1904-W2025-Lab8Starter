// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.Serializable;

/** 
 * ACS-1904 Lab 8
 * @Sveinson 
 * Oops, there seems to be a problem here
 * fis this class so that it writes out
 * to the XML fle correctly
*/

public class CatDebugXML{
    // fields
    private String name;
    private int age;
    
    // constructors
    
    public CatDebugXML(String name, int age){
        this.name = name;
        this.age = age;
    }// end full arg

    // getters and setters
    public String getname(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void SetAge(int age){
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        //return this.getName() + ": " + this.getAge();
        return name + " " + age;
    }
}


    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

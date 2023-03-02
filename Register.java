
public class Register {
    public boolean isValid(int age, Double gpa, int qualification){
        boolean isage = false;
        boolean isgpa=false;
        boolean isqual=false;
        //Check age
        if(age>17 && age<25)isage = true;
        //Check gpa
        if(gpa>=7.0)isgpa= true;
        //Check qualification
        if(qualification>=12)isqual= true;
        
        return isage&isgpa&isqual;
    }  
    
    
}

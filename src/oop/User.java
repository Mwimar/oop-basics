package oop;
import java.time.LocalDate;
import java.time.Period;

public class User {
    public String name;
    public LocalDate birthDay;

    public int age (){
    Period age = Period.between(this.birthDay, LocalDate.now());
return age.getYears();
    };
}

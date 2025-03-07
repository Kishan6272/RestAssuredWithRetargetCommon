package POJO;


import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@JsonIncludeProperties(value = {"name","id"})
public class ExtendEmployee extends Employee{

    ExtendEmployee extendEmployee=new ExtendEmployee();

    private String Skills;




    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }
}

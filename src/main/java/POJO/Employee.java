package POJO;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import java.util.List;
import java.util.Map;


//@JsonInclude(JsonInclude.Include.NON_ABSENT)
//@JsonIncludeProperties(value = {"name","id"})
public class Employee {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int id;

    private String name;

    private String mobNo;
    private String gender;
    private String deptId;
    //private List<String> skills;

    private Map<String,String> familyMembers;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public List<String> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<String> skills) {
//        this.skills = skills;
//    }

    public Map<String, String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Map<String, String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setSkills(String kkkkkk) {
    }
}

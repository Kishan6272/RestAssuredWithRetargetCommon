package POJO;

public class Employee1 {

    private int Id;
    private String Name;
    private String MobNo;
    private String Gender;
    private Address Address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobNo() {
        return MobNo;
    }

    public void setMobNo(String mobNo) {
        MobNo = mobNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

package POJO;

public class EmployeeJsonArrayPractice {

//    "id": 2,
//            "first_name": "Rabi",
//            "last_name": "Willeman",
//            "email": "rwilleman1@taobao.com",
//            "gender": "Male",
//            "ip_address
       private  String id;
    private  String first_name;
    private  String last_name;
    private  String email;
    private  String gender;
    private  String ip_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getGender(String male) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}

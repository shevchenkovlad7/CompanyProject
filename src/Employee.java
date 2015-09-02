/**
 * Created by Vlad on 09.06.2015.
 */
public class Employee {
    private String name;
    private String mobile;
    private String age;
    private String sex;
    private String address;

    public Employee(String name, String mobile, String age,String sex, String address) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }


}

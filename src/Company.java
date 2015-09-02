import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Vlad on 08.06.2015.
 */
public class Company {
    private String name;
    private String address;
    private String numOfEmployee;


    protected Company(String name, String address, String numOfEmployee) {
        this.name = name;
        this.address = address;
        this.numOfEmployee = numOfEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(String numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }
}
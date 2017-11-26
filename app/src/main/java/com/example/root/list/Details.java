package com.example.root.list;

/**
 * Created by root on 11/26/17.
 */

public class Details {
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String toString() {
        return(getName());
        //return (getDegree());
    }

    private String name="",address="",degree="";
}

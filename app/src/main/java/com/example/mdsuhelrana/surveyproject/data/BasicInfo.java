package com.example.mdsuhelrana.surveyproject.data;

import java.io.Serializable;

/**
 * Created by Md Suhel Rana on 9/5/2018.
 */

public class BasicInfo implements Serializable{
    private String gender;
    private String age;
    private String edulevel;

    public BasicInfo(String gender, String age, String edulevel) {
        this.gender = gender;
        this.age = age;
        this.edulevel = edulevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEdulevel() {
        return edulevel;
    }

    public void setEdulevel(String edulevel) {
        this.edulevel = edulevel;
    }
}

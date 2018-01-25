package com.martin.studygreendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：Martin on 2018/1/24 10:45
 * 邮箱：martin0207mfh@163.com
 */
@Entity
public class UserModel {

    @Id(autoincrement = true)
    private Long uId;

    private Long id;

    private String userName;

    private String gender;

    private String age;

    private int count;

    private boolean canUpdate;

    private String test0;

    private Boolean test1;

    private Integer test2;

    private int test3;

    private int test4;

    private double test5;

    private float test6;

    @Generated(hash = 474623789)
    public UserModel(Long uId, Long id, String userName, String gender, String age,
            int count, boolean canUpdate, String test0, Boolean test1,
            Integer test2, int test3, int test4, double test5, float test6) {
        this.uId = uId;
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.age = age;
        this.count = count;
        this.canUpdate = canUpdate;
        this.test0 = test0;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
        this.test5 = test5;
        this.test6 = test6;
    }

    @Generated(hash = 782181818)
    public UserModel() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getCanUpdate() {
        return this.canUpdate;
    }

    public void setCanUpdate(boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public String getTest0() {
        return this.test0;
    }

    public void setTest0(String test0) {
        this.test0 = test0;
    }

    public Boolean getTest1() {
        return this.test1;
    }

    public void setTest1(Boolean test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return this.test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return this.test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public int getTest4() {
        return this.test4;
    }

    public void setTest4(int test4) {
        this.test4 = test4;
    }

    public double getTest5() {
        return this.test5;
    }

    public void setTest5(double test5) {
        this.test5 = test5;
    }

    public float getTest6() {
        return this.test6;
    }

    public void setTest6(float test6) {
        this.test6 = test6;
    }

    public Long getUId() {
        return this.uId;
    }

    public void setUId(Long uId) {
        this.uId = uId;
    }

}

package com.tong.thinking.chapter20.s02.p626;

import com.tong.thinking.chapter20.s02.p624.Constraints;
import com.tong.thinking.chapter20.s02.p624.DBTable;
import com.tong.thinking.chapter20.s02.p624.SQLInteger;
import com.tong.thinking.chapter20.s02.p624.SQLString;

@DBTable(name = "MEMBER")
public class Member {

    @SQLString(30)
    String firstName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    public String getHandle() {
        return handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return handle;
    }

    public Integer getAge() {
        return age;
    }
}

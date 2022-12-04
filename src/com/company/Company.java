package com.company;

import java.time.LocalDate;

public class Company extends Base{
    private String cname;

    public String getName() {
        return cname;
    }

    public void setName(String cname) {
        this.cname = cname;
    }


    public Company(String cname) {
        super();
        this.cname = cname;
    }
}

package com.danielecagnoni.U5W3D2.E1Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }


    @Override
    public String getFullName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {
        LocalDate dob = info.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        Period period = Period.between(dob, today);
        return period.getYears();
    }


}

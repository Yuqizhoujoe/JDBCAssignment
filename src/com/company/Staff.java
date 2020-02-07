package com.company;

import javax.swing.*;
import java.math.BigDecimal;

public class Staff implements java.io.Serializable {

    private int id;
    private String name;
    private BigDecimal wage;
    private String position;

    public Staff(int id, String name, BigDecimal wage, String position) {
        this.id = id;
        this.name = name;
        this.wage = wage;
        this.position = position;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

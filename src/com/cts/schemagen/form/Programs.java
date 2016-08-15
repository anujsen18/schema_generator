package com.cts.schemagen.form;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "program")
public class Programs {




    @Id
    @Column(name = "Program_Id")
    private int program_id;
    @Column(name = "Date")
    private String date;
    @Column(name = "Duty_Type")
    private String type;
    @Column(name = "Duty_Start_Time")
    private String start;
    @Column(name = "Duty_End_Time")
    private String end;
    @Column(name = "Location")
    private String location;
    @Column(name = "User_Id")
    private int user_id;
    @Column(name = "Program_Name")
    private String program_name;


    public int getProgram_id() {
        return program_id;
    }


    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }




    public String getStart() {
        return start;
    }


    public void setStart(String start) {
        this.start = start;
    }


    public String getEnd() {
        return end;
    }


    public void setEnd(String end) {
        this.end = end;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getProgram_name() {
        return program_name;
    }


    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }


    public Programs() { 

    }}

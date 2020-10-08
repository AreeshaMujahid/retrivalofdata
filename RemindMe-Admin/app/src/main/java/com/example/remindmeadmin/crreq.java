package com.example.remindmeadmin;

public class crreq {
    private String curr_sem;
    private String depart;
    private  String gmail;
    private String name;
    private String section;

    public crreq() {
    }

    public crreq(String curr_sem, String depart, String gmail, String name, String section) {
        this.curr_sem = curr_sem;
        this.depart = depart;
        this.gmail = gmail;
        this.name = name;
        this.section = section;
    }

    public String getCurr_sem() {
        return curr_sem;
    }

    public void setCurr_sem(String curr_sem) {
        this.curr_sem = curr_sem;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

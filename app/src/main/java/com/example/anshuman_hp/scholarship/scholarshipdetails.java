package com.example.anshuman_hp.scholarship;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class scholarshipdetails {
    String firstname;
    String secondname;
    String lastdate;
    String url;

    public scholarshipdetails(String firstname, String secondname, String lastdate, String url) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.lastdate = lastdate;
        this.url = url;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

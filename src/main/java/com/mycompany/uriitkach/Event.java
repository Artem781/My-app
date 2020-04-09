package com.mycompany.uriitkach;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
    private int id = (int)(Math.random()*10);
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.dateFormat = df;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                ", dateFormat=" + dateFormat.format(date) +
                '}';
    }
}

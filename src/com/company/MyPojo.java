package com.company;

import java.io.Serializable;
/*Pojo класс*/
public class MyPojo  implements Serializable {
    private Schedule schedule;

    public Schedule getSchedule ()
    {
        return schedule;
    }

    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [schedule = "+schedule+"]";
    }
}

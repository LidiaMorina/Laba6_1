package com.company;

import java.io.Serializable;
/*класс pojo объекта Предмет для сериализации*/
public class Object implements Serializable {
    private String week;

    private String nameObject;

    private String cabinet;

    public String getWeek ()
    {
        return week;
    }

    public void setWeek (String week)
    {
        this.week = week;
    }

    public String getNameObject ()
    {
        return nameObject;
    }

    public void setNameObject (String nameObject)
    {
        this.nameObject = nameObject;
    }

    public String getCabinet ()
    {
        return cabinet;
    }

    public void setCabinet (String cabinet)
    {
        this.cabinet = cabinet;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [week = "+week+", nameObject = "+nameObject+", cabinet = "+cabinet+"]";
    }
}

package com.company;

import java.io.Serializable;
/*класс pojo объекта Профессор для сериализации*/
public class Professor implements Serializable  {
    private String numderOfStudents;

    private Object Object;

    private String numderOfLessons;

    private String FIO;

    public String getNumderOfStudents ()
    {
        return numderOfStudents;
    }

    public void setNumderOfStudents (String numderOfStudents)
    {
        this.numderOfStudents = numderOfStudents;
    }

    public Object getObject ()
    {
        return Object;
    }

    public void setObject (Object Object)
    {
        this.Object = Object;
    }

    public String getNumderOfLessons ()
    {
        return numderOfLessons;
    }

    public void setNumderOfLessons (String numderOfLessons)
    {
        this.numderOfLessons = numderOfLessons;
    }

    public String getFIO ()
    {
        return FIO;
    }

    public void setFIO (String FIO)
    {
        this.FIO = FIO;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [numderOfStudents = "+numderOfStudents+", Object = "+Object+", numderOfLessons = "+numderOfLessons+", FIO = "+FIO+"]";
    }
}

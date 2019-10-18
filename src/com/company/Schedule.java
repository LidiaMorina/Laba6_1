package com.company;
import java.io.Serializable;
/*класс pojo объекта Расписание для сериализации*/
public class Schedule  implements Serializable  {
    private Professor[] professor;

    public Professor[] getProfessor ()
    {
        return professor;
    }

    public void setProfessor (Professor[] professor)
    {
        this.professor = professor;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [professor = "+professor[0]+"]";
    }
}

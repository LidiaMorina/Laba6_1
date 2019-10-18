package com.company;

import java.io.InvalidObjectException;
/* приложение, осуществляющее сериализацию/десериализацию pojo*/
public class Main  {
    public static void main(String[] args) {

        MyPojo myPojo = new MyPojo();
        Rialization rialization = new Rialization();
        String file = "example.data";
        // создание и запись объекта предмет
        Object object = new Object();
        object.setNameObject("Programming");
        object.setCabinet("Г312");
        object.setWeek("Friday");

        // создание и запись объекта преподаватели
        Professor professor = new Professor();
        professor.setFIO("Petrov P.P");
        professor.setNumderOfLessons("12");
        professor.setNumderOfStudents("30");
        professor.setObject(object);

        // запись объекта профессор в массив
        Professor[] professorList = new Professor[1];
        professorList[0] = professor;

        // создание и запись объекта рассписание
        Schedule schedule = new Schedule();
        schedule.setProfessor(professorList);

        // запись объекта myPojo
        myPojo.setSchedule(schedule);
        //сериализация объекта
        rialization.serialization(myPojo, file);

        //изменение значения  названия предмет
        object.setNameObject("Math");
        // чтение и вывод объекта
        MyPojo res = null;
        try {
            //десериализация
            res = rialization.deserialization(file);
        }catch (InvalidObjectException e){
            e.printStackTrace();
        }
        System.out.println("Без изменения: "+res);
        //вывод изменённого объекта
        System.out.println("С изменением: "+myPojo);
    }
}

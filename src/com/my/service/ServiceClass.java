/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.service;


import com.my.model.Event;
import com.my.model.Student;
import com.my.model.StudentHasEvent;
import com.my.util.Util;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ServiceClass {
    Session session = Util.getSessionFactory().openSession();
    public Student getStudent(int id){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Student.class).add(Restrictions.eq("id",id));
        Student student = (Student)criteria.uniqueResult();
               
        return student;
    }
    
    public Event getEvent(int id){
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Event.class).add(Restrictions.eq("id",id));
       
        
        Event event = (Event)criteria.uniqueResult();
               
        return event;
        
    }

    public void addEvent(Event event){
            session.beginTransaction();
            session.save(event);
            session.getTransaction().commit();
    }
    
    public List<Student> get100Students(){
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Student.class).setMaxResults(100).addOrder(Order.asc("name") );
           
       List<Student> list = criteria.list();
       return list;
    }
    
    public List<Student> getAllStudents(){
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Student.class).addOrder(Order.asc("name") );
           
       List<Student> list = criteria.list();
       return list;
    }
    
    public List<Event> getAllEvents(){
      session.beginTransaction();
      Criteria criteria = session.createCriteria(Event.class).setMaxResults(100).addOrder(Order.asc("name") );
           
       List<Event> list = criteria.list();
       return list;   
    }
    
    public List<StudentHasEvent> getAllStudentHasEvents(Event event){
       session.beginTransaction();
       Criteria criteria = session.createCriteria(StudentHasEvent.class)
               .createAlias("event","event",Criteria.INNER_JOIN).add(Restrictions.eq("event.name", event.getName()))
               .createAlias("student", "student", Criteria.INNER_JOIN)
               .addOrder(Order.asc("student.name")).setMaxResults(100);
       List<StudentHasEvent> list = criteria.list();
       return list; 
    }
    
    public List<Student> getChooseStudentFiltered(Map param){
        
        String id = (String)param.get("id");
        String name = (String)param.get("name");
        Boolean idExact = (Boolean)param.get("idExact");
        Boolean nameExact = (Boolean)param.get("nameExact");
        String course = (String)param.get("course");
        Boolean isMale = (Boolean)param.get("male");
        Boolean isFemale = (Boolean)param.get("female");
        String year = (String)param.get("year");
        Boolean isOld = (Boolean)param.get("old");
        Boolean isReturning = (Boolean)param.get("returning");
        Boolean isTransferee = (Boolean)param.get("transferee");
        Boolean isNew = (Boolean)param.get("new");    

        Criteria criteria = session.createCriteria(Student.class)
                .setMaxResults(100).addOrder(Order.asc("name"));
        
        if(!id.isEmpty()){
            if(idExact)
                criteria.add(Restrictions.eq("id", Integer.parseInt(id)));
            else
                criteria.add(Restrictions.sqlRestriction(" id LIKE '%"+id+"%' "));
        }
        
        if(nameExact)
            criteria.add(Restrictions.eq("name",name));
        else if(!nameExact)
            criteria.add(Restrictions.like("name", name,MatchMode.ANYWHERE));
        
        if(isMale)
            criteria.add(Restrictions.eq("sex", "M"));
        if(isFemale)
            criteria.add(Restrictions.eq("sex", "F"));
        
        if(isOld)
            criteria.add(Restrictions.eq("status", "O"));
        else if(isReturning)
            criteria.add(Restrictions.eq("status", "R"));
        else if(isTransferee)
            criteria.add(Restrictions.eq("status", "T"));
        else if(isNew)
            criteria.add(Restrictions.eq("status", "N"));
        
        criteria.add(Restrictions.like("course", course,MatchMode.ANYWHERE));
        
        if(!year.isEmpty())
            criteria.add(Restrictions.eq("year",Integer.parseInt(year)));
        return criteria.list();
    }
    
    public List<Event> getChooseEventFiltered(Map param){
        String id = (String)param.get("id");
        String name = (String)param.get("name");
        String attendance = (String)param.get("attendance");
        Boolean idExact = (Boolean)param.get("idExact");
        Boolean nameExact = (Boolean)param.get("nameExact");
        
        Criteria criteria = session.createCriteria(Event.class)
                .setMaxResults(100).addOrder(Order.asc("name"));
        
        if(!id.isEmpty()){
            if(idExact)
                criteria.add(Restrictions.eq("id", Integer.parseInt(id)));
            else
                criteria.add(Restrictions.sqlRestriction(" id LIKE '%"+id+"%' "));
        }
        if(nameExact)
            criteria.add(Restrictions.eq("name",name));
        else
            criteria.add(Restrictions.like("name", name,MatchMode.ANYWHERE));
        if(!attendance.isEmpty())
            criteria.add(Restrictions.eq("attendance", Integer.parseInt(attendance)));
        return criteria.list();
    }
    
    public List<StudentHasEvent> getAttendFiltered(Map param){
        String id = (String)param.get("id");
        String name = (String)param.get("name");
        Boolean idExact = (Boolean)param.get("idExact");
        Boolean nameExact = (Boolean)param.get("nameExact");
        Event event = (Event)param.get("event");
        String course = (String)param.get("course");
        Boolean isMale = (Boolean)param.get("male");
        Boolean isFemale = (Boolean)param.get("female");
        String year = (String)param.get("year");
        Boolean isOld = (Boolean)param.get("old");
        Boolean isReturning = (Boolean)param.get("returning");
        Boolean isTransferee = (Boolean)param.get("transferee");
        Boolean isNew = (Boolean)param.get("new");
        
        Criteria criteria = session.createCriteria(StudentHasEvent.class)
                .setMaxResults(100);
        
        if(!id.isEmpty()){
            if(idExact)
                criteria.add(Restrictions.eq("studentEventId", Integer.parseInt(id)));
            else
                criteria.add(Restrictions.sqlRestriction(" student_event_id LIKE '%"+id+"%' "));
        }
        
        criteria.createAlias("student", "student", Criteria.INNER_JOIN).addOrder(Order.asc("student.name"));

        if(nameExact)
            criteria.add(Restrictions.eq("student.name",name));
        else
            criteria.add(Restrictions.like("student.name", name,MatchMode.ANYWHERE));  
        
        if(isMale)
            criteria.add(Restrictions.eq("student.sex", "M"));
        if(isFemale)
            criteria.add(Restrictions.eq("student.sex", "F"));
        
        if(isOld)
            criteria.add(Restrictions.eq("student.status", "O"));
        else if(isReturning)
            criteria.add(Restrictions.eq("student.status", "R"));
        else if(isTransferee)
            criteria.add(Restrictions.eq("student.status", "T"));
        else if(isNew)
            criteria.add(Restrictions.eq("student.status", "N"));

        criteria.add(Restrictions.like("student.course", course,MatchMode.ANYWHERE));
        
        if(!year.isEmpty())
            criteria.add(Restrictions.eq("student.year",Integer.parseInt(year)));

        criteria.createAlias("event","event",Criteria.INNER_JOIN).add(Restrictions.eq("event.name",event.getName()));
        return criteria.list();
    }

    public void addAllStudentsAttendance(Event event){
        List<Student> list = getAllStudents();
        
        for(Student student: list){
            StudentHasEvent she = new StudentHasEvent();
                she.setEvent(event);
                she.setAttendance(0);
                she.setStudent(student);
                saveEventAttendance(she);
            System.out.println(student.getName());
        }
        System.out.println("Tapos na add lahat");
    }
    
    public void saveEventAttendance(StudentHasEvent she){
        session.beginTransaction();
        session.save(she);
        session.getTransaction().commit();
    }
    
    public void updateBundleStudentHasEvents(List<StudentHasEvent> list){
        for(StudentHasEvent she: list){
            session.beginTransaction();
            session.update(she);
            session.getTransaction().commit();
            System.out.println(she.getStudent().getName());
        }
    }
    
    public List<StudentHasEvent> getStudentAttendances(Student student){
        Criteria criteria = session.createCriteria(StudentHasEvent.class)
                .createCriteria("student")
                .add(Restrictions.eq("id", student.getId()));
        
        return criteria.list();
    }
}

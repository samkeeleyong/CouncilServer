/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.service;

import com.my.model.Student;
import com.my.util.Util;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class DistributeService {
    Session session = Util.getSessionFactory().openSession();
    public List<Student> getAllStudents(){
        List<Student> list = session.createCriteria(Student.class).list();
        return list;
    }
    
    public List<Student> filterStudents(Map param){
        String name = (String)param.get("name");
        String id = (String)param.get("id");
        String course = (String)param.get("course");
        Boolean received = (Boolean)param.get("received");
        
        
        Criteria criteria  = session.createCriteria(Student.class)
                .add(Restrictions.like("name",name,MatchMode.ANYWHERE))
                .add(Restrictions.like("course",course,MatchMode.ANYWHERE))
                .add(Restrictions.eq("received",received));
        
        if(!id.isEmpty())
            criteria.add(Restrictions.like("id",Integer.parseInt(id)));
               
        List<Student> list = criteria.list();
        return list;
    }
    
    public void studentGetDistributable(Student student){
//        student.setReceived(Boolean.TRUE);
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }
}

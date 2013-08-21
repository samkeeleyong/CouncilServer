/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.main;


import com.my.model.Student;
import com.my.service.ServiceClass;
import java.util.List;



/**
 *
 * @author User
 */
public class main {
   public static void main(String[] args){
//       Student sam = new ServiceClass().getStudent(1);
//       Student rea = new ServiceClass().getStudent(2);
//       Student denver = new ServiceClass().getStudent(3);
//       
//       Event assembly = new ServiceClass().getEvent(1);
//       
//       StudentHasEvent she = new StudentHasEvent();
//            she.setAttendance(2);
//            she.setEvent(assembly);
//            she.setStudent(rea);
       
//        new ServiceClass().saveEventAttendance(she);
//         
//         she.setStudent(sam);
//        new ServiceClass().saveEventAttendance(she);
            

//       sam.getStudentHasEvents().add(she);
//       denver.getStudentHasEvents().add(she);
       
//       she.setAttendance(1);
//       rea.getStudentHasEvents().add(she);
       
//       new ServiceClass().updateStudent(denver);
       
       
       
       List<Student> list = new ServiceClass().getAllStudents();
       int i = 1;
       for(Student c:list){
           System.out.println(i + " " + c.getName());
           i++;
       }
   } 
}

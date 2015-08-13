/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whale.project.controller;

import com.mycompany.whale.project.model.Student;
import com.mycompany.whale.project.repo.AuthorityRepo;
import com.mycompany.whale.project.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UMBOON
 */
@RestController
public class StudentController {
   
    @Autowired
    private StudentRepo studentrepo;
   
    
    
    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student){
        studentrepo.save(student);
        
    }
    
    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    public void deleteStudent(@RequestBody Student student){
        studentrepo.delete(student);
    }
    
    @RequestMapping(value = "/getstudent",method = RequestMethod.GET)
    public Page<Student> getStudent(Pageable pageable){
        return studentrepo.findAll(pageable);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whale.project.repo;

import com.mycompany.whale.project.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author UMBOON
 */
public interface AuthorityRepo extends JpaRepository<Authority, String>{
    
}
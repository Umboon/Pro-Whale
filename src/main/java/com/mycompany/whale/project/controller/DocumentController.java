/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whale.project.controller;

import com.mycompany.whale.project.model.Document;
import com.mycompany.whale.project.repo.DocumentRepo;
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
public class DocumentController {

    @Autowired
    private DocumentRepo documentRepo;

    @RequestMapping(value = "/saveDocument", method = RequestMethod.POST)
    public void saveDocument(@RequestBody Document document) {
        documentRepo.save(document);
    }

    @RequestMapping(value = "/deleteDocument", method = RequestMethod.POST)
    public void deleteDocument(@RequestBody Document document) {
        documentRepo.delete(document);
    }

    public Page<Document> getDocument(Pageable pageable) {
        return documentRepo.findAll(pageable);

    }

}

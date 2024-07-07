package com.devsuperior.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.aula.dtos.newPersonDepartmentDTO;
import com.devsuperior.aula.services.PersonService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(value = "/people")
public class PersonController {

  @Autowired
  private PersonService service;

  @PostMapping()
  public ResponseEntity<newPersonDepartmentDTO> create(@RequestBody newPersonDepartmentDTO dto) {
    return ResponseEntity.ok(service.insert(dto));
  }

}

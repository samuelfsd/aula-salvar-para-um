package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dtos.PersonDTO;
import com.devsuperior.aula.dtos.newPersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository repository;

  @Autowired
  private DepartmentRepository departmentRepository;

  public newPersonDepartmentDTO insert(newPersonDepartmentDTO dto) {
    Person person = new Person();

    person.setId(dto.getId());
    person.setName(dto.getName());
    person.setSalary(dto.getSalary());

    // Department department = new Department();
    Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());

    // department.setId(dto.getDepartment().getId());
    // department.setName(dto.getDepartment().getName());

    // create association -> person to department
    person.setDepartment(department);

    // save
    person = repository.save(person);

    return new newPersonDepartmentDTO(person);
  }

  public PersonDTO insert(PersonDTO dto) {
    Person person = new Person();
    person.setId(dto.getId());
    person.setName(dto.getName());
    person.setSalary(dto.getSalary());

    Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());
    person.setDepartment(dept);

    person = repository.save(person);

    return new PersonDTO(person);
  }
}

package com.devsuperior.aula.dtos;

import com.devsuperior.aula.entities.Person;

public class newPersonDepartmentDTO {
  private Long id;
  private String name;
  private Double salary;
  private DepartmentDTO department;

  public newPersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  public newPersonDepartmentDTO(Person person) {
    id = person.getId();
    name = person.getName();
    salary = person.getSalary();
    department = new DepartmentDTO(person.getDepartment());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public DepartmentDTO getDepartment() {
    return department;
  }

  public void setDepartment(DepartmentDTO department) {
    this.department = department;
  }

}

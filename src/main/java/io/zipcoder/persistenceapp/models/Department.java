package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

private Long departmentNumber;
private String departmentName;

private String departementManager;//id


    public Department() {
    }

    public Department(long id, Long departmentNumber, String departmentName, String departementManager) {
        this.id = id;
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.departementManager = departementManager;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Long departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartementManager() {
        return departementManager;
    }

    public void setDepartementManager(String departementManager) {
        this.departementManager = departementManager;
    }
}

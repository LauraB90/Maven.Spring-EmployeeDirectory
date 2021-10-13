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
    private String name;
    //OneToOne
    private Long depManagerId;//id


    public Department() {
    }

    public Department(long id, String depname, Long depManagerId) {
        this.id = id;
        this.name = depname;
        this.depManagerId = depManagerId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getManager() {
        return depManagerId;
    }

    public void setManager(Long managerid) {
        this.depManagerId = managerid;
    }
}

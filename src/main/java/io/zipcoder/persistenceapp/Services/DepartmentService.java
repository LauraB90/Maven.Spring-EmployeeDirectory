package io.zipcoder.persistenceapp.Services;


import io.zipcoder.persistenceapp.Repositories.DepartmentRepository;
import io.zipcoder.persistenceapp.models.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {


    @Autowired
    private DepartmentRepository repository;


    public Department create(Department department){
        return repository.save(department);
    }

    public Department read(Long id){
    return repository.findOne(id);
    }


    public List<Department> readAll(){//(Long id, Department newDepartmentData){
    Iterable<Department> departmentIterable = repository.findAll();
    List<Department> result = new ArrayList<>();
    departmentIterable.forEach(result::add);
    return result;
    }


    public Department update (Long id, Department newdepartmentData) {
        Department departmentInDB = read(id);
        departmentInDB.setName(newdepartmentData.getName());
        departmentInDB.setManager(newdepartmentData.getManager());
        //departmentInDB.setDepnumber(newdepartmentData.getDepnumber());
       return repository.save(departmentInDB);

    }

    public Department delete(Department department){
    repository.delete(department);
    return department;
    }


    public Department delete (Long id){
return delete(read(id));
    }

}

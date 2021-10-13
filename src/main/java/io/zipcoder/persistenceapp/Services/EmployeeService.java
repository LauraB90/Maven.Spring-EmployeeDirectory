package io.zipcoder.persistenceapp.Services;


import io.zipcoder.persistenceapp.Repositories.EmployeeRepository;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;



    public Employee create (Employee employee){
        return repository.save(employee);
    }


    public Employee read(Long id ){
        return repository.findOne(id);
    }

    public List<Employee> readAll(){
        Iterable<Employee> iterableEmployee = repository.findAll();
        List<Employee> result = new ArrayList<>();
        iterableEmployee.forEach(result::add);
        return result;
    }

    public Employee update(Long id , Employee newEmployeeData){
        Employee employeeInDB = read(id);
        employeeInDB.setFirstName(newEmployeeData.getFirstName());
        employeeInDB.setLastName(newEmployeeData.getLastName());
        employeeInDB.setEmail(newEmployeeData.getEmail());
        employeeInDB.setPhoneNum(newEmployeeData.getPhoneNum());
        //employeeInDB.setDepartmentNumber(newEmployeeData.getDepartmentNumber());
        employeeInDB.setHireDate(newEmployeeData.getHireDate());
        employeeInDB.setTitle(newEmployeeData.getTitle());
        //employeeInDB.setManagerId(newEmployeeData.getManagerId());
        repository.save(employeeInDB);
        return employeeInDB;
    }


    public Employee delete (Employee employee){
        repository.delete(employee);
        return employee;
    }

    public Employee delete(Long id){
        return delete(id);
    }

}

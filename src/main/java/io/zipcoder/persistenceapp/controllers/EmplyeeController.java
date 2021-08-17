package io.zipcoder.persistenceapp.controllers;


import io.zipcoder.persistenceapp.Services.EmployeeService;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmplyeeController {


    @Autowired
    private EmployeeService service;


    @PostMapping(value = "/create")
public ResponseEntity<Employee> create(@RequestBody Employee employee){
    return new ResponseEntity<>(service.create(employee), HttpStatus.CREATED);
}

@GetMapping(value = "/read/{id}")
public ResponseEntity<Employee> read(@PathVariable Long id) {
  return new ResponseEntity<>(service.read(id), HttpStatus.OK);
}

@GetMapping(value = "/all")
    public ResponseEntity<List<Employee>> readAll(){
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
}

@PutMapping(value = "/update/{id}")
public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee newEmployeeData) {
        return new ResponseEntity<>(service.update(id, newEmployeeData), HttpStatus.OK);
}


@DeleteMapping(value = "/delete")
    public ResponseEntity<Employee> delete (@PathVariable Long id ){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);

}


}

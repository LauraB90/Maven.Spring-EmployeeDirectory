package io.zipcoder.persistenceapp.Repositories;

import io.zipcoder.persistenceapp.models.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

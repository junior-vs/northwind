package tech.vsj.northwind.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.vsj.northwind.rh.model.Employee;

public interface EmployeesRepository extends JpaRepository<Employee , Integer>{

}

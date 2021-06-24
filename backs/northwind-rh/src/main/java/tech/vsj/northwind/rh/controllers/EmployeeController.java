package tech.vsj.northwind.rh.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.vsj.northwind.rh.dtos.EmployeeDTO;
import tech.vsj.northwind.rh.model.Employee;
import tech.vsj.northwind.rh.repositories.EmployeesRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  private EmployeesRepository repo;

  @GetMapping
  public ResponseEntity<List<EmployeeDTO>> listAll() {
    List<EmployeeDTO> result =
        repo.findAll().stream().map(EmployeeDTO::new).collect(Collectors.toList());
    return ResponseEntity.ok(result);
  }

  @GetMapping("{id:[0-9]+}")
  public ResponseEntity<EmployeeDTO> findById(@PathVariable Integer id) {
    Optional<Employee> result = repo.findById(id);
    return ResponseEntity.ok(new EmployeeDTO(result.orElseThrow()));
  }

}

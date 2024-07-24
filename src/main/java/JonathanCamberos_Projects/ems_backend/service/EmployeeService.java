package JonathanCamberos_Projects.ems_backend.service;

import JonathanCamberos_Projects.ems_backend.dto.EmployeeDto;

import java.util.List;

// EmployeeController depends on EmployeeService
// When implementing new function -- Start Here!!
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}

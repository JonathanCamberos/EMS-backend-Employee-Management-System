package JonathanCamberos_Projects.ems_backend.service;

import JonathanCamberos_Projects.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}

package JonathanCamberos_Projects.ems_backend.mapper;

import JonathanCamberos_Projects.ems_backend.dto.EmployeeDto;
import JonathanCamberos_Projects.ems_backend.entity.Employee;

// mapper
//  component used to transform data between different layers of an
//  application. In the context of a Spring Boot application, a
//  mapper is often used to convert between different data
//  representations, such as converting an entity object to a DTO
//  (Data Transfer Object) and vice versa.

// in this case transfering from employee to Dto and vice versa

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}

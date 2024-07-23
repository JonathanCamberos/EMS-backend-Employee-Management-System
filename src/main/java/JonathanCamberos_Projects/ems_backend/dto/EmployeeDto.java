package JonathanCamberos_Projects.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// we use this to transfer the data between client and server
// Dto --> Data Transfer Object
//  design pattern used to transfer data between layers or different
//  parts of the application


public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

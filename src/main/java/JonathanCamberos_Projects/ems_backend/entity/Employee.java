package JonathanCamberos_Projects.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//creates all the getters/setters/etc...
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

//generates the employees table
@Table(name = "employees")

public class Employee {

    //link ID w/ SQL Database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    // unique + not null
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}

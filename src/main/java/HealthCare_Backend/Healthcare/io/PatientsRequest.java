package HealthCare_Backend.Healthcare.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientsRequest {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String address;
    private String note;
    private String category;
    private Date date;
    private String gender;
    private String email;
    private String emergencycontact;
    private List<Long> doctorIds;

}

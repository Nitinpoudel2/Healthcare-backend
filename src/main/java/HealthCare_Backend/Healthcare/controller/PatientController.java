package HealthCare_Backend.Healthcare.controller;

import HealthCare_Backend.Healthcare.dto.PatientDTO;
import HealthCare_Backend.Healthcare.io.PatientResponse;
import HealthCare_Backend.Healthcare.io.PatientsRequest;
import HealthCare_Backend.Healthcare.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Slf4j // this is a lombok functions which allows us to use loggers in the springboot system to see the info
/*
 * It will fetch the patients informations from the database
 * @return  list
 */

public class PatientController {
    private final PatientService patientService;

    private final ModelMapper modelMapper;

    // creating a method to return a string
    // get mapping annotation for application
    @GetMapping("/patients")
    public List<PatientResponse> getPatientInfo(){
        log.info("API GET /patients is called");
        List<PatientDTO> list =  patientService.getAllPatients();
        log.info("Printing the data from the service{}", list);
        List<PatientResponse> response = list.stream().map(patientDTO -> mapToPatientResponse(patientDTO)).collect(Collectors.toList());
        return response; 
    }
    /*
     *Mapper method for converting patients dto object to patient response
     * @param patientDTO
     * @return PatientResponse
     */
    private PatientResponse mapToPatientResponse(PatientDTO patientDTO) {
        return modelMapper.map(patientDTO, PatientResponse.class);
    }

}

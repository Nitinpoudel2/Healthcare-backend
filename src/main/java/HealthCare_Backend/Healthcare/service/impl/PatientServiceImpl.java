package HealthCare_Backend.Healthcare.service.impl;

import HealthCare_Backend.Healthcare.dto.PatientDTO;
import HealthCare_Backend.Healthcare.entity.PatientEntity;
import HealthCare_Backend.Healthcare.repository.PatientRepository;
import HealthCare_Backend.Healthcare.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
/*
* Service implementation for patients module
 *@author Nitin Paudel
 */
public class PatientServiceImpl implements PatientService {
    // two dependencies
    private final PatientRepository patientRepository;

    private final ModelMapper modelMapper;
    /*
     * Service implementation for patients module
     *@author Nitin Paudel
     */
    @Override
    public List<PatientDTO> getAllPatients() {
        // call the repository method and convert the entity object to dto object and return the list
        List<PatientEntity> list = patientRepository.findAll();
        log.info("Printing the data from the repository {}", list);
        List<PatientDTO> listofPatients = list.stream().map(patientEntity -> mapToPatientDTO(patientEntity)).collect(Collectors.toList());
        return listofPatients;
    }
    /*
     * Mapper method to convert patient entity to patient dto
     *@return PatientDTO
     *@param patientEntity
     */
    private PatientDTO mapToPatientDTO(PatientEntity patientEntity) {
         return modelMapper.map(patientEntity, PatientDTO.class);
    }
}

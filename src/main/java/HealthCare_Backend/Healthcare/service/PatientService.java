package HealthCare_Backend.Healthcare.service;

import HealthCare_Backend.Healthcare.dto.PatientDTO;

import java.util.List;

/*Service interface for Patient Module
 * @author Nitin Paudel
 */
public interface PatientService {
    /* It will fetch the patients from the database
     * @return list
     */
    List<PatientDTO> getAllPatients();
}

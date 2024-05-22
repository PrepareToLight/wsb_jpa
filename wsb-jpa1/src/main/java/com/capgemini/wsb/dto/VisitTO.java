package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO {

    private Long id;

    private String description;

    private LocalDateTime time;

    private List<MedicalTreatmentTO> medicalTreatmentTOList;

    private DoctorSupportTO doctorSupportTO;

    private PatientSupportTO patientSupportTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<MedicalTreatmentTO> getMedicalTreatmentTOList() {
        return medicalTreatmentTOList;
    }

    public void setMedicalTreatmentTOList(List<MedicalTreatmentTO> medicalTreatmentTOList) {
        this.medicalTreatmentTOList = medicalTreatmentTOList;
    }

    public DoctorSupportTO getDoctorSupportTO() {
        return doctorSupportTO;
    }

    public void setDoctorSupportTO(DoctorSupportTO doctorSupportTO) {
        this.doctorSupportTO = doctorSupportTO;
    }

    public PatientSupportTO getPatientSupportTO() {
        return patientSupportTO;
    }

    public void setPatientSupportTO(PatientSupportTO patientSupportTO) {
        this.patientSupportTO = patientSupportTO;
    }
}

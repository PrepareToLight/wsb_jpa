package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientSupportTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

public final class PatientSupportMapper {
    public static PatientSupportTO mapToTO(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        final PatientSupportTO patientSupportTO = new PatientSupportTO();
        patientSupportTO.setId(patientEntity.getId());
        patientSupportTO.setFirstName(patientEntity.getFirstName());
        patientSupportTO.setLastName(patientEntity.getLastName());
        return patientSupportTO;
    }

    public static PatientEntity mapToEntity(final PatientSupportTO patientSupportTO) {
        if (patientSupportTO == null) {
            return null;
        }
        final PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientSupportTO.getId());
        patientEntity.setFirstName(patientSupportTO.getFirstName());
        patientEntity.setLastName(patientSupportTO.getLastName());
        return patientEntity;
    }
}

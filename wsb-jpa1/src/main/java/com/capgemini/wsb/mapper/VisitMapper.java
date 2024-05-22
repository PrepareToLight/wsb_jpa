package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public final class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visitEntity) {
        if (visitEntity == null)
        {
            return null;
        }
        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setTime(visitEntity.getTime());
        visitTO.setPatientSupportTO(PatientSupportMapper.mapToTO(visitEntity.getPatientEntity()));
        visitTO.setDoctorSupportTO(DoctorSupportMapper.mapToTO(visitEntity.getDoctorEntity()));
        if (visitEntity.getMedicalTreatmentEntityList() != null) {
            visitTO.setMedicalTreatmentTOList(visitEntity.getMedicalTreatmentEntityList().stream().map(MedicalTreatmentMapper::mapToTO).collect(Collectors.toList()));
        }
        return visitTO;
    }

    public static VisitEntity mapToEntity(final VisitTO visitTO) {
        if (visitTO == null)
        {
            return null;
        }
        final VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTO.getId());
        visitEntity.setDescription(visitTO.getDescription());
        visitEntity.setTime(visitTO.getTime());
        visitEntity.setPatientEntity(PatientSupportMapper.mapToEntity(visitTO.getPatientSupportTO()));
        visitEntity.setDoctorEntity(DoctorSupportMapper.mapToEntity(visitTO.getDoctorSupportTO()));

        if (visitTO.getMedicalTreatmentTOList() != null) {
            visitEntity.setMedicalTreatmentEntityList(visitTO.getMedicalTreatmentTOList().stream().map(MedicalTreatmentMapper::mapToEntity).collect(Collectors.toList()));
        }
        return visitEntity;
    }
}

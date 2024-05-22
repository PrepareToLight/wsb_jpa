package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorSupportTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public final class DoctorSupportMapper {
    public static DoctorSupportTO mapToTO(final DoctorEntity doctorEntity) {
        if (doctorEntity == null) {
            return null;
        }
        final DoctorSupportTO doctorSupportTO = new DoctorSupportTO();
        doctorSupportTO.setId(doctorEntity.getId());
        doctorSupportTO.setFirstName(doctorEntity.getFirstName());
        doctorSupportTO.setLastName(doctorEntity.getLastName());
        return doctorSupportTO;
    }

    public static DoctorEntity mapToEntity(final DoctorSupportTO doctorSupportTO) {
        if (doctorSupportTO == null) {
            return null;
        }
        final DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(doctorSupportTO.getId());
        doctorEntity.setFirstName(doctorSupportTO.getFirstName());
        doctorEntity.setLastName(doctorSupportTO.getLastName());
        return doctorEntity;
    }
}
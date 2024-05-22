package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PatientDaoImplTest {

    @Autowired
    private PatientDao patientDao;
    @Test
    void findPatientByLastName() {
        //given: data.sql
        //when
        List<PatientEntity> patientEntityList = patientDao.findPatientByLastName("Kowal");
        //then
        assertEquals(1, patientEntityList.size());
    }

    @Test
    void findPatientsWithMoreThanSpecifiedVisits() {
        //given: data.sql
        //when
        int limit = 1;
        //then
        assertEquals(1, patientDao.findPatientsWithMoreThanSpecifiedVisits(limit).size());
    }

    @Test
    void findAllPremiumPatients() {
        //given: data.sql
        //when
        //then
        assertEquals(1, patientDao.findAllPremiumPatients().size());
    }
}


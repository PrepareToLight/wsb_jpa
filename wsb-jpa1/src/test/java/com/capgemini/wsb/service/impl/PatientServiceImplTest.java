package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.service.DoctorService;
import com.capgemini.wsb.service.PatientService;
import com.capgemini.wsb.service.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceImplTest {

    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;
    @Autowired
    VisitService visitService;

    @Test
    void deleteById() {
        //given: data.sql
        //when
        patientService.deleteById(1L);
        //then
        assertNull(patientService.findById(1L));
        assertNull(visitService.findById(1L));
        assertNotNull(doctorService.findById(1L));
    }

    @Test
    void getPatientVisits(){
        //given
        //when
        //then
        assertEquals(2, patientService.getPatientVisits(1L).size());
        assertEquals(0, patientService.getPatientVisits(2L).size());
    }
}
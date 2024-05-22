insert into address (id, address_line1, address_line2, city, postal_code)
            values
            (1, 'Grove Street', '1/1', 'San Andreas', '00-997'),
            (2, 'xx', 'yy', 'city', '62-030'),
            (3, 'Aleje Ujazdowskie', 'xde', 'Warszawa', '00-000'),
            (4, 'Dragon Temple', 'Scarlet Rode', 'Elden Ring','01-001'),
            (5, '1st', '27/8', 'Arrakin', '55-555');


insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, ADDRESS_ENTITY_ID )
    values
    (1, 'jaki', 'taki', '007', 'noone69@not.in', '80085', 'SURGEON', 1),
    (2,'Piotr', 'Kulczypal', '+48 999888777' ,'xde@hotmail.com', '10100', 'DERMATOLOGIST', 2),
    (3,'Piotr', 'Kulczypal', '+01 999888777' ,'xde@hotmail.com', '10101', 'GP', 3);

insert into patient (ID, DATE_OF_BIRTH, EMAIL, FIRST_NAME, LAST_NAME, PATIENT_NUMBER, TELEPHONE_NUMBER, IS_PREMIUM_CLIENT, ADDRESS_ENTITY_ID )
    values
        (1, '2001-12-01', 'noone69@not.in', 'jaki', 'taki', '80085', '006006006', false ,1),
        (2, '1996-01-01', 'nolife42@not.out', 'Nub', 'Kowal', '11111', '007007007', false ,2),
        (3, '1991-05-07', 'kuma@gmail.com', 'Jim', 'Kazam', '66666', '800800800', true, 3);


insert into visit (id, description, time, doctor_id, patient_id)
    values
        (1, 'youth patient', '2024-01-01T11:00:00.000', 1, 1),
        (2, 'adult patient', '2024-01-01T12:00:00.000', 2, 1),
        (3, 'old patient', '2024-01-01T13:00:00.000', 3, 3);


insert into medical_treatment (id, description, type, visit_id)
    values
        (1, 'gender identification', 'USG', 1),
        (2, 'kidney stones', 'USG', 2),
        (3, 'head transplantation', 'RTG', 3);

/*
select p.*, a.* from patient p join address a on p.ADDRESS_ENTITY_ID = a.ID;

select p.*, a.* from doctor p join address a on p.ADDRESS_ENTITY_ID = a.ID;

select v.*, d.*, p.* from visit v
join doctor  d on v.doctor_id  = d.ID
join patient p on v.PATIENT_ID = p.ID;


select m.*, v.*, d.*, p.* from medical_treatment m
join visit v on v.
join doctor  d on v.doctor_id  = d.ID
join patient p on v.PATIENT_ID = p.ID;

select m.*, v.*, d.FIRST_NAME , d.LAST_NAME , p.FIRST_NAME, p.LAST_NAME  from medical_treatment m
join visit v on m.VISIT_ID = v.ID
join doctor d on v.doctor_id  = d.ID
join patient p on v.PATIENT_ID = p.ID;

*/
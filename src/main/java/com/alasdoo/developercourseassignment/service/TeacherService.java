package com.alasdoo.developercourseassignment.service;

import com.alasdoo.developercourseassignment.dto.TeacherDTO;

public interface TeacherService {

    TeacherDTO findByTeacherNameAndTeacherSurname(String name, String surname);

    TeacherDTO findByTeacherEmail(String email);
}

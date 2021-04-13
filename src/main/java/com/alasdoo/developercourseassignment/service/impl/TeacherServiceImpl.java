package com.alasdoo.developercourseassignment.service.impl;

import com.alasdoo.developercourseassignment.dto.TeacherDTO;
import com.alasdoo.developercourseassignment.mapper.TeacherMapper;
import com.alasdoo.developercourseassignment.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TeacherServiceImpl {
    
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherMapper teacherMapper;

    public TeacherDTO findOne(Integer id) {
        return null;
    }

    public List<TeacherDTO> findAll() {
        return null;
    }

    public TeacherDTO save(TeacherDTO teacherDTO) {
        return null;
    }

    public void remove(Integer id) throws IllegalArgumentException {
    }

    public TeacherDTO update(Integer id, TeacherDTO teacherDTO) {
        return null;
    }

    public TeacherDTO findByTeacherNameAndTeacherSurname(String name, String surname) {
        return null;
    }

    public TeacherDTO findByTeacherEmail(String email) {
        return null;
    }
}

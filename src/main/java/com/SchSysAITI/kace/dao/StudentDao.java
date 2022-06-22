package com.SchSysAITI.kace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchSysAITI.kace.pojo.Student;

public interface StudentDao extends JpaRepository<Student, Long> {


}

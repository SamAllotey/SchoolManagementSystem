package com.SchSysAITI.kace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchSysAITI.kace.pojo.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}

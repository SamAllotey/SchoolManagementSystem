package com.SchSysAITI.kace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchSysAITI.kace.pojo.Attendance;

public interface AttendanceDao extends JpaRepository<Attendance, Long> {

}

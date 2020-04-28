package com.pluralsight.conferencedemo.repository;

import com.pluralsight.conferencedemo.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

package com.marketing2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing2.entity.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}

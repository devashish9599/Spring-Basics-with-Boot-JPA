package com.springbasics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbasics.model.StudentEntity;
@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long>{

}

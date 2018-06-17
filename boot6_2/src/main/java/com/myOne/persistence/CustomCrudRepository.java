package com.myOne.persistence;

import org.springframework.data.repository.CrudRepository;

import com.myOne.domain.WebBoard;

public interface CustomCrudRepository extends CrudRepository<WebBoard, Long>, CustomWebBoard{

}

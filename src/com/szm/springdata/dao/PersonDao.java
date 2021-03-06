package com.szm.springdata.dao;

import org.springframework.data.repository.Repository;

import com.szm.springdata.entity.Person;

public interface PersonDao extends Repository<Person, Integer> {
	
	Person getPersonByName(String name)throws Exception;
}


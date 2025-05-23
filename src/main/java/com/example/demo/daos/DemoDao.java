package com.example.demo.daos;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;

@Repository(value="com.example.demo.daos.DemoDao")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DemoDao {
    
    private static final String GET_FIRST_NAME = "SELECT name FROM testtable WHERE idTestTable = 1";

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String getFirstName(){
        List<String> namesFound = 
            jdbcTemplate.queryForList(GET_FIRST_NAME, 
                                      new MapSqlParameterSource(), 
                                      String.class); 
        return namesFound.get(0);
    }
} 
package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@RequestMapping("/insert")
	public String insert() {
		jdbcTemplate.execute("insert into student(id,name,age) values (3,'Rahul',22)");
		return "Data inserted ";
		
	}
}

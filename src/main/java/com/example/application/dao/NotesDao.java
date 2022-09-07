//package com.example.application.dao;
//
//import java.util.HashMap;
//
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class NotesDao {
//
//	
//	@Autowired(required = false)
//	private HashMap<String, String> queries;
//
////	private SimpleJdbcInsert simpleJdbcInsert;
//
////	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//	@Autowired
//	private DataSource dataSource;
//
////	@PostConstruct
////	private void postConstruct() {
////		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
////		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("branch").withSchemaName("public")
////				.usingGeneratedKeyColumns("id");
////	}
//}

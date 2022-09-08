package com.example.application.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.example.application.module.Notes;

public interface NotesRepo extends MongoRepository<Notes, Integer> {

	@Query(value = "{?0:?1}", fields = "{notes10:1, notes20:1}")
	public List<Notes> findFields(String note, String value);

//	@Query(fields="{notes10:1, notes20:1}")
//	public List<Notes> findOnlyFields();

	@Query("{ ?0 : ?1 }")
	Notes findByDynamicField(String field, Object value);

	@Query("{ notes1 : ?0,notes2: ?1,notes3: ?2,notes4 :?3 }")
	List<Notes> findByDynamicFields(String notes1, String notes2,String notes3,String notes4);

	
	
	@Query(value = "{notes1:?0}")
	public List<Notes> findFieldName(String name);
	
}	

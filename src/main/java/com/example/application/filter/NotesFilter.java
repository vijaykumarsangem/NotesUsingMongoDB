package com.example.application.filter;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.application.module.Notes;
import com.example.application.repo.NotesRepo;
import com.mongodb.DBObject;
import com.mongodb.internal.connection.ClusterDescriptionHelper.Predicate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

@Service
public class NotesFilter {

	@Autowired
	NotesRepo notesrepo;

	@Autowired
	private MongoTemplate mongoTemplate;

//	public void filterNotes(@RequestParam(value = "notes", required = false) List<String> notes) {
//		String query = "{" + notes + ":?0}";
//
//	}

	public List<Notes> findByNotes(String note1, Integer note2, Date note3, Long note4) {

		Query dynamicQuery = new Query();
		if (note1 != null) {
			Criteria nameCriteria = Criteria.where("notes1").is(note1);
			dynamicQuery.addCriteria(nameCriteria);
		}
		if (note2 != null) {
			Criteria phoneCriteria = Criteria.where("notes18").is(note2);
			dynamicQuery.addCriteria(phoneCriteria);
		}
		if (note3 != null) {
			Criteria phoneCriteria = Criteria.where("notes21").is(note3);
			dynamicQuery.addCriteria(phoneCriteria);
		}
		if (note4 != null) {
			Criteria phoneCriteria = Criteria.where("notes32").is(note4);
			dynamicQuery.addCriteria(phoneCriteria);
		}
		return mongoTemplate.find(dynamicQuery, Notes.class, "notes");
	}
	
	
	public List<Notes> findByNotesFields(String[] fields) {

		Query dynamicQuery = new Query();
		for(String field:fields) {
			dynamicQuery.fields().include(field);
		}
		
		return mongoTemplate.find(dynamicQuery, Notes.class, "notes");
	}
	
	public List<Notes> findByNoteFields(String[] fields) {

		Query dynamicQuery = new Query();
		for(String field:fields) {
			Criteria phoneCriteria = Criteria.where("fields").is(field);
			dynamicQuery.addCriteria(phoneCriteria);
		}
		
		return mongoTemplate.find(dynamicQuery, Notes.class, "notes");
	}

}

package com.example.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.filter.NotesFilter;
import com.example.application.module.Notes;
import com.example.application.service.NotesService;

@RestController
@RequestMapping("/api")
public class NotesController {
	@Autowired
	NotesService notesserv;
	
	@Autowired
	NotesFilter filter;

	@GetMapping("/getAllnotes")
	public List<Notes> getAllNote() {
		return notesserv.getAllNotes();
	}

	@PostMapping("/savenotes")
	public String saveNote(@RequestBody Notes notes) {
		notesserv.saveNotes(notes);
		return "saved notes";
	}

	
//	@DeleteMapping("/deletenote/{id}")
//	private void deleteNote(@PathVariable("id") int id) {
//		notesserv.deleteNotes(id);
//	}
	
	@GetMapping("/get/{id}")
	public Notes getNotesById(@PathVariable("id") int id) {
		Notes note=notesserv.getById(id);
		return note;
	}
	
	@GetMapping("/getfields/{note}")
	private List<Notes> getNotesByFields(@PathVariable("note") String note,@PathVariable("value") String value) {
		return notesserv.getByFields(note,value);
	}
	
//	@GetMapping("/getFields")
//	private List<Notes> getNotesById() {
//		List<Notes> note=notesserv.getByOnlyFields();
//		return note;
//	}
	
	@GetMapping("/getfields")
	public List<Notes> getByFields(@RequestParam(value = "notes1", required = false) String note1,@RequestParam(value = "notes2", required = false) String note2,@RequestParam(value = "notes3", required = false) String note3,@RequestParam(value = "notes4", required = false) String note4) {
		return filter.findByNotes(note1, note2, note3, note4);
	}
	
	
	@GetMapping("/getNotesFields")
	public List<Notes> getByNotesFields(@RequestParam(value = "fields", required = false) String[] fields) {
		return filter.findByNotesFields(fields);
	}
	
	@PostMapping("/savesinglenotes")
	public String saveSingle(@RequestBody Notes notes) {
		notesserv.saveSingleNotes(notes);
		return "saved notes";
	}
	
	@GetMapping("/getnewfields/{notes1}/{notes2}/{notes3}/{notes4}")
	public List<Notes> getByNewFields(@PathVariable(value = "notes1") String note1,@PathVariable(value = "notes2") String note2,@PathVariable(value = "notes3") String note3,@PathVariable(value = "notes4") String note4) {
		return notesserv.getByNFields(note1, note2, note3, note4);
	}
	
	@GetMapping("/getNoteFields")
	public List<Notes> getByNoteFields(@RequestParam(value = "fields", required = false) String[] fields) {
		return filter.findByNoteFields(fields);
	}
	
}

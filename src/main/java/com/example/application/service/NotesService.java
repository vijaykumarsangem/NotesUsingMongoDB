package com.example.application.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.application.module.MongoDbSequence;
import com.example.application.module.Notes;
import com.example.application.repo.NotesRepo;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class NotesService {

	@Autowired
	NotesRepo notesrepo;

	@Autowired
	SequenceService serv;

	public List<Notes> getAllNotes() {
		return notesrepo.findAll();
	}

	public void saveSingleNotes(Notes notes) {
		notesrepo.save(notes);
	}
	
	
	public void saveNotes(Notes notes) {
		for (int i = 0; i < 10000000; i++) {
			Notes n = new Notes();

			n.setId(serv.generateSequence(Notes.SEQUENCE_NAME));
			n.setNotes1(notes.getNotes1());
			n.setNotes2(notes.getNotes2());
			n.setNotes3(notes.getNotes3());
			n.setNotes4(notes.getNotes4());
			n.setNotes5(notes.getNotes5());
			n.setNotes6(notes.getNotes6());
			n.setNotes7(notes.getNotes7());
			n.setNotes8(notes.getNotes8());
			n.setNotes9(notes.getNotes9());
			n.setNotes10(notes.getNotes10());
			n.setNotes11(notes.getNotes11());
			n.setNotes12(notes.getNotes12());
			n.setNotes13(notes.getNotes13());
			n.setNotes14(notes.getNotes14());
			n.setNotes15(notes.getNotes15());
			n.setNotes16(notes.getNotes16());
			n.setNotes17(notes.getNotes17());
			n.setNotes18(notes.getNotes18());
			n.setNotes19(notes.getNotes19());
			n.setNotes20(notes.getNotes20());
			n.setNotes21(notes.getNotes21());
			n.setNotes22(notes.getNotes22());
			n.setNotes23(notes.getNotes23());
			n.setNotes24(notes.getNotes24());
			n.setNotes25(notes.getNotes25());
			n.setNotes26(notes.getNotes26());
			n.setNotes27(notes.getNotes27());
			n.setNotes28(notes.getNotes28());
			n.setNotes29(notes.getNotes29());
			n.setNotes30(notes.getNotes30());
			n.setNotes31(notes.getNotes31());
			n.setNotes32(notes.getNotes32());
			n.setNotes33(notes.getNotes33());
			n.setNotes34(notes.getNotes34());
			n.setNotes35(notes.getNotes35());
			n.setNotes36(notes.getNotes36());
			n.setNotes37(notes.getNotes37());
			n.setNotes38(notes.getNotes38());
			n.setNotes39(notes.getNotes39());
			n.setNotes40(notes.getNotes40());
			n.setNotes41(notes.getNotes41());
			n.setNotes42(notes.getNotes42());
			n.setNotes43(notes.getNotes43());
			n.setNotes44(notes.getNotes44());
			n.setNotes45(notes.getNotes45());
			n.setNotes46(notes.getNotes46());
			n.setNotes47(notes.getNotes47());
			n.setNotes48(notes.getNotes48());
			n.setNotes49(notes.getNotes49());
			n.setNotes50(notes.getNotes50());
			n.setNotes51(notes.getNotes51());
			n.setNotes52(notes.getNotes52());
			n.setNotes53(notes.getNotes53());
			n.setNotes54(notes.getNotes54());
			n.setNotes55(notes.getNotes55());
			n.setNotes56(notes.getNotes56());
			n.setNotes57(notes.getNotes57());
			n.setNotes58(notes.getNotes58());
			n.setNotes59(notes.getNotes59());
			n.setNotes60(notes.getNotes60());
			n.setNotes61(notes.getNotes61());
			n.setNotes62(notes.getNotes62());
			n.setNotes63(notes.getNotes63());
			n.setNotes64(notes.getNotes64());
			n.setNotes65(notes.getNotes65());
			n.setNotes66(notes.getNotes66());
			n.setNotes67(notes.getNotes67());
			n.setNotes68(notes.getNotes68());
			n.setNotes69(notes.getNotes69());
			n.setNotes70(notes.getNotes70());
			notesrepo.save(n);
		}
	}
	
	
	public void saveHundredUsers(Notes notes) {
		for (long i = 0; i < 100; i++) {
			Notes n = new Notes();
			
			n.setId(serv.generateSequence(Notes.SEQUENCE_NAME));
			n.setNotes1(notes.getNotes1());
			n.setNotes2(notes.getNotes2());
			n.setNotes3(notes.getNotes3());
			n.setNotes4(notes.getNotes4());
			n.setNotes5(notes.getNotes5());
			n.setNotes6(notes.getNotes6());
			n.setNotes7(notes.getNotes7());
			n.setNotes8(notes.getNotes8());
			n.setNotes9(notes.getNotes9());
			n.setNotes10(notes.getNotes10());
			n.setNotes11(notes.getNotes11());
			n.setNotes12(notes.getNotes12());
			n.setNotes13(notes.getNotes13());
			n.setNotes14(notes.getNotes14());
			n.setNotes15(notes.getNotes15());
			n.setNotes16(notes.getNotes16());
			n.setNotes17(notes.getNotes17());
			n.setNotes18(notes.getNotes18());
			n.setNotes19(notes.getNotes19());
			n.setNotes20(notes.getNotes20());
			n.setNotes21(notes.getNotes21());
			n.setNotes22(notes.getNotes22());
			n.setNotes23(notes.getNotes23());
			n.setNotes24(notes.getNotes24());
			n.setNotes25(notes.getNotes25());
			n.setNotes26(notes.getNotes26());
			n.setNotes27(notes.getNotes27());
			n.setNotes28(notes.getNotes28());
			n.setNotes29(notes.getNotes29());
			n.setNotes30(notes.getNotes30());
			n.setNotes31(notes.getNotes31());
			n.setNotes32(notes.getNotes32());
			n.setNotes33(notes.getNotes33());
			n.setNotes34(notes.getNotes34());
			n.setNotes35(notes.getNotes35());
			n.setNotes36(notes.getNotes36());
			n.setNotes37(notes.getNotes37());
			n.setNotes38(notes.getNotes38());
			n.setNotes39(notes.getNotes39());
			n.setNotes40(notes.getNotes40());
			n.setNotes41(notes.getNotes41());
			n.setNotes42(notes.getNotes42());
			n.setNotes43(notes.getNotes43());
			n.setNotes44(notes.getNotes44());
			n.setNotes45(notes.getNotes45());
			n.setNotes46(notes.getNotes46());
			n.setNotes47(notes.getNotes47());
			n.setNotes48(notes.getNotes48());
			n.setNotes49(notes.getNotes49());
			n.setNotes50(notes.getNotes50());
			n.setNotes51(notes.getNotes51());
			n.setNotes52(notes.getNotes52());
			n.setNotes53(notes.getNotes53());
			n.setNotes54(notes.getNotes54());
			n.setNotes55(notes.getNotes55());
			n.setNotes56(notes.getNotes56());
			n.setNotes57(notes.getNotes57());
			n.setNotes58(notes.getNotes58());
			n.setNotes59(notes.getNotes59());
			n.setNotes60(notes.getNotes60());
			n.setNotes61(notes.getNotes61());
			n.setNotes62(notes.getNotes62());
			n.setNotes63(notes.getNotes63());
			n.setNotes64(notes.getNotes64());
			n.setNotes65(notes.getNotes65());
			n.setNotes66(notes.getNotes66());
			n.setNotes67(notes.getNotes67());
			n.setNotes68(notes.getNotes68());
			n.setNotes69(notes.getNotes69());
			n.setNotes70(notes.getNotes70());
			notesrepo.save(n);
		}
	}

	public void saveThousandUsers(Notes notes) {
		for (long i = 0; i < 1000; i++) {
			Notes n = new Notes();
			n.setId(serv.generateSequence(Notes.SEQUENCE_NAME));
			n.setNotes1(notes.getNotes1());
			n.setNotes2(notes.getNotes2());
			n.setNotes3(notes.getNotes3());
			n.setNotes4(notes.getNotes4());
			n.setNotes5(notes.getNotes5());
			n.setNotes6(notes.getNotes6());
			n.setNotes7(notes.getNotes7());
			n.setNotes8(notes.getNotes8());
			n.setNotes9(notes.getNotes9());
			n.setNotes10(notes.getNotes10());
			n.setNotes11(notes.getNotes11());
			n.setNotes12(notes.getNotes12());
			n.setNotes13(notes.getNotes13());
			n.setNotes14(notes.getNotes14());
			n.setNotes15(notes.getNotes15());
			n.setNotes16(notes.getNotes16());
			n.setNotes17(notes.getNotes17());
			n.setNotes18(notes.getNotes18());
			n.setNotes19(notes.getNotes19());
			n.setNotes20(notes.getNotes20());
			n.setNotes21(notes.getNotes21());
			n.setNotes22(notes.getNotes22());
			n.setNotes23(notes.getNotes23());
			n.setNotes24(notes.getNotes24());
			n.setNotes25(notes.getNotes25());
			n.setNotes26(notes.getNotes26());
			n.setNotes27(notes.getNotes27());
			n.setNotes28(notes.getNotes28());
			n.setNotes29(notes.getNotes29());
			n.setNotes30(notes.getNotes30());
			n.setNotes31(notes.getNotes31());
			n.setNotes32(notes.getNotes32());
			n.setNotes33(notes.getNotes33());
			n.setNotes34(notes.getNotes34());
			n.setNotes35(notes.getNotes35());
			n.setNotes36(notes.getNotes36());
			n.setNotes37(notes.getNotes37());
			n.setNotes38(notes.getNotes38());
			n.setNotes39(notes.getNotes39());
			n.setNotes40(notes.getNotes40());
			n.setNotes41(notes.getNotes41());
			n.setNotes42(notes.getNotes42());
			n.setNotes43(notes.getNotes43());
			n.setNotes44(notes.getNotes44());
			n.setNotes45(notes.getNotes45());
			n.setNotes46(notes.getNotes46());
			n.setNotes47(notes.getNotes47());
			n.setNotes48(notes.getNotes48());
			n.setNotes49(notes.getNotes49());
			n.setNotes50(notes.getNotes50());
			n.setNotes51(notes.getNotes51());
			n.setNotes52(notes.getNotes52());
			n.setNotes53(notes.getNotes53());
			n.setNotes54(notes.getNotes54());
			n.setNotes55(notes.getNotes55());
			n.setNotes56(notes.getNotes56());
			n.setNotes57(notes.getNotes57());
			n.setNotes58(notes.getNotes58());
			n.setNotes59(notes.getNotes59());
			n.setNotes60(notes.getNotes60());
			n.setNotes61(notes.getNotes61());
			n.setNotes62(notes.getNotes62());
			n.setNotes63(notes.getNotes63());
			n.setNotes64(notes.getNotes64());
			n.setNotes65(notes.getNotes65());
			n.setNotes66(notes.getNotes66());
			n.setNotes67(notes.getNotes67());
			n.setNotes68(notes.getNotes68());
			n.setNotes69(notes.getNotes69());
			n.setNotes70(notes.getNotes70());
			notesrepo.save(n);
		}
	}

	public void saveTenThousandUsers(Notes notes) {
		for (long i = 0; i < 10000; i++) {
			Notes n = new Notes();
			n.setId(serv.generateSequence(Notes.SEQUENCE_NAME));
			n.setNotes1(notes.getNotes1());
			n.setNotes2(notes.getNotes2());
			n.setNotes3(notes.getNotes3());
			n.setNotes4(notes.getNotes4());
			n.setNotes5(notes.getNotes5());
			n.setNotes6(notes.getNotes6());
			n.setNotes7(notes.getNotes7());
			n.setNotes8(notes.getNotes8());
			n.setNotes9(notes.getNotes9());
			n.setNotes10(notes.getNotes10());
			n.setNotes11(notes.getNotes11());
			n.setNotes12(notes.getNotes12());
			n.setNotes13(notes.getNotes13());
			n.setNotes14(notes.getNotes14());
			n.setNotes15(notes.getNotes15());
			n.setNotes16(notes.getNotes16());
			n.setNotes17(notes.getNotes17());
			n.setNotes18(notes.getNotes18());
			n.setNotes19(notes.getNotes19());
			n.setNotes20(notes.getNotes20());
			n.setNotes21(notes.getNotes21());
			n.setNotes22(notes.getNotes22());
			n.setNotes23(notes.getNotes23());
			n.setNotes24(notes.getNotes24());
			n.setNotes25(notes.getNotes25());
			n.setNotes26(notes.getNotes26());
			n.setNotes27(notes.getNotes27());
			n.setNotes28(notes.getNotes28());
			n.setNotes29(notes.getNotes29());
			n.setNotes30(notes.getNotes30());
			n.setNotes31(notes.getNotes31());
			n.setNotes32(notes.getNotes32());
			n.setNotes33(notes.getNotes33());
			n.setNotes34(notes.getNotes34());
			n.setNotes35(notes.getNotes35());
			n.setNotes36(notes.getNotes36());
			n.setNotes37(notes.getNotes37());
			n.setNotes38(notes.getNotes38());
			n.setNotes39(notes.getNotes39());
			n.setNotes40(notes.getNotes40());
			n.setNotes41(notes.getNotes41());
			n.setNotes42(notes.getNotes42());
			n.setNotes43(notes.getNotes43());
			n.setNotes44(notes.getNotes44());
			n.setNotes45(notes.getNotes45());
			n.setNotes46(notes.getNotes46());
			n.setNotes47(notes.getNotes47());
			n.setNotes48(notes.getNotes48());
			n.setNotes49(notes.getNotes49());
			n.setNotes50(notes.getNotes50());
			n.setNotes51(notes.getNotes51());
			n.setNotes52(notes.getNotes52());
			n.setNotes53(notes.getNotes53());
			n.setNotes54(notes.getNotes54());
			n.setNotes55(notes.getNotes55());
			n.setNotes56(notes.getNotes56());
			n.setNotes57(notes.getNotes57());
			n.setNotes58(notes.getNotes58());
			n.setNotes59(notes.getNotes59());
			n.setNotes60(notes.getNotes60());
			n.setNotes61(notes.getNotes61());
			n.setNotes62(notes.getNotes62());
			n.setNotes63(notes.getNotes63());
			n.setNotes64(notes.getNotes64());
			n.setNotes65(notes.getNotes65());
			n.setNotes66(notes.getNotes66());
			n.setNotes67(notes.getNotes67());
			n.setNotes68(notes.getNotes68());
			n.setNotes69(notes.getNotes69());
			n.setNotes70(notes.getNotes70());
			notesrepo.save(n);
		}
	}

	public Notes getById(int id) {
		return notesrepo.findById(id).get();
	}
	
	public List<Notes> getByName(String name) {
		return notesrepo.findFieldName(name);
	}

	public List<Notes> getByFields(String note, String value) {
		return notesrepo.findFields(note, value);
	}

//	public List<Notes> getByOnlyFields() {
//		return notesrepo.findOnlyFields();
//	}
	
	public List<Notes> getByNFields(String note1, String note2,String note3,String note4) {
		return notesrepo.findByDynamicFields(note1, note2,note3,note4);
	}

}

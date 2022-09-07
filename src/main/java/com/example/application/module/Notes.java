package com.example.application.module;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notestest")
public class Notes {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	private long id;
	private String notes1;
	private String notes2;
	private String notes3;
	private String notes4;
	private String notes5;
	private String notes6;
	private String notes7;
	private String notes8;
	private String notes9;
	private String notes10;
	private Integer notes11;
	private Integer notes12;
	private Integer notes13;
	private Integer notes14;
	private Integer notes15;
	private Integer notes16;
	private Integer notes17;
	private Integer notes18;
	private Integer notes19;
	private Integer notes20;
	private Date notes21;
	private Date notes22;
	private Date notes23;
	private Date notes24;
	private Date notes25;
	private Long notes26;
	private Long notes27;
	private Long notes28;
	private Long notes29;
	private Long notes30;
	private Long notes31;
	private Long notes32;
	private Long notes33;
	private Long notes34;
	private Long notes35;
	private Double notes36;
	private Double notes37;
	private Double notes38;
	private Double notes39;
	private Double notes40;
	private Double notes41;
	private Timestamp notes42;
	private Timestamp notes43;
	private Timestamp notes44;
	private Timestamp notes45;
	private Boolean notes46;
	private Boolean notes47;
	private Boolean notes48;
	private Boolean notes49;
	private Boolean notes50;
	private String notes51;
	private String notes52;
	private String notes53;
	private String notes54;
	private String notes55;
	private String notes56;
	private String notes57;
	private String notes58;
	private String notes59;
	private String notes60;
	private String notes61;
	private String notes62;
	private String notes63;
	private String notes64;
	private String notes65;
	private String notes66;
	private String notes67;
	private String notes68;
	private String notes69;
	private String notes70;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNotes1() {
		return notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public String getNotes3() {
		return notes3;
	}

	public void setNotes3(String notes3) {
		this.notes3 = notes3;
	}

	public String getNotes4() {
		return notes4;
	}

	public void setNotes4(String notes4) {
		this.notes4 = notes4;
	}

	public String getNotes5() {
		return notes5;
	}

	public void setNotes5(String notes5) {
		this.notes5 = notes5;
	}

	public String getNotes6() {
		return notes6;
	}

	public void setNotes6(String notes6) {
		this.notes6 = notes6;
	}

	public String getNotes7() {
		return notes7;
	}

	public void setNotes7(String notes7) {
		this.notes7 = notes7;
	}

	public String getNotes8() {
		return notes8;
	}

	public void setNotes8(String notes8) {
		this.notes8 = notes8;
	}

	public String getNotes9() {
		return notes9;
	}

	public void setNotes9(String notes9) {
		this.notes9 = notes9;
	}

	public String getNotes10() {
		return notes10;
	}

	public void setNotes10(String notes10) {
		this.notes10 = notes10;
	}

	public Integer getNotes11() {
		return notes11;
	}

	public void setNotes11(Integer notes11) {
		this.notes11 = notes11;
	}

	public Integer getNotes12() {
		return notes12;
	}

	public void setNotes12(Integer notes12) {
		this.notes12 = notes12;
	}

	public Integer getNotes13() {
		return notes13;
	}

	public void setNotes13(Integer notes13) {
		this.notes13 = notes13;
	}

	public Integer getNotes14() {
		return notes14;
	}

	public void setNotes14(Integer notes14) {
		this.notes14 = notes14;
	}

	public Integer getNotes15() {
		return notes15;
	}

	public void setNotes15(Integer notes15) {
		this.notes15 = notes15;
	}

	public Integer getNotes16() {
		return notes16;
	}

	public void setNotes16(Integer notes16) {
		this.notes16 = notes16;
	}

	public Integer getNotes17() {
		return notes17;
	}

	public void setNotes17(Integer notes17) {
		this.notes17 = notes17;
	}

	public Integer getNotes18() {
		return notes18;
	}

	public void setNotes18(Integer notes18) {
		this.notes18 = notes18;
	}

	public Integer getNotes19() {
		return notes19;
	}

	public void setNotes19(Integer notes19) {
		this.notes19 = notes19;
	}

	public Integer getNotes20() {
		return notes20;
	}

	public void setNotes20(Integer notes20) {
		this.notes20 = notes20;
	}

	public Date getNotes21() {
		return notes21;
	}

	public void setNotes21(Date notes21) {
		this.notes21 = notes21;
	}

	public Date getNotes22() {
		return notes22;
	}

	public void setNotes22(Date notes22) {
		this.notes22 = notes22;
	}

	public Date getNotes23() {
		return notes23;
	}

	public void setNotes23(Date notes23) {
		this.notes23 = notes23;
	}

	public Date getNotes24() {
		return notes24;
	}

	public void setNotes24(Date notes24) {
		this.notes24 = notes24;
	}

	public Date getNotes25() {
		return notes25;
	}

	public void setNotes25(Date notes25) {
		this.notes25 = notes25;
	}

	public Long getNotes26() {
		return notes26;
	}

	public void setNotes26(Long notes26) {
		this.notes26 = notes26;
	}

	public Long getNotes27() {
		return notes27;
	}

	public void setNotes27(Long notes27) {
		this.notes27 = notes27;
	}

	public Long getNotes28() {
		return notes28;
	}

	public void setNotes28(Long notes28) {
		this.notes28 = notes28;
	}

	public Long getNotes29() {
		return notes29;
	}

	public void setNotes29(Long notes29) {
		this.notes29 = notes29;
	}

	public Long getNotes30() {
		return notes30;
	}

	public void setNotes30(Long notes30) {
		this.notes30 = notes30;
	}

	public Long getNotes31() {
		return notes31;
	}

	public void setNotes31(Long notes31) {
		this.notes31 = notes31;
	}

	public Long getNotes32() {
		return notes32;
	}

	public void setNotes32(Long notes32) {
		this.notes32 = notes32;
	}

	public Long getNotes33() {
		return notes33;
	}

	public void setNotes33(Long notes33) {
		this.notes33 = notes33;
	}

	public Long getNotes34() {
		return notes34;
	}

	public void setNotes34(Long notes34) {
		this.notes34 = notes34;
	}

	public Long getNotes35() {
		return notes35;
	}

	public void setNotes35(Long notes35) {
		this.notes35 = notes35;
	}

	public Double getNotes36() {
		return notes36;
	}

	public void setNotes36(Double notes36) {
		this.notes36 = notes36;
	}

	public Double getNotes37() {
		return notes37;
	}

	public void setNotes37(Double notes37) {
		this.notes37 = notes37;
	}

	public Double getNotes38() {
		return notes38;
	}

	public void setNotes38(Double notes38) {
		this.notes38 = notes38;
	}

	public Double getNotes39() {
		return notes39;
	}

	public void setNotes39(Double notes39) {
		this.notes39 = notes39;
	}

	public Double getNotes40() {
		return notes40;
	}

	public void setNotes40(Double notes40) {
		this.notes40 = notes40;
	}

	public Double getNotes41() {
		return notes41;
	}

	public void setNotes41(Double notes41) {
		this.notes41 = notes41;
	}

	public Timestamp getNotes42() {
		return notes42;
	}

	public void setNotes42(Timestamp notes42) {
		this.notes42 = notes42;
	}

	public Timestamp getNotes43() {
		return notes43;
	}

	public void setNotes43(Timestamp notes43) {
		this.notes43 = notes43;
	}

	public Timestamp getNotes44() {
		return notes44;
	}

	public void setNotes44(Timestamp notes44) {
		this.notes44 = notes44;
	}

	public Timestamp getNotes45() {
		return notes45;
	}

	public void setNotes45(Timestamp notes45) {
		this.notes45 = notes45;
	}

	public Boolean getNotes46() {
		return notes46;
	}

	public void setNotes46(Boolean notes46) {
		this.notes46 = notes46;
	}

	public Boolean getNotes47() {
		return notes47;
	}

	public void setNotes47(Boolean notes47) {
		this.notes47 = notes47;
	}

	public Boolean getNotes48() {
		return notes48;
	}

	public void setNotes48(Boolean notes48) {
		this.notes48 = notes48;
	}

	public Boolean getNotes49() {
		return notes49;
	}

	public void setNotes49(Boolean notes49) {
		this.notes49 = notes49;
	}

	public Boolean getNotes50() {
		return notes50;
	}

	public void setNotes50(Boolean notes50) {
		this.notes50 = notes50;
	}

	public String getNotes51() {
		return notes51;
	}

	public void setNotes51(String notes51) {
		this.notes51 = notes51;
	}

	public String getNotes52() {
		return notes52;
	}

	public void setNotes52(String notes52) {
		this.notes52 = notes52;
	}

	public String getNotes53() {
		return notes53;
	}

	public void setNotes53(String notes53) {
		this.notes53 = notes53;
	}

	public String getNotes54() {
		return notes54;
	}

	public void setNotes54(String notes54) {
		this.notes54 = notes54;
	}

	public String getNotes55() {
		return notes55;
	}

	public void setNotes55(String notes55) {
		this.notes55 = notes55;
	}

	public String getNotes56() {
		return notes56;
	}

	public void setNotes56(String notes56) {
		this.notes56 = notes56;
	}

	public String getNotes57() {
		return notes57;
	}

	public void setNotes57(String notes57) {
		this.notes57 = notes57;
	}

	public String getNotes58() {
		return notes58;
	}

	public void setNotes58(String notes58) {
		this.notes58 = notes58;
	}

	public String getNotes59() {
		return notes59;
	}

	public void setNotes59(String notes59) {
		this.notes59 = notes59;
	}

	public String getNotes60() {
		return notes60;
	}

	public void setNotes60(String notes60) {
		this.notes60 = notes60;
	}

	public String getNotes61() {
		return notes61;
	}

	public void setNotes61(String notes61) {
		this.notes61 = notes61;
	}

	public String getNotes62() {
		return notes62;
	}

	public void setNotes62(String notes62) {
		this.notes62 = notes62;
	}

	public String getNotes63() {
		return notes63;
	}

	public void setNotes63(String notes63) {
		this.notes63 = notes63;
	}

	public String getNotes64() {
		return notes64;
	}

	public void setNotes64(String notes64) {
		this.notes64 = notes64;
	}

	public String getNotes65() {
		return notes65;
	}

	public void setNotes65(String notes65) {
		this.notes65 = notes65;
	}

	public String getNotes66() {
		return notes66;
	}

	public void setNotes66(String notes66) {
		this.notes66 = notes66;
	}

	public String getNotes67() {
		return notes67;
	}

	public void setNotes67(String notes67) {
		this.notes67 = notes67;
	}

	public String getNotes68() {
		return notes68;
	}

	public void setNotes68(String notes68) {
		this.notes68 = notes68;
	}

	public String getNotes69() {
		return notes69;
	}

	public void setNotes69(String notes69) {
		this.notes69 = notes69;
	}

	public String getNotes70() {
		return notes70;
	}

	public void setNotes70(String notes70) {
		this.notes70 = notes70;
	}

}

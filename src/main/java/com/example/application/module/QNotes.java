//package com.example.application.module;
//
//import com.querydsl.core.annotations.Generated;
//import com.querydsl.core.types.Path;
//import com.querydsl.core.types.PathMetadata;
//import com.querydsl.core.types.dsl.EntityPathBase;
//import com.querydsl.core.types.dsl.NumberPath;
//import com.querydsl.core.types.dsl.StringPath;
//
//@Generated("com.mysema.query.codegen.EntitySerializer")
//
//public class QNotes extends EntityPathBase<Notes>{
//
//	
//    public static final QNotes user = new QNotes("notes");
//
//    public final NumberPath<Integer> id = createNumber("id", Integer.class);
//
//    public final StringPath notes1 = createString("notes1");
//    
//    
//    public QNotes(String variable) {
//        super(Notes.class, forVariable(variable));
//    }
//
//    private static String forVariable(String variable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public QNotes(Path<? extends Notes> path) {
//        super(path.getType(), path.getMetadata());
//    }
//
//    public QNotes(PathMetadata metadata) {
//        super(Notes.class, metadata);
//    }
//}

package com.monocept.creations;

public class DataBase {
private static DataBase db;
private DataBase() {
	
}
public static DataBase getDB() {
	if(db==null) {
		db=new DataBase();
		
	}
	return db;
}
}

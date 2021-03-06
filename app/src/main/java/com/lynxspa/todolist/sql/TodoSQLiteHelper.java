package com.lynxspa.todolist.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Creates application database.
 * 
 * @author itcuties
 *
 */
public class TodoSQLiteHelper extends SQLiteOpenHelper {

	public TodoSQLiteHelper(Context context) {
		// Database: todos_db, Version: 1
		super(context, "todos_db", null, 1);
	}

	/**
	 * Create simple table
	 * todos
	 * 		_id 	- key
	 * 		todo	- todo text
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// Execute create table SQL
		db.execSQL("CREATE TABLE todos (_id INTEGER PRIMARY KEY AUTOINCREMENT, todo TEXT NOT NULL);");
		db.execSQL("CREATE TABLE esecutori (_id INTEGER PRIMARY KEY AUTOINCREMENT, todo TEXT NOT NULL);");
	}

	/**
	 * Recreates table
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		db.execSQL("CREATE TABLE esecutori (_id INTEGER PRIMARY KEY AUTOINCREMENT, todo TEXT NOT NULL);");
	}
	
}

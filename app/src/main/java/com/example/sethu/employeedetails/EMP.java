package com.example.sethu.employeedetails;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 1/29/2019.
 */
public class EMP extends SQLiteOpenHelper {
    public static final String Dbname = "Myemp.db";
    public static final String Tablename = "employee";
    public static final String c1 = "id";
    public static final String c2 = "ecode";
    public static final String c3 = "ename";
    public static final String c4 = "emobno";
    public static final String c5 = "eemail";
    public static final String c6 = "edesg";
    public static final String c7 = "esalary";
    public static final String c8 = "ecompany";

    public EMP(Context context) {
        super(context, Dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table " +Tablename+ "("+c1+" integer primary key autoincrement, " +c2+ " text, " +c3+ " text, "+c4 + " text, "+ c5+ " text, " +c6+ " text, " +c7+ " text, " +c8+ " text) ";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "drop table if exists" +Tablename;
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);

    }

    public boolean insertData(String ecode, String ename, String emobno, String eemail, String edesg, String esalary, String ecompany)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(c2,ecode);
        value.put(c3,ename);
        value.put(c4,emobno);
        value.put(c5,eemail);
        value.put(c6,edesg);
        value.put(c7,esalary);
        value.put(c8,ecompany);
        Long status=sqLiteDatabase.insert(Tablename,null,value);
        if (status==-1)
        {

            return false;
        }
        else
        {
            return true;
        }

    }
    public Cursor searchdata(String name)
    {
        SQLiteDatabase database=this.getWritableDatabase();
        Cursor cur=database.rawQuery("SELECT * FROM" +Tablename+"WHERE" +c2+)
    }


    }


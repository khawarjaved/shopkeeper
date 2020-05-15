package khawar.jk.shopkeeper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHalper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="Customer_info";
    private static  final String TABLE_NAME ="customer_table";
    private static final String COL1= "ID";
    private static final String COL2= "NAME";
    private static final String COL3= "SURNAME";
    private static final String COL4= "PHONE ";
    public DatabaseHalper(@Nullable Context context) {
        super(context,DATABASE_NAME,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +  TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,PHONE INTEGER)");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public  boolean insertData(String name, String surname, String phone){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,surname);
        contentValues.put(COL4,phone);
        long result =db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
            else
                return true;

    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
    }
}


package com.example.logonrm.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by logonrm on 19/10/2017.
 */

public class BibliotecaDB extends OrmLiteSqliteOpenHelper{


    public BibliotecaDB(Context context) {
        super(context, "BibliotecaDB", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

        String script = new String(
                "CREATE TABLE TB_LIVRO(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "DS_TITULO VARCHAR2(50)," +
                    "NM_AUTOR VARCHAR2(50))"
        );

        database.execSQL(script);

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        onCreate(database,connectionSource);


    }
}

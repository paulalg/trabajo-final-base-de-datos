package com.example.databaseapp.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.databaseapp.R;
import com.example.databaseapp.database.ControlPediatricoDatabaseHelper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).deleteTables();
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).onInitializeDB();
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).getAllHumor();

        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).insertPaciente("a1", "2015-01-01", 12345678, "F", 1);
        String[] paciente = ControlPediatricoDatabaseHelper.getDatabaseInstance(this).getPaciente("a1");
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).insertControl("2015-01-01",1,3.5f,30.3f,30.1f, 2,"Angela","factor AG");
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).insertControl("2015-03-01",1,5.5f,60.6f,70.7f, 3,"Beatriz","volver en 15");
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).getAllControl();
        ControlPediatricoDatabaseHelper.getDatabaseInstance(this).getControl(2);
    }  
    
}

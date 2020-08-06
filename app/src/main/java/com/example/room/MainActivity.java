package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseThread dt = new DatabaseThread();
        dt.start();
    }

    private class DatabaseThread extends Thread {
        @Override
        public void run() {
            super.run();
            StudentDatabase studentDatabase = Room.databaseBuilder(getApplicationContext(), StudentDatabase.class, "student").build();
            StudentDao jackDao = studentDatabase.getDao();
            jackDao.insert(new Student("jackou", "123", 123));
            jackDao.insert(new Student("jackou", "123", 123));
            jackDao.insert(new Student("jackou", "123", 124));
            jackDao.insert(new Student("jackou", "123", 125));

            List<Student> list = jackDao.quaryAll();
            Log.i(Constants.TAG, list.toString());
        }
    }
}

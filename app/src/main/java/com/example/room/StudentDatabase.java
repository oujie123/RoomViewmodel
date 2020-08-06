package com.example.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * @Author: Jack Ou
 * @CreateDate: 2020/8/6 22:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/6 22:38
 * @UpdateRemark: 更新说明
 */
@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase {
    public abstract StudentDao getDao();
}

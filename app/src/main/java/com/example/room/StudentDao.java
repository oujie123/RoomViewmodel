package com.example.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * @Author: Jack Ou
 * @CreateDate: 2020/8/6 22:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/8/6 22:35
 * @UpdateRemark: 更新说明
 */
@Dao
public interface StudentDao {

    @Insert
    void insert(Student... students);

    @Update
    void update(Student student);

    @Delete()
    void delete(Student student);

    @Query("SELECT * FROM Student")
    List<Student> quaryAll();

    //用冒号和变量来替换用户输入的值
    @Query("SELECT * FROM Student WHERE student_name like :name")
    Student findByName(String name);

    @Query("SELECT * FROM Student WHERE id in(:userIds)")
    List<Student> findByIds(int[] userIds);
}

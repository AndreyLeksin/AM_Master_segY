package com.example.master_segy.data.reportP;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;
@Dao
public interface IReport {
    @Insert
    void insert(Report report);
    @Update
    void update(Report report);
    @Delete
    void delete(Report report);
    @Query("SELECT * FROM report")
    List<Report> getAll();
    @Query("SELECT * FROM report WHERE id_point = :id")
    List<Report> getAllPoint(long id);
    @Query("SELECT _id FROM report WHERE title_report = :title_report")
    int getIdReportByTitleReport(String title_report);
    @Query("SELECT * FROM report WHERE _id = :id")
    Report getById(long id);
    @Query("SELECT * FROM report WHERE title_report = :title_report AND id_point = :id LIMIT 1")
    boolean is_Exist(String title_report, long id);
}

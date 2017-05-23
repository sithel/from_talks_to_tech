package studioes.arm.six.fromtalkstotech.database.daos;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import studioes.arm.six.fromtalkstotech.database.entities.StudySet;

/**
 * Created by sithel on 5/21/17.
 */

@Dao
public interface StudySetDao {
    @Query("SELECT * FROM studySet")
    public LiveData<List<StudySet>> getAll();

    @Query("SELECT * FROM studySet WHERE server_id IN (:studySetServerIds)")
    public LiveData<List<StudySet>> loadAllByServerIds(int[] studySetServerIds);

    @Query("SELECT * FROM studySet WHERE title LIKE :title")
    StudySet findByTitle(String title);

    @Insert
    void insertAll(StudySet... studySets);

    @Delete
    void delete(StudySet studySet);
}

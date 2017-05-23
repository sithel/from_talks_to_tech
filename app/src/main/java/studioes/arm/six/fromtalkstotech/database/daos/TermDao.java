package studioes.arm.six.fromtalkstotech.database.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import studioes.arm.six.fromtalkstotech.database.entities.Term;

/**
 * Created by sithel on 5/21/17.
 */
@Dao
public interface TermDao {
    @Query("SELECT * FROM term")
    List<Term> getAll();

    @Query("SELECT * FROM term WHERE local_study_set_id =  :localStudySetId")
    List<Term> loadTermsForSet(int localStudySetId);

    @Insert
    void insertAll(Term... terms);

    @Delete
    void delete(Term term);
}

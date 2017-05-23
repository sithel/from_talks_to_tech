package studioes.arm.six.fromtalkstotech.lifecycle;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import studioes.arm.six.fromtalkstotech.database.AppDatabase;
import studioes.arm.six.fromtalkstotech.database.entities.StudySet;

/**
 * Created by sithel on 5/21/17.
 */

public class StartViewModel extends ViewModel {
    private LiveData<List<StudySet>> sets;

    public LiveData<List<StudySet>> getCurrentSets(AppDatabase db) {
        if (sets == null) {
            sets = db.studySetDao().getAll();
        }
        return sets;
    }
}

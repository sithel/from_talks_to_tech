package studioes.arm.six.fromtalkstotech.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import studioes.arm.six.fromtalkstotech.database.daos.StudySetDao;
import studioes.arm.six.fromtalkstotech.database.daos.TermDao;
import studioes.arm.six.fromtalkstotech.database.daos.UserDao;
import studioes.arm.six.fromtalkstotech.database.entities.StudySet;
import studioes.arm.six.fromtalkstotech.database.entities.Term;
import studioes.arm.six.fromtalkstotech.database.entities.User;

/**
 * Created by sithel on 5/21/17.
 */
@Database(entities = {StudySet.class, Term.class, User.class}, version = 1)
public abstract class AppDatabase  extends RoomDatabase {
    public abstract StudySetDao studySetDao();
    public abstract TermDao termDao();
    public abstract UserDao userDao();
}

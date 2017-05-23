package studioes.arm.six.fromtalkstotech.database.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import studioes.arm.six.fromtalkstotech.database.entities.User;

/**
 * Created by sithel on 5/21/17.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE username =  :username LIMIT 1")
    User loadSpecificUser(String username);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}

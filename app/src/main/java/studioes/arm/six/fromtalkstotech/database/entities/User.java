package studioes.arm.six.fromtalkstotech.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by sithel on 5/21/17.
 */
@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "server_id")
    public long serverId;

    @ColumnInfo(name = "username")
    public String username;

    @ColumnInfo(name = "account_type")
    public String accountType;

    @ColumnInfo(name = "profile_image_url")
    public String profileImageUrl;
}

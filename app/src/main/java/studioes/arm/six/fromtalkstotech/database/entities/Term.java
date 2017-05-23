package studioes.arm.six.fromtalkstotech.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by sithel on 5/21/17.
 */
@Entity
public class Term {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "server_id")
    public long serverId;

    @ColumnInfo(name = "local_study_set_id")
    public long localStudySetId;

    @ColumnInfo(name = "word")
    public long word;

    @ColumnInfo(name = "definition")
    public long definition;

    @ColumnInfo(name = "rank")
    public long rank;
}

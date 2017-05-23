package studioes.arm.six.fromtalkstotech.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by sithel on 5/21/17.
 */
@Entity
public class StudySet {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "server_id")
    public long serverId;

    @ColumnInfo(name = "url")
    public String url;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "word_lang_code")
    public String wordLangCode;

    @ColumnInfo(name = "def_lang_code")
    public String definitionLangCode;

    @ColumnInfo(name = "creator_username")
    public String creatorUsername;

    @ColumnInfo(name = "term_count")
    public int termCount;

    @ColumnInfo(name = "has_images")
    public boolean hasImages;
}

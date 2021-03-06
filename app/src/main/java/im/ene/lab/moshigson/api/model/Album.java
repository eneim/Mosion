
package im.ene.lab.moshigson.api.model;

import com.google.gson.annotations.Expose;
import com.squareup.moshi.JsonAdapter;

import im.ene.lab.moshigson.util.JsonUtil;

public class Album {

    public static JsonAdapter<Album> moshi = JsonUtil.getMoshi().adapter(Album.class);

    @Expose
    private int userId;
    @Expose
    private int id;
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}

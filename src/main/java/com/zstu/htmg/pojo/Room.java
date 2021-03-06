package com.zstu.htmg.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table room
 *
 * @mbg.generated do_not_delete_during_merge 2020-06-27 01:22:12
 */
public class Room implements Serializable {
    private Integer id;
    private String roomid;
    private String name;
    private Integer typeid;
    private Integer hotelid;
    private Integer story;
    private String tags;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public Integer getStory() {
        return story;
    }

    public void setStory(Integer story) {
        this.story = story;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomid='" + roomid + '\'' +
                ", name='" + name + '\'' +
                ", typeid=" + typeid +
                ", hotelid=" + hotelid +
                ", story=" + story +
                ", tags='" + tags + '\'' +
                '}';
    }
}
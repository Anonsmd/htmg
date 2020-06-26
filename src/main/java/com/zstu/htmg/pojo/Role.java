package com.zstu.htmg.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Role
 *
 * @mbg.generated do_not_delete_during_merge 2020-05-19 18:42:59
 */
public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.ID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.name
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.type
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Role.UserID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Role
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.ID
     *
     * @return the value of Role.ID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.ID
     *
     * @param id the value for Role.ID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.name
     *
     * @return the value of Role.name
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.name
     *
     * @param name the value for Role.name
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.type
     *
     * @return the value of Role.type
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.type
     *
     * @param type the value for Role.type
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Role.UserID
     *
     * @return the value of Role.UserID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Role.UserID
     *
     * @param userid the value for Role.UserID
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated 2020-05-19 18:42:59
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", userid=").append(userid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
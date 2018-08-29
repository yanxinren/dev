package com.ryx.model;

import java.util.Objects;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/18 001816:10
 */
public class User {
    private  Long id;
    private String username;
    private String note;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;

    }

    public String getUsername() {
        return username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(note, user.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, note);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

package com.ldq.hotch.entity;

/**
 * @author LinDingQiang
 * @time 2019/9/4 16:16
 * @email dingqiang.l@verifone.cn
 */
public class UserEntity {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String nickName;
    private String profilePhoto;
    private String description;

    public UserEntity() {
    }

    public UserEntity(String userName, String nickName, String password, String email, String photo, String description) {
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.profilePhoto = photo;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

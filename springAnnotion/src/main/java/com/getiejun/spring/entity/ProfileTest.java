package com.getiejun.spring.entity;

public class ProfileTest {

    private String profileName = "profile test";

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public String toString() {
        return "ProfileTest{" +
                "profileName='" + profileName + '\'' +
                '}';
    }
}

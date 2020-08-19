package com.getiejun.spring.entity;

public class ProfileDev {

    private String profileName = "profile dev";

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

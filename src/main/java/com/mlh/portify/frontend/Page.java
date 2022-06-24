package com.mlh.portify.frontend;

/**
 * Page class with all the info for a user.
 */
public class Page {
    private String name;
    private String email;
    private String linkedin;
    private String github;
    private String country;
    private String education;
    private String bio;
    private String skill;
    private String primaryColor;

    private String resume;
    private String secondaryColor;
    private String introduction;
    private String picture;

    public String getResume() {
        return this.resume;
    }

    public void setResume(final String resume) {
        this.resume = resume;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(final String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return this.linkedin;
    }

    public void setLinkedin(final String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return this.github;
    }

    public void setGithub(final String github) {
        this.github = github;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(final String education) {
        this.education = education;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(final String bio) {
        this.bio = bio;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(final String skill) {
        this.skill = skill;
    }

    public String getPrimaryColor() {
        return this.primaryColor;
    }

    public void setPrimaryColor(final String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return this.secondaryColor;
    }

    public void setSecondaryColor(final String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(final String introduction) {
        this.introduction = introduction;
    }
}

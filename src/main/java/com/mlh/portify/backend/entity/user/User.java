package com.mlh.portify.backend.entity.user;

import javax.persistence.*;
import java.util.Objects;

/**
 * Class for the user table.
 */
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @Column(
            name = "id",
            updatable = false
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /* The name is a unique value, can use it to identify a user */
    @Column(
            name = "name",
            nullable = false,
            unique = true,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "introduction",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String introduction;

    @Column(
            name = "bio",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String bio;

    @Column(
            name = "skill",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String skill;

    @Column(
            name = "profile_pic",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String profilePic;

    @Column(
            name = "linkedin",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String linkedin;

    @Column(
            name = "github",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String github;

    @Column(
            name = "cv",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String resume;

    protected User() {
    }

    public User(final String name, final String introduction, final String bio, final String skill, final String profilePic,
                final String linkedin, final String github, final String resume) {
        this.name = name;
        this.introduction = introduction;
        this.bio = bio;
        this.skill = skill;
        this.profilePic = profilePic;
        this.linkedin = linkedin;
        this.github = github;
        this.resume = resume;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(final String introduction) {
        this.introduction = introduction;
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

    public String getProfilePic() {
        return this.profilePic;
    }

    public void setProfilePic(final String profilePic) {
        this.profilePic = profilePic;
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

    public String getResume() {
        return this.resume;
    }

    public void setResume(final String resume) {
        this.resume = resume;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        final User user = (User) o;
        return Objects.equals(getUserId(), user.getUserId())
                && Objects.equals(getName(), user.getName())
                && Objects.equals(getIntroduction(), user.getIntroduction())
                && Objects.equals(getBio(), user.getBio())
                && Objects.equals(getSkill(), user.getSkill())
                && Objects.equals(getProfilePic(), user.getProfilePic())
                && Objects.equals(getLinkedin(), user.getLinkedin())
                && Objects.equals(getGithub(), user.getGithub())
                && Objects.equals(getResume(), user.getResume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getIntroduction(), getBio(), getSkill(),
                getProfilePic(), getLinkedin(), getGithub(), getResume());
    }

    @Override
    public String toString() {
        return "User{"
                + "userId=" + userId
                + ", name='" + name + '\''
                + ", education='" + introduction + '\''
                + ", bio='" + bio + '\''
                + ", skill='" + skill + '\''
                + ", profile_pic='" + profilePic + '\''
                + ", linkedin='" + linkedin + '\''
                + ", github='" + github + '\''
                + ", resume='" + resume + '\''
                + '}';
    }
}

package com.myriadsforjesus.web.app.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "myriads")
public class Myriad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long myriadId;
    @NotBlank
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @NotBlank
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @NotBlank
    @Column(unique = true,nullable = false)
    private String emailAddress;
    @NotBlank
    @Column(nullable = false)
    private String password;
    @OneToMany(mappedBy = "myriad")
    private List<Post> posts = new ArrayList<>();
    @OneToMany(mappedBy = "myriad")
    private List<PostComment> postComments = new ArrayList<>();
    @OneToMany(mappedBy = "myriad")
    private List<EventComment> eventComments = new ArrayList<>();
    @OneToMany(mappedBy = "myriad")
    private List<ChurchEvent> churchEvents = new ArrayList<>();

    public Myriad() {
    }

    public Myriad(@NotBlank String firstName, String middleName, @NotBlank String lastName, LocalDate dateOfBirth, @NotBlank String emailAddress, @NotBlank String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public Long getMyriadId() {
        return myriadId;
    }

    public void setMyriadId(Long myriadId) {
        this.myriadId = myriadId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComment> postComments) {
        this.postComments = postComments;
    }

    public List<EventComment> getEventComments() {
        return eventComments;
    }

    public void setEventComments(List<EventComment> eventComments) {
        this.eventComments = eventComments;
    }

    public List<ChurchEvent> getChurchEvents() {
        return churchEvents;
    }

    public void setChurchEvents(List<ChurchEvent> churchEvents) {
        this.churchEvents = churchEvents;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Myriad{" +
                "myriadId=" + myriadId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

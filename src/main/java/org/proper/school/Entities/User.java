package org.proper.school.Entities;

import java.time.LocalDate;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public  class User {

    private String Firstname;

    private String Lastname;

    private String stateOfOrigin;

    private String email;

    private Long phoneNumber;

    private String address;

    private LocalDate dateOfBirth;
    private String teacherid;


////    public User(String firstname, String lastname, String stateOfOrigin, String email, Long phoneNumber, String address, LocalDate dateOfBirth, String teacherid) {
////        Firstname = firstname;
////        Lastname = lastname;
////        this.stateOfOrigin = stateOfOrigin;
////        this.email = email;
////        this.phoneNumber = phoneNumber;
////        this.address = address;
////        this.dateOfBirth = dateOfBirth;
////        this.teacherid = teacherid;
////    }
//
//
//    public String getFirstname() {
//        return Firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        Firstname = firstname;
//    }
//
//    public String getLastname() {
//        return Lastname;
//    }
//
//    public void setLastname(String lastname) {
//        Lastname = lastname;
//    }
//
//    public String getTeacherid() {
//        return teacherid;
//    }
//
//    public void setTeacherid(String teacherid) {
//        this.teacherid = teacherid;
//    }
//
//    public String getStateOfOrigin() {
//        return stateOfOrigin;
//    }
//
//    public void setStateOfOrigin(String stateOfOrigin) {
//        this.stateOfOrigin = stateOfOrigin;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(Long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
    }




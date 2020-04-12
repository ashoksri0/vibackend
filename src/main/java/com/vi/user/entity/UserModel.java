package com.vi.user.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "emailAddress")
    private String emailAddress;
    @Column(name = "password")
    private String password;
    @Column(name = "confirmPassword")
    private String confirmPassword;

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(userId, userModel.userId) &&
                Objects.equals(firstName, userModel.firstName) &&
                Objects.equals(lastName, userModel.lastName) &&
                Objects.equals(emailAddress, userModel.emailAddress) &&
                Objects.equals(password, userModel.password) &&
                Objects.equals(confirmPassword, userModel.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, emailAddress, password, confirmPassword);
    }
}


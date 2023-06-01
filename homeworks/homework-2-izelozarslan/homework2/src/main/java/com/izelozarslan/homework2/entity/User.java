package com.izelozarslan.homework2.entity;

import com.izelozarslan.homework2.enums.EnumUserType;
import com.izelozarslan.homework2.general.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "User", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    private Long id;

    @NotBlank
    @Column(name = "FIRST_NAME", length = 100, nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "LAST_NAME", length = 100, nullable = false)
    private String lastName;

    @NotBlank
    @Column(name = "USERNAME", length = 50, nullable = false, unique = true)
    private String username;

    @NotBlank
    @Column(name = "PASSWORD", length = 400, nullable = false)
    private String password;

    @NotBlank
    @Email(message = "Email must be in valid format")
    @Column(name = "EMAIL", length = 50, nullable = false, unique = true)
    private String email;


    @NotBlank
    @Size(max = 12)
    @Column(name = "PHONE_NUMBER", length = 12)
    private String phoneNumber;

    @Column(name = "USER_TYPE", length = 30)
    @Enumerated(EnumType.STRING)
    private EnumUserType userType;


}

package com.contacts.contactsapi.domain;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "contacts")   
public class Contact {
    @Id
    @UuidGenerator
    @Column(name = "id", unique =true, updatable = false)
    private String id;
    private String name;
    private String email;
    private String title;
    private String address;
    private String phone;
    private String photoUrl;

    
}

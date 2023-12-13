package com.contacts.contactsapi.repo;

import org.springframework.stereotype.Repository;

import com.contacts.contactsapi.domain.Contact;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;;;

@Repository
public interface ContactRepo  extends JpaRepository<Contact, String> {
    

   
}

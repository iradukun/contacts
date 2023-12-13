package com.contacts.contactsapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.contacts.contactsapi.domain.Contact;
import com.contacts.contactsapi.repo.ContactRepo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(rollbackOn = Exception.class)
public class ContactService {
    private final ContactRepo contactRepo;
    
    public Page<Contact> getAllContacts(int page, int size){

        return contactRepo.findAll(PageRequest.of(page,size, Sort.by("name")));

        
    }
    public Contact getContact(String id){
        return contactRepo.findById(id).orElseThrow(()->new RuntimeException("Couldn't find contact"));
    }
    public Contact createContact(Contact contact){
        return contactRepo.save(contact);

    }

}

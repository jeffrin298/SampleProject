package Service;

//package com.RMP.resource_management.Service;

import Model.FormDetails;

import java.util.List;


public interface FormService {
    List<FormDetails> getAllFormDetails();

    void saveFormDetails(FormDetails formDetails);

    void deleteFormById(long id);

    FormDetails getFormDetailsById(Long id);
}

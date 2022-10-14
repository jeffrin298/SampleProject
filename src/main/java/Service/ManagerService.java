package Service;

//package com.RMP.resource_management.Service;

import Model.Manager;

import java.util.List;

public interface ManagerService {

    List<Manager> getAllManagerDetails();

    Manager getManagerDetails(Long id);

    void saveManager(Manager manager);

    void deleteManagerById(long id);
}

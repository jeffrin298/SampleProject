package Service;

//package com.RMP.resource_management.Service;

import Model.Share;
import java.util.List;

public interface ShareService {

    List<Share> getAllShareDetails();

    Share getShareDetails(Long id);

    void saveSharedDetails(Share share);

    void deleteShareById(long id);
}

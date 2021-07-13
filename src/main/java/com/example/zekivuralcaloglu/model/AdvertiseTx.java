package com.example.zekivuralcaloglu.model;

import lombok.Data;

import java.util.Date;

@Data
public class AdvertiseTx {

    private long advertiseTxId;
    private long advertiseId;
    private String advertiseTitle;
    private String advertiseDetail;
    private String advertiseCategory;
    private String advertiseStatus;
    private Date creationDate;
    private Long createdBy;
    private Date updatedDate;
    private Long updatedBy;

}

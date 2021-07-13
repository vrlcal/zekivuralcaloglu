package com.example.zekivuralcaloglu.model;

import lombok.Data;

import java.util.Date;

@Data
public class Advertise {

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

package com.adit.moviedb.model;

import java.io.Serializable;

/**
 * Created by Rizki juli aditia on 30-12-2022.
 */

public class ModelTrailer implements Serializable {

    private String key;
    private String type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
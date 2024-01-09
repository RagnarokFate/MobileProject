package com.myapp.Local;

import com.myapp.Entities.Fetch_Data_Cell_Entity;

public class FetchDataCellEntitySingleton {
    private static FetchDataCellEntitySingleton instance;
    private Fetch_Data_Cell_Entity fetchDataCellEntity;

    private FetchDataCellEntitySingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static FetchDataCellEntitySingleton getInstance() {
        if (instance == null) {
            // Create a new instance if it doesn't exist
            instance = new FetchDataCellEntitySingleton();
        }
        return instance;
    }

    public Fetch_Data_Cell_Entity getFetchDataCellEntity() {
        return fetchDataCellEntity;
    }

    public void setFetchDataCellEntity(Fetch_Data_Cell_Entity fetchDataCellEntity) {
        // Update the instance with the new FetchDataCellEntity values
        this.fetchDataCellEntity = fetchDataCellEntity;
    }
}

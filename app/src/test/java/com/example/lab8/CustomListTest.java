package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list = new CustomList(null, new ArrayList<>());
    /**
     * initialize the list
     */
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SM"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     *
     * check if the list has city
     */
    @Test
    public void hasCityTest(){
        City newCity = new City("Dubai", "DXB");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }


    /**
     * adds to list
     * deletes
     *
     */
    @Test
    public void deleteCityTest(){
        City newCity = new City("Chicago", "IL");
        list.addCity(newCity);
        list.deleteCity(newCity);
        assertFalse(list.hasCity(newCity));
    }








}

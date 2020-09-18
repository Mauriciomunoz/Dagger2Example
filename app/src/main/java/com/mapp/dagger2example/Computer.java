package com.mapp.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Computer {

    private PowerSupply psu;
    private Motherboard motherboard;

    //Add @Inject tag to notify the dagger component this will be the initialization for the Computer object
    //This instance needs to more objects to be created. We need to do the same injection in the classes.
    @Inject
    public Computer(PowerSupply psu, Motherboard motherboard){
        this.psu = psu;
        this.motherboard = motherboard;
    }

    public void turnOn(String str){
        Log.i("MESSAGE: ", str);
    }
}

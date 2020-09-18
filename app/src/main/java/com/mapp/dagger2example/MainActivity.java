package com.mapp.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Without Dependency Injection
        //A lot of objects need to be created to create a simple object
        MemoryRam ram = new MemoryRam();
        CentralProcessor cpu = new CentralProcessor();

        Motherboard myMotherboard = new Motherboard(ram, cpu);
        PowerSupply myPSU = new PowerSupply();

        Computer myPC = new Computer(myPSU, myMotherboard);
        myPC.turnOn("NORMAL PC");


        //With Dependency Injection. We need declare it in gradle to be able to use it
        //DaggerComputerComponent this object is created once you run the app.
        //Dagger is in charge of create and initialize objects to create the Computer object.
        ComputerComponent component = DaggerComputerComponent.create();
        Computer myPCDI = component.getComputer();
        myPCDI.turnOn("Dependency Injection PC");

    }

}
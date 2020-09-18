package com.mapp.dagger2example;

import dagger.Component;

//Add the @Component tag from dagger
@Component
public interface ComputerComponent {
    //A method returning what we need
    Computer getComputer();
}

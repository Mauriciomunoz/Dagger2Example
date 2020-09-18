package com.mapp.dagger2example;

import javax.inject.Inject;

class PowerSupply {
    //Add @Inject, in this way the object Computer can be created by the Dagger component
    @Inject
    public PowerSupply(){

    }

}

package com.mapp.dagger2example;

import javax.inject.Inject;

class Motherboard {
    private MemoryRam ram;
    private CentralProcessor cpu;

    //This object depends from other two. So we need to add the same tag in there.
    @Inject
    public Motherboard(MemoryRam ram, CentralProcessor cpu){
        this.ram = ram;
        this.cpu = cpu;
    }
}

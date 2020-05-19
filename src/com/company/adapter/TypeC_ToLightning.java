package com.company.adapter;

public class TypeC_ToLightning implements Type_C_Port{

    private final LightningPort lightningPort;

    public TypeC_ToLightning(LightningPort lightningPort){
        this.lightningPort = lightningPort;
    }

    @Override
    public void charge() {
        lightningPort.charge();
    }

    @Override
    public void useType_C() {
        lightningPort.useLightning();
    }
}

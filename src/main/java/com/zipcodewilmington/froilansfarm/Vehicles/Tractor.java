package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import com.zipcodewilmington.froilansfarm.Tomato;

import java.util.List;

public class Tractor implements Vehicle, FarmVehicle, Driveable,Rideable, NoiseMaker {

    public boolean isFarmVehicle() {
        return true;
    }

    public boolean operate() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }
    public Crops harvested(CropRow cropRow){
        return null;//croprow amount of crop  takes croprow.crop-harvest crop. crops return
    }

    public boolean makesNoise() {
        return true;
    }

    public List<Tomato> harvest(TomatoPlant tomatoPlant){
        Tomatoes harvestedtomatoes = new Tomatoes();
        return (List<Tomato>) harvestedtomatoes;
    }
}
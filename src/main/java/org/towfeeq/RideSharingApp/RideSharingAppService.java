package org.towfeeq.RideSharingApp;

import java.util.ArrayList;
import java.util.List;

public class RideSharingAppService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    // add drivers
    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    // add passenger
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
}

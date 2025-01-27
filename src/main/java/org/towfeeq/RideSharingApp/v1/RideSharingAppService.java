package org.towfeeq.RideSharingApp.v1;

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

    // booking ride
    public void bookRide(Passenger passenger, double distance){
        // corner case
        if(drivers.isEmpty()){
            System.out.println("No Drivers Available");
            return;
        }

        // hardcoded assignment logic to find nearest driver

        // for now, using O(N) Brute Force approach to find driver
        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;

        for(Driver driver : drivers){
            double currentDriverDistance = calcDistance()
        }

        // fare calculation
        // show driver and fare to passenger
    }
}

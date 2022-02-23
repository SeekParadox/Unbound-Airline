package org.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flight<T extends Airplane> implements Comparable<T> {
   protected int flightNum;
   protected T plane;
   protected List<Passenger> passengers = new ArrayList<>();
   protected double departureTime;
    public Flight(int flightNum, T plane) {
        this.flightNum = flightNum;
        this.plane = plane;
    }

    public Flight(int flightNum) {
        this.flightNum = flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setPlane(T plane) {
        if(!hasPlane())
        this.plane = plane;
    }

    public boolean hasPlane() {
        return !Objects.equals(plane,null);
    }

    public T getPlane() {
        return plane;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Flight flight)) return false;
        return this.plane == flight.plane && this.flightNum == flight.flightNum;
    }


    @Override
    public int compareTo(T o) {
        return 0; // FIXME: 2/23/2022
    }
}

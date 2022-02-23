package org.airline;

public class Passenger extends Person {
    int numCarryOn;
    int ticketNum;
    public Passenger(int age, String name, double height, double weight, int numCarryOn, int ticketNum) {
        super(age, name, height, weight);
        this.numCarryOn = numCarryOn;
        this.ticketNum = ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Passenger passenger)) return false;
      return ticketNum == passenger.ticketNum && numCarryOn == passenger.numCarryOn;
    }
}

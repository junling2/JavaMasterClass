package com.example.mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    private boolean checkValidSeat(String seatNum) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNum)) {
                return true;
            }
        }
        System.out.println("Seat " + seatNum + " is not a valid seat");
        return false;
    }

    private int findSeat(String seatNum) {
        Seat requestedSeat = new Seat(seatNum);
        int foundSeat = Collections.binarySearch(seats, requestedSeat);
        return foundSeat >= 0 ? foundSeat : -1;
    }

    // If adding additional methods that require operation on a returned Seat object, can add findSeat()
    public boolean reserveSeat(String seatNum) {
        if (checkValidSeat(seatNum)) {
            Seat seat = seats.get(findSeat(seatNum));
            return seat.reserve();
        }
        return false;
    }

    // Inner Seat Class
    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " successfully reserved");
                return true;
            }
            else {
                System.out.println("Seat " + seatNumber + " already reserved");
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}

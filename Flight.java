package com.company;

 class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeat;


    Flight(String _flightNumber,String _airline,int _capacity, int _bookedSeat){
        flightNumber =_flightNumber;
        airline = _airline;
        capacity = _capacity;
        bookedSeat = _bookedSeat;

    }
     String getFlightDetails() {
         String flightNumber = this.flightNumber;
         return flightNumber;
     }


     private boolean checkAvailability(){
        int bookedSeat = this.bookedSeat;
        boolean b = bookedSeat>=0;
        return true;
    }
    private int incrementBookingCounter(){
        return 0;
    }
}

package com.company;

class TouristTicket extends Ticket {
    String hotelAddress;
    String selectedTouristLocation[]={"0","5"};

    TouristTicket(String _pnr, String _from, String _to, String _departureDateTime, String _arrivalDateTime,
                 String _passengerId, String _seatNo, boolean _cancelled) {
        super(_pnr,_from, _to,_departureDateTime, _arrivalDateTime, _passengerId,_seatNo,_cancelled);

    }

    String getHotelAddress(){
        return hotelAddress;
    }
    String removeTouristLocation(){
        String location = "";
        return location;
    }
    void addTouristLocation(){
        String location = "";
        return;
    }
}

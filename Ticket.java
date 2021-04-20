package com.company;

public class Ticket {

    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;

    String passengerId;
    String seatNo;
    float price;
    boolean cancelled;

    Ticket(String _pnr, String _from, String _to, String _departureDateTime, String _arrivalDateTime,
           String _passengerId, String _seatNo, boolean _cancelled) {
        pnr = _pnr;
        from = _from;
        to = _to;
        departureDateTime = _departureDateTime;
        arrivalDateTime = _arrivalDateTime;
        passengerId = _passengerId;
        seatNo = _seatNo;
        cancelled = _cancelled;
    }



    String checkStatus() {
        return "Booked";
    }

    int getFlightDuration() {
        int i = 3;
        return i;
    }

    public void cancel() {
        return;
    }
}
package com.company;

 class RegularTicket extends Ticket {
    private String specialServices;

     RegularTicket(String _pnr, String _from, String _to, String _departureDateTime, String _arrivalDateTime, String _passengerId, String _seatNo, boolean _cancelled) {
         super(_pnr, _from, _to, _departureDateTime, _arrivalDateTime, _passengerId, _seatNo, _cancelled);
     }

     public String getSpecialServices(){
        return  specialServices;
    }
    private void setSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
    private void updateSpecialServices(){
        String specialServices1 = this.specialServices;
    }
}

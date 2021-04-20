package com.company;

class Passenger {
    private static class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        Address address;
        Contact contact;

        int id;

         private void Passenger(int _id, Address address, Contact contact) {
            id = _id;
            this.address = address;
             this.contact = contact;
        }



        public Address getAddressDetails() {
            return address;
        }

        private Contact getContactDetails() {
            return contact;
        }
        private int getPassengerCount(){return id;}
    }
}



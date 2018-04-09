package com.example.tushar.myapplication;

public class Position {



        String Lat;
        String Long;


        public String getLat() {
            return Lat;
        }

        public void setLat(String lat) {
            Lat = lat;
        }

        public String getLong() {
            return Long;
        }

        public void setLong(String aLong) {
            Long = aLong;
        }

        public String getPlace() {
            return Place;
        }

        public void setPlace(String place) {
            Place = place;
        }

        String Place;

        public Position()
        {

        }
        public Position(String Lat,String Long,String Place)
        {
            this.Lat=Lat;
            this.Long=Long;
            this.Place=Place;
        }


} 
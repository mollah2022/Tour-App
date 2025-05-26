package com.example.tourapp.Domain;

public class Location {

    private int Id;
    private String Loc;

    // ✅ No-arg constructor for Firebase
    public Location() {
    }

    // Optional: constructor with values
    public Location(int id, String loc) {
        this.Id = id;
        this.Loc = loc;
    }

    @Override
    public String toString() {
        return Loc; // Shows location name in Spinner
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }
}

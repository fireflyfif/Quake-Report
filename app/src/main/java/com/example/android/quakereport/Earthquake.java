package com.example.android.quakereport;

/**
 * Created by iva on 5/17/17.
 */

public class Earthquake {

    /**
     * Measure of the size of the earthquake
     */
    private double mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Create a new Earthquake object.
     *
     * @param magnitude is the measure of the size of the earthquake
     * @param location is the place where the earthquake occurred
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the size of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date of the earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the url of the earthquake
     */
    public String getUrl() {
        return mUrl;
    }
}

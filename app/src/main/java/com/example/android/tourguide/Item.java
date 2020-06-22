package com.example.android.tourguide;

/**
 * {@link Item} represents an element that the user wants to visit.
 * It contains a name and an address.
 */
public class Item {

    /**
     * Name of the item
     */
    private String mName;

    /**
     * Location of the item
     */
    private String mLocation;

    /**
     * Image resource id
     */
    private int mResourceImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new item object.
     *
     * @param name     is the name of the item.
     * @param location is the location of the item.
     */
    public Item(String name, String location) {
        mName = name;
        mLocation = location;
    }

    /**
     * Create a new item object with image.
     *
     * @param name            is the name of the item.
     * @param location        is the location of the item.
     * @param resourceImageId is the id of the image.
     */
    public Item(String name, String location, int resourceImageId) {
        mName = name;
        mLocation = location;
        mResourceImageId = resourceImageId;
    }

    /**
     * Get the name of the item.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the location of the item.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the resource image id of the item.
     */
    public int getImageResourceId() {
        return mResourceImageId;
    }

    /**
     * Return if there is a valid image associated with a item or not.
     */
    public boolean hasImage() {
        return mResourceImageId != NO_IMAGE_PROVIDED;
    }

}

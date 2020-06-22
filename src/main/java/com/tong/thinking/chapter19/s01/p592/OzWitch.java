package com.tong.thinking.chapter19.s01.p592;


public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby"),
    SOUTH("Good by inference, but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public static void main(String[] args) {
        for (OzWitch o : OzWitch.values()) {
            System.out.println(o + ": " + o.getDescription());
        }
    }
}

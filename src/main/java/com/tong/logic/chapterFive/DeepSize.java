package com.tong.logic.chapterFive;

public enum DeepSize {
    SMALL("S","小號"),
    MEDIUM("M","中號"),
    LARGE("L","大號");

    private String abbr;
    private String title;

    private DeepSize(String abbr,String title){
        this.abbr = abbr;
        this.title = title;
    }

    public String getAbbr(){
        return abbr;
    }

    public String getTitle(){
        return title;
    }

    public static DeepSize fromAbbr(String abbr){
        for(DeepSize size:DeepSize.values()){
            if(size.getAbbr().equals(abbr)){
                return size;
            }
        }
        return null;
    }
}

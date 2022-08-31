package com.example.indianredcrossscoiety;



import java.util.ArrayList;

public class data {
    private String mid;
    private String mContent;
    private String mDetails;

    public void data(String id,String content){
        mid=id;
        mContent=content;



    }



        public static class PlaceholderItem {
        public final String id;
        public final String content;


        public PlaceholderItem(String id, String content) {
            this.id = id;
            this.content = content;

        }

        @Override
        public String toString() {
            return content;
        }
    }






}

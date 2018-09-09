package com.parse.starter;


/**
 * Created by Pedro on 16/05/2017.
 */

public class Common {



    //parse config back4app
    public static final String App_Id = "-";
    public static final String Client_Key = "-";
    public static final String Parse_API_Address = "-";


    public static boolean isNullOrEmptyString(String content) {
        return (!(content != null && !content.trim().isEmpty()));
    }


}

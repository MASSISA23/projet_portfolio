package com.rhsaas.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return dateFormat.format(date);
    }

}

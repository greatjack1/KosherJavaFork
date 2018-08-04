package net.sourceforge.zmanim.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * This utility class is used to convert between Date and LocalDateTime types
 *
 * This is used to maintain accuracy of the zmanim calculations, while still being able to use the new java.time types
 */
public class DateConverter {
    public static Date localDateTimeToDate(LocalDateTime date){
        Date converted = java.util.Date
                .from(date.atZone(ZoneId.systemDefault())
                        .toInstant());
        return converted;
    }
    public static LocalDateTime dateToLocalDateTime(Date date){
       return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

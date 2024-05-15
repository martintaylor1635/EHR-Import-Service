package dev.martintaylor.ehrimportservice.utility;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtility {
    private static final String ZONE_ID = "Europe/London";
    private DateUtility() { }

    public static String getZonedIsoOffsetDateTime() {
        return ZonedDateTime.now(ZoneId.of(ZONE_ID))
            .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
/*
 * **
 *  * 4/17/20, 1:45 PM
 *  * @author Tofan S.
 *
 */

package com.company.delivery.utils;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Slf4j
public final class Datetimes {

  private static final String ZONE_ID = "Asia/Jakarta";

  private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

  public static Date getInstantDate() {
    ZonedDateTime datetime = Instant.now().atZone(ZoneId.of(ZONE_ID));
    return Date.from(Instant.from(datetime));
  }

  public static Date fromString(String strDate) {
    Date date;
    try {
      date = new SimpleDateFormat("yyyyMMdd").parse(strDate);
    } catch (ParseException e) {
      e.printStackTrace();
      date = null;
    }
    return date;
  }

  public static Date stringToDate(String strDate, String dateformat) {
    Date date = null;
    try {
      if (strDate != null) {
        if (!strDate.equals("")) {
          date = new SimpleDateFormat(dateformat).parse(strDate);
        }
      } else {
        date = null;
      }
    } catch (ParseException e) {
      log.info("PARSE EXECPTION {}", strDate + " | " + e.getMessage());
    }
    return date;
  }

  public static String toString(Date date) {
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
    return dateformat.format(date);
  }

  public static String toString(LocalDate localDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    return formatter.format(localDate);
  }

  public static String toStringDatetime(Date date) {
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    return dateformat.format(date);
  }

  public static String toStringAllDatetime(Date date) {
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    return dateformat.format(date);
  }

  public static String toStringIgateFormat(Date date) {
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd");
    return dateformat.format(date);
  }

  public static String toStringDashFormat(Date date) {
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    return dateformat.format(date);
  }

  public static String changeFormat(String date) {
    final String OLD_FORMAT = "yyyyMMdd";
    final String NEW_FORMAT = "dd-MM-yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
    Date d = null;
    try {
      d = sdf.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    sdf.applyPattern(NEW_FORMAT);
    return sdf.format(d);
  }

  public static Date addMonth(long month) {
    LocalTime localTime = LocalTime.MIDNIGHT;
    LocalDate date = LocalDate.now(ZoneId.of(ZONE_ID));
    LocalDateTime dateTimeMidnight = LocalDateTime.of(date, localTime);
    return Timestamp.valueOf(dateTimeMidnight.plusMonths(month));
  }

  public static Integer getDifferenceDate(Date date) {
    Date currentDate = Datetimes.getInstantDate();
    long diff = currentDate.getTime() - date.getTime();
    return (int) (diff / (24 * 60 * 60 * 1000));
  }

  public static LocalDate toLocalDate(String localDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    return LocalDate.parse(localDate, formatter);
  }
}

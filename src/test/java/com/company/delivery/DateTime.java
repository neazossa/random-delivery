package com.company.delivery;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

  public static void main(String[] args) {



    LocalDateTime ldt = LocalDateTime.now();
    System.out.println("LocalDateTime : " + format.format(ldt));

    //UTC+8
    ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Jakarta"));
    System.out.println("Time now : " + format.format(klDateTime));

  }

}

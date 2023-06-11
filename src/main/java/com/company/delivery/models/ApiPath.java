package com.company.delivery.models;

public class ApiPath {

  private static final String BASEPATH = "/api";
  private static final String VERSION = "/v1";

  public static final String ADD = "/add";
  public static final String RECEIVE = "/receive";

  //Warehouse
  public static final String ITEM = BASEPATH + VERSION + "/item";
  public static final String MERCHANT = BASEPATH + VERSION + "/merchant";
  public static final String DELIVERY = BASEPATH + VERSION + "/delivery";
  public static final String WAREHOUSE = BASEPATH + VERSION + "/warehouse";
}

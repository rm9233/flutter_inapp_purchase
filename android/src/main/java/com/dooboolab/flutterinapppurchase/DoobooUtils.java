package com.dooboolab.flutterinapppurchase;

import android.util.Log;


public class DoobooUtils {
  private static final String TAG = "DoobooUtils";
  public static final String E_UNKNOWN = "E_UNKNOWN";
  public static final String E_NOT_PREPARED = "E_NOT_PREPARED";
  public static final String E_NOT_ENDED = "E_NOT_ENDED";
  public static final String E_USER_CANCELLED = "E_USER_CANCELLED";
  public static final String E_ITEM_UNAVAILABLE = "E_ITEM_UNAVAILABLE";
  public static final String E_NETWORK_ERROR = "E_NETWORK_ERROR";
  public static final String E_SERVICE_ERROR = "E_SERVICE_ERROR";
  public static final String E_ALREADY_OWNED = "E_ALREADY_OWNED";
  public static final String E_REMOTE_ERROR = "E_REMOTE_ERROR";
  public static final String E_USER_ERROR = "E_USER_ERROR";
  public static final String E_DEVELOPER_ERROR = "E_DEVELOPER_ERROR";
  public static final String E_BILLING_RESPONSE_JSON_PARSE_ERROR = "E_BILLING_RESPONSE_JSON_PARSE_ERROR";

  private static DoobooUtils instance = new DoobooUtils();

  public static DoobooUtils getInstance() {
    return instance;
  }

  public String[] getBillingResponseData(final int responseCode) {
    String[] errorData = new String[2];
    return errorData;
  }
}

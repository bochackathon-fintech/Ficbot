package com.example.vmac.WatBot.BocAPI;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankOfCyprus {

    private static String subscription_id="b7ee18e46e9146889115f38a4430fb7c";
    private static String id = "bda8eb884efcef7082792d45";

    private String name = "ΤΡΑΠΕΖΑ ΚΥΠΡΟΥ (001)";

    private String bankId = "bda8eb884efcef7082792d45";
    private String AccountId = "bda8eb884efcea209b2a6240";
    private String AccountToId = "bda8eb884efcea209b2a6287";
    private String AccountToBankId = "bda8eb884efcef7082792d45";
    private static String base = "http://api.bocapi.net";

    public static HttpClient getAccounts(){
        String endpoint = base + "/v1/api/banks/" + id + "/accounts";

        return HttpClient.get(endpoint);
    }

//    public static HttpClient transferMoneyToSavings(){
//        BankOfCyprus that = new BankOfCyprus();
//
//        String endpoint = "http://api.bocapi.net/v1/api/banks/" + id + "/accounts/" + that.AccountId + "/make-transaction";
//
//        Map<String,String> params = new HashMap<>();
//        params.put("Content-Type", "application/json");
//        params.put("Track-ID", "bedad676-ab4d-5671-34bd-79c7b0c8443e");
//
//        return HttpClient.post(endpoint, params);
//    }
//
//    public static HttpClient transferMoneyToCurrent(){
//        BankOfCyprus that = new BankOfCyprus();
//
//        String endpoint = "http://api.bocapi.net/v1/api/banks/" + id + "/accounts/" + that.AccountId + "/make-transaction";
//
//        Map<String,String> params = new HashMap<>();
//        params.put("Content-Type", "application/json");
//        params.put("Track-ID", "bedad676-ab4d-5671-34bd-79c7b0c8443e");
//
//        return HttpClient.post(endpoint, params);
//    }

}





















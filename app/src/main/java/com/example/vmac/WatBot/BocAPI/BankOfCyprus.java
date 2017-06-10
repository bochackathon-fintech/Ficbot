package com.example.vmac.WatBot.BocAPI;

import android.util.Log;

public class BankOfCyprus {

    private static String id = "bda8eb884efcef7082792d45";

    private String name = "ΤΡΑΠΕΖΑ ΚΥΠΡΟΥ (001)";

    public static HttpClient getAccounts(){
        String endpoint = "http://api.bocapi.net/v1/api/banks/" + id + "/accounts";

        return HttpClient.get(endpoint);
    }

}

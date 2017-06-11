package com.example.vmac.WatBot.BocAPI;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.vmac.WatBot.Data.Bank;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankOfCyprus {

    private static String subscription_id="b7ee18e46e9146889115f38a4430fb7c";
    private static String id = "bda8eb884efcef7082792d45";

    private String name = "ΤΡΑΠΕΖΑ ΚΥΠΡΟΥ (001)";

    private String bankId = "bda8eb884efcef7082792d45";
    private static String AccountId = "bda8eb884efcea209b2a6240";
    private String AccountToId = "bda8eb884efcea209b2a6287";
    private String AccountToBankId = "bda8eb884efcef7082792d45";
    private static String base = "http://api.bocapi.net";

    private static String output = null;

    public static HttpClient getAccounts(){

//        String endpoint = base + "/v1/api/banks/" + id + "/accounts";
//
//        return HttpClient.get(endpoint);
        return new HttpClient();
    }

    public static void transferMoneyToSavings(Context context, Integer amount, final JSONObject jsonObject){







//        String endpoint = "http://api.bocapi.net/v1/api/banks/" + id + "/accounts/" + BankOfCyprus.AccountId + "/make-transaction";
//
//        JsonObjectRequest jsObjRequest = new JsonObjectRequest
//                (Request.Method.POST, endpoint, jsonObject, new Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        BankOfCyprus.output = response.toString();
//                    }
//                }, new Response.ErrorListener() {
//
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.e("Error", "Error while making a post request.");
//                    }
//                }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                return (Map<String, String>) jsonObject;
//            }
//        };
//
//        // Access the RequestQueue through your singleton class.
//        HttpQueue.getInstance(context).addToRequestQueue(jsObjRequest);
    }
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





















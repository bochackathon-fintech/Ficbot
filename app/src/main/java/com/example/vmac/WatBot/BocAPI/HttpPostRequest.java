package com.example.vmac.WatBot.BocAPI;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class HttpPostRequest {

    private static String output = null;

    public void post(String endpoint, Context context, JSONObject jsonObject){
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
            (Request.Method.POST, endpoint, jsonObject, new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {
                    HttpPostRequest.output = response.toString();
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("Error", "Error while making a post request.");
                }
            });

        // Access the RequestQueue through your singleton class.
        HttpQueue.getInstance(context).addToRequestQueue(jsObjRequest);
    }
}

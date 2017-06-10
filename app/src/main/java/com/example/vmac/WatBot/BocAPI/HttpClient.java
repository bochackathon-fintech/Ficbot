package com.example.vmac.WatBot.BocAPI;

import android.content.Context;

public class HttpClient {

    public String output = null;

    public static HttpClient get(String link){

        final HttpClient that = new HttpClient();

        HttpGetRequest get = (HttpGetRequest) new HttpGetRequest(new HttpGetRequest.AsyncResponse(){

            @Override
            public void processFinish(String output){
                that.output = output;
            }
        }).execute(link);

        return that;
    }

    public String getOutput(){

        return output;
    }
}

package com.pfs;

import com.square.okhttp3

public class Inquirer 
{
    public int code = 0;
    public static String ask(String url) throws IOException
    {
        Request req = new Request.Builder().url(url).build();
        
        try (Response response = client.newCall(request).execute()) {
          code = response.code();
          return response.body().string();
        }
    }
}

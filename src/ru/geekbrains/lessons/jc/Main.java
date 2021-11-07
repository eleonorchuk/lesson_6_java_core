package ru.geekbrains.lessons.jc;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        /*
        DESCRIPTION
        GETCity Search
        http://dataservice.accuweather.com/locations/v1/cities/search

        Returns information for an array of cities that match the search text.
         */
        // Экземпляр класса OkHttpClient выполняет всю работу по созданию и отправке запросов
        //"Key":"295212" - SPB location Key
        //
        OkHttpClient client = new OkHttpClient();

        // Экземпляр класса Request создается через Builder (см. паттерн проектирования "Строитель")
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=pjllXlSxW8ER3AM9vGq31S3DfGCblEkN")
                .build();
        // Получение объекта ответа от сервера
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        // Тело сообщения возвращается методом body объекта Response
        String body = response.body().string();
        System.out.println(body);


        //System.out.println(response.headers());
        //System.out.println(response.isRedirect());
        //System.out.println(response.isSuccessful());
        //System.out.println(response.protocol());
        //System.out.println(response.receivedResponseAtMillis());
        //System.out.println(response.);
    }
}

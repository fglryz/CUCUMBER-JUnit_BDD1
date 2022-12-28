package com.automation.utilities;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APIUtils {
    public static Response response;

    public static RequestSpecification specification = new RequestSpecBuilder().
            addCookie(new Cookie.Builder("PHPSESSID", ConfigurationReader.getProperty("cookie")).build()).
            setBaseUri(ConfigurationReader.getProperty("baseURI")).setRelaxedHTTPSValidation().build();

    //Cookie ekleme
    public static void addCookie(String key, String value){
        specification.cookie(key, value);
    }

    //Cookie'ler ekleme
    public static void addCookies(Map<String, String> map){
        specification.cookies(map);
    }

    // Status code doğrulaması yapar
    public static void verifyStatusCode(int statusCode){
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    // Bağlantı için kabul edilen content-type ifadesini ekler
    public static void addContentType(String contentType){
        specification.contentType(contentType);
    }

    // Bağlantıya query param ekler
    public static void addQueryParam(String key, String value){
        specification.queryParam(key, value);
    }

    // Bağlantıya query params ekler
    public static void addQueryParams(Map<String, String> params){
        specification.queryParams(params);
    }

    // Bağlantıya form param ekler
    public static void addFormParam(String key, String value){
        specification.formParam(key, value);
    }

    // Bağlantıya form params ekler
    public static void addFormParams(Map<String, String> params){
        specification.formParams(params);
    }

    // Bağlantıya body ekler
    public static void addBody(String s){
        specification.body(s);
    }

    // Kullanıcı istediği endpoint'e post tipinde ve daları form params içerisinde göndererek bağlanabilecek
    public static void connectWithPostMethodFormParams(String endPoint, Map<String,String> data){
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                formParams(data).
                post(endPoint);

    }

    // Kullanıcı istediği endpoint'e post tipinde ve daları body bölümünde göndererek bağlanabilecek
    public static void connectWithPostMethodBody(String endPoint, Map<String,String> data){

        JSONObject object = new JSONObject();
        for(String s : data.keySet()){
            object.put(s, data.get(s));
        }

        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                body(data.toString()).
                post(endPoint);
    }

    // Kullanıcı istediği endpoint'e post tipinde bağlanabilecek
    public static void connectWithPostMethod(String endPoint){
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                post(endPoint);

        response.prettyPrint();
    }

    // Kullanıcı istediği endpoint'e get tipinde bağlanabilecek
    public static void connectWithGetMethod(String endPoint){
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                get(endPoint);
    }

    // Kullanıcı istediği endpoint'e delete tipinde bağlanabilecek
    public static void connectWithDeleteMethod(String endPoint){
        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                delete(endPoint);
    }

    // Kullanıcı istediği endpoint'e delete tipinde bağlanabilecek
    public static void connectWithDeleteMethod(String endPoint, Map<String, String> queryMap){
        response = given().
                queryParams(queryMap).
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                delete(endPoint);
    }

    // Kullanıcı istediği endpoint'e get tipinde query verilerini göndererek bağlanabilecek
    public static void connectWithGetMethodQuery(String endPoint, Map<String, String> queryMap){
        response = given().
                queryParams(queryMap).
                contentType(ContentType.URLENC.withCharset("UTF-8")).
                spec(specification).
                get(endPoint);
    }

    // Gelen response içerisindeki array'e ait verilerin sahip olduğu field'ları kntrol eder
    public static void checkFieldsInArray(List<String> fields){

        List<LinkedHashMap> list = APIUtils.response.jsonPath().get("$");

        for(LinkedHashMap o : list){

            for(String field : fields){
                Assert.assertTrue( o.get(field) != null );
            }
        }
    }

    // Gelen response içerisindeki objelerin field'ları kntrol eder
    public static void checkFieldsInObject(List<String> fields){
        for (String field : fields) {
            Assert.assertTrue(APIUtils.response.jsonPath().get(field) != null);
        }
    }
}

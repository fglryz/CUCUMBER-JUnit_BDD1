package automation.step_definitions.APIStepDef;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

public class SpartansJsonToCollection {

    @BeforeClass
    public void setUpClass(){
        baseURI="http://54.91.11.180:8000";
    }
    @Test
    public void test1(){
        
       Response response= given().accept(ContentType.JSON)
                .pathParam("id",11)
                .and().when().get("api//spartans/{id}");

      Map<String,Object>spartanMap=response.as(Map.class);
        System.out.println(spartanMap.get("name"));
        System.out.println( spartanMap.get("id"));
    }

}

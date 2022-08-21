package com.in28minutes.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

    @Test
    void jsonAssert_strictTrue() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\": \"Ball\",\"price\":10,\"quantity\":100}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }

    @Test
    void jsonAssert_strictFalse() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\": \"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

    @Test
    void jsonAssert_WithoutEscapeCharacters() throws JSONException {
        String expectedResponse = "{id:1,name:Ball,price:10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

}

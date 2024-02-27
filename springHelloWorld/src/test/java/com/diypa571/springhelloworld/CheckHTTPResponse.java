package com.diypa571.springhelloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldPassIfStringMatches() {
        // Assuming your controller is mapped to the root ("/")
        String url = "http://localhost:" + port + "/";
        assertEquals("Text from Spring boot", testRestTemplate.getForObject(url, String.class));
    }
}

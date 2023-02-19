package org.mydotey.galaxy.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mydotey.galaxy.rest.controller.IndexController;
import org.mydotey.galaxy.vo.ViewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {
    
    @Value(value="${local.server.port}")
    private int port;

    @Autowired(required = false)
    private IndexController controller;
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws Exception {
        Assert.assertNotNull(controller);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        ViewResponse<String> response = this.restTemplate.getForObject("http://localhost:" + port + "/api/home/hello?name={name}",
            ViewResponse.class, "boy");
        Assert.assertEquals(0, response.getErrorCode());
        Assert.assertEquals("Hello, boy!", response.getData());
    }

}

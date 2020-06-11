package com.dbs.stockfeeds.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class StockControllerTest extends AbstractTest {

    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testForUpdatesForAllStock() throws Exception {
        String uri = "/api/v1/stock/allupdates";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentType();
        assertEquals(content, "application/json");
    }

    @Test
    public void testForStockUpdatesBySymbol() throws Exception {
        String uri = "/api/v1/stock/U11:SGX";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentType();
        assertEquals(content, "application/json");
    }
}
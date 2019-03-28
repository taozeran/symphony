package org.b3log.symphony.service;

import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchQueryServiceTest {

    @Test
    public void searchElasticsearch() {
        SearchQueryService searchQueryService = new SearchQueryService();
        JSONObject jsonObject = searchQueryService.searchElasticsearch("article", "niha", 1, 30);
        System.out.println(jsonObject);
    }
}
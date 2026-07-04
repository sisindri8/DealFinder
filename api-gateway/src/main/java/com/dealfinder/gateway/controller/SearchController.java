package com.dealfinder.gateway.controller;

import com.dealfinder.gateway.dto.SearchRequest;
import com.dealfinder.gateway.dto.SearchResponse;
import com.dealfinder.gateway.service.PipelineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/search")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SearchController {

    private final PipelineService pipelineService;

    @PostMapping
    public SearchResponse search(@RequestBody SearchRequest request) {
        return pipelineService.search(request.query());
    }
}

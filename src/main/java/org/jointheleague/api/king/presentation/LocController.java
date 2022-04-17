package org.jointheleague.api.king.presentation;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.api.king.repository.dto.Result;
import org.jointheleague.api.king.service.LocService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocController {

    private final LocService locService;

    public LocController(LocService locService) {
        this.locService = locService;
    }

    @GetMapping("/searchLocResults")
    @ApiOperation(value = "Searches for articles matching the search term",
            notes = "Response may include multiple Result values.",
            response = Result.class,
            responseContainer="List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found"),
            @ApiResponse(code = 404, message = "Result(s) not found")
    })
    public String getResults(@RequestParam(value="q") String query){
        return "Searching for books related to " + query;
    }

}
package sg.edu.nus.iss.app.ssfworkshop16.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import sg.edu.nus.iss.app.ssfworkshop16.models.Mastermind;

@RestController
@RequestMapping(path = "/api/boardgame", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardGameController {

    @PostMapping
    public ResponseEntity<String> createBoardGame(@RequestBody Mastermind mm) {

        JsonObjectBuilder builder = Json.createObjectBuilder();
        // returning "mastermind" : {...}
        builder.add("mastermind", mm.toJson()); // must use JSON object or will crash
        JsonObject result = builder.build();
        return ResponseEntity
                .status(HttpStatus.CREATED) // overriding status from 200 to 201
                .contentType(MediaType.APPLICATION_JSON)
                .body(result.toString());
    }
}

package src.main.java.sg.edu.nus.iss.app.ssfworkshop16.controllers;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.app.ssfworkshop16.models.Mastermind;

@RestController
@RequestMapping(path = "/api/boardgame", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardGameController {

    @PostMapping
    public ResponseEntity<Mastermind> createBoardGame(@RequestBody Mastermind mm) {
        ResponseEntity.status(HttpStatus.CREATED);
        return ResponseEntity.ok(mm);
    }
}

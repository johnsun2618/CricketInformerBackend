package com.cricket.apis.Controller;

import com.cricket.apis.Entity.Match;
import com.cricket.apis.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/match")
public class MatchController {


    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    //Get live matches
    @GetMapping(path = "/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    //get all matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

//    get point table
    @GetMapping(path = "/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }

}

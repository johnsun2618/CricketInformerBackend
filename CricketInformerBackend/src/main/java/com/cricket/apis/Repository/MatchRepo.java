package com.cricket.apis.Repository;

import com.cricket.apis.Entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    //I want to fetch match by providing teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}

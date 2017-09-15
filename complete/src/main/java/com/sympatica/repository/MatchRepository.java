package com.sympatica.repository;

import com.sympatica.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NguyenTrung on 15/9/17.
 */

public interface MatchRepository extends CrudRepository<Match, Long> {
    List<Match> findById(Long id);
}

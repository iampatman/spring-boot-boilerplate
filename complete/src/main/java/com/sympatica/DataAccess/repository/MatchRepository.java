package com.sympatica.DataAccess.repository;

import com.sympatica.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by NguyenTrung on 15/9/17.
 */

public interface MatchRepository extends CrudRepository<Match, Integer> {
    List<Match> findById(Long id);
}

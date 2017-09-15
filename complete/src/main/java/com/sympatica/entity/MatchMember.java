package com.sympatica.entity;

import javax.persistence.*;

/**
 * Created by NguyenTrung on 15/9/17.
 */
@Entity
@Table(name = "MatchMember")
public class MatchMember {
    @Id
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name = "match_id")
//    private Match match;
    private String matchId;
    private String userId;


    //@Column(name = "created_date")
    private String createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

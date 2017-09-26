package com.sympatica.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by NguyenTrung on 12/9/17.
 */
@Entity
@Table(name = "`Match`")
public class Match {
    @Id
    private Long id;


    //@Column(name = "host_id")
    //private String hostId;
    @Column(name = "start_time")
    private String startTime;

    @Column(name = "start_date")
    private String startDate;

    @OneToOne
    @JoinColumn(name = "host_id")
    private ApplicationUser host;


    @OneToMany(mappedBy = "matchId", fetch = FetchType.LAZY)
    private List<MatchMember> participants;

    public ApplicationUser getHost() {
        return host;
    }

    public void setHost(ApplicationUser host) {
        this.host = host;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


//    public String getHostId() {
//        return hostId;
//    }
//
//    public void setHostId(String hostId) {
//        this.hostId = hostId;
//    }


    public List<MatchMember> getParticipants() {
        return participants;
    }

    public void setParticipants(List<MatchMember> participants) {
        this.participants = participants;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}

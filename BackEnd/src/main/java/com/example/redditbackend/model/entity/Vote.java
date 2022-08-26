package com.example.redditbackend.model.entity;

import com.example.redditbackend.model.entity.enums.VoteType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Vote {

    private Long voteId;
    private VoteType voteType;
    private Post post;
    private UserEntity user;

    public Vote() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId", referencedColumnName = "postId")
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

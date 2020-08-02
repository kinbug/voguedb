package com.github.kinbug.voguedb.node;

import java.io.Serializable;

/**
 *
 * 请求投票 RPC 返回值.
 *
 */
public class VoteResult implements Serializable {

	private static final long serialVersionUID = -6398753138395130696L;

	/** 当前任期号，以便于候选人去更新自己的任期 */
    long term;

    /** 候选人赢得了此张选票时为真 */
    boolean voteGranted;

    /**
	 * @return the term
	 */
	public long getTerm() {
		return term;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(long term) {
		this.term = term;
	}

	/**
	 * @return the voteGranted
	 */
	public boolean isVoteGranted() {
		return voteGranted;
	}

	/**
	 * @param voteGranted the voteGranted to set
	 */
	public void setVoteGranted(boolean voteGranted) {
		this.voteGranted = voteGranted;
	}

	public VoteResult(boolean voteGranted) {
        this.voteGranted = voteGranted;
    }

    private VoteResult(Builder builder) {
        setTerm(builder.term);
        setVoteGranted(builder.voteGranted);
    }

    public static VoteResult fail() {
        return new VoteResult(false);
    }

    public static VoteResult ok() {
        return new VoteResult(true);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {

        private long term;
        private boolean voteGranted;

        private Builder() {
        }

        public Builder term(long term) {
            this.term = term;
            return this;
        }

        public Builder voteGranted(boolean voteGranted) {
            this.voteGranted = voteGranted;
            return this;
        }

        public VoteResult build() {
            return new VoteResult(this);
        }
    }
}

package com.github.kinbug.voguedb.node;

/**
 * 请求投票 RPC 参数.
 *
 * @author 莫那·鲁道
 * @see Consensus#requestVote(VoteParam)
 */
public class VoteParam{

	/** 候选人的任期号  */
    public long term;

    /** 被请求者 ID(ip:selfPort) */
    public String serverId;
	
    /** 请求选票的候选人的 Id(ip:selfPort) */
    String candidateId;

    /** 候选人的最后日志条目的索引值 */
    long lastLogIndex;

    /** 候选人最后日志条目的任期号  */
    long lastLogTerm;

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
	 * @return the serverId
	 */
	public String getServerId() {
		return serverId;
	}

	/**
	 * @param serverId the serverId to set
	 */
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	/**
	 * @return the candidateId
	 */
	public String getCandidateId() {
		return candidateId;
	}

	/**
	 * @param candidateId the candidateId to set
	 */
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	/**
	 * @return the lastLogIndex
	 */
	public long getLastLogIndex() {
		return lastLogIndex;
	}

	/**
	 * @param lastLogIndex the lastLogIndex to set
	 */
	public void setLastLogIndex(long lastLogIndex) {
		this.lastLogIndex = lastLogIndex;
	}

	/**
	 * @return the lastLogTerm
	 */
	public long getLastLogTerm() {
		return lastLogTerm;
	}

	/**
	 * @param lastLogTerm the lastLogTerm to set
	 */
	public void setLastLogTerm(long lastLogTerm) {
		this.lastLogTerm = lastLogTerm;
	}

	private VoteParam(Builder builder) {
        setTerm(builder.term);
        setServerId(builder.serverId);
        setCandidateId(builder.candidateId);
        setLastLogIndex(builder.lastLogIndex);
        setLastLogTerm(builder.lastLogTerm);
    }

    @Override
    public String toString() {
        return "RvoteParam{" +
            "candidateId='" + candidateId + '\'' +
            ", lastLogIndex=" + lastLogIndex +
            ", lastLogTerm=" + lastLogTerm +
            ", term=" + term +
            ", serverId='" + serverId + '\'' +
            '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {

        private long term;
        private String serverId;
        private String candidateId;
        private long lastLogIndex;
        private long lastLogTerm;

        private Builder() {
        }

        public Builder term(long val) {
            term = val;
            return this;
        }

        public Builder serverId(String val) {
            serverId = val;
            return this;
        }

        public Builder candidateId(String val) {
            candidateId = val;
            return this;
        }

        public Builder lastLogIndex(long val) {
            lastLogIndex = val;
            return this;
        }

        public Builder lastLogTerm(long val) {
            lastLogTerm = val;
            return this;
        }

        public VoteParam build() {
            return new VoteParam(this);
        }
    }
}

package com.qingqing.live.domain.live;

import java.util.Date;

public class LiveOrderCourseSurvey {
    private Long id;

    private Long refId;

    private Byte refType;

    private Long userId;

    private Byte userType;

    private Long surveyId;

    private Byte surveyStatus;

    private Long surveyResultId;

    private Date createTime;

    private Byte isDeleted;

    private Date lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public Byte getRefType() {
        return refType;
    }

    public void setRefType(Byte refType) {
        this.refType = refType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public Byte getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(Byte surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

    public Long getSurveyResultId() {
        return surveyResultId;
    }

    public void setSurveyResultId(Long surveyResultId) {
        this.surveyResultId = surveyResultId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
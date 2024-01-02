package com.myapp.Data.Data_Entities;

import java.util.Date;

// TODO
public class Achieve_Log_Entity {

    private int challengesNumber;
    private int challengesStreak;
    private int challengeHighestGain;
    private Date dateStarted;
    private boolean completionStatus;
    private int rewardPoints;
    private String categoriesOrTypes;
    private String commentsOrNotes;
    private Date lastUpdateDate;
    private String achievementBadges;
    private int progressTowardsGoals;
    private double performanceMetrics;

    public Achieve_Log_Entity(int challengesNumber, int challengesStreak, int challengeHighestGain, Date dateStarted, boolean completionStatus,
                              int rewardPoints, String categoriesOrTypes, String commentsOrNotes, Date lastUpdateDate,
                              String achievementBadges, int progressTowardsGoals, double performanceMetrics) {
        this.challengesNumber = challengesNumber;
        this.challengesStreak = challengesStreak;
        this.challengeHighestGain = challengeHighestGain;
        this.dateStarted = dateStarted;
        this.completionStatus = completionStatus;
        this.rewardPoints = rewardPoints;
        this.categoriesOrTypes = categoriesOrTypes;
        this.commentsOrNotes = commentsOrNotes;
        this.lastUpdateDate = lastUpdateDate;
        this.achievementBadges = achievementBadges;
        this.progressTowardsGoals = progressTowardsGoals;
        this.performanceMetrics = performanceMetrics;
    }

    // Getter and Setter methods for each variable

    public int getChallengesNumber() {
        return challengesNumber;
    }

    public void setChallengesNumber(int challengesNumber) {
        this.challengesNumber = challengesNumber;
    }

    public int getChallengesStreak() {
        return challengesStreak;
    }

    public void setChallengesStreak(int challengesStreak) {
        this.challengesStreak = challengesStreak;
    }

    public int getChallengeHighestGain() {
        return challengeHighestGain;
    }

    public void setChallengeHighestGain(int challengeHighestGain) {
        this.challengeHighestGain = challengeHighestGain;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getCategoriesOrTypes() {
        return categoriesOrTypes;
    }

    public void setCategoriesOrTypes(String categoriesOrTypes) {
        this.categoriesOrTypes = categoriesOrTypes;
    }

    public String getCommentsOrNotes() {
        return commentsOrNotes;
    }

    public void setCommentsOrNotes(String commentsOrNotes) {
        this.commentsOrNotes = commentsOrNotes;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getAchievementBadges() {
        return achievementBadges;
    }

    public void setAchievementBadges(String achievementBadges) {
        this.achievementBadges = achievementBadges;
    }

    public int getProgressTowardsGoals() {
        return progressTowardsGoals;
    }

    public void setProgressTowardsGoals(int progressTowardsGoals) {
        this.progressTowardsGoals = progressTowardsGoals;
    }

    public double getPerformanceMetrics() {
        return performanceMetrics;
    }

    public void setPerformanceMetrics(double performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }
}
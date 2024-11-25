package com.backontrack.testing.forum.statistics;

public class StatisticsAnalyser {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.averagePostsPerUser = calculateAveragePostsPerUser();
        this.averageCommentsPerUser = calculateAverageCommentsPerUser();
        this.averageCommentsPerPost = calculateAverageCommentsPerPost();
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    private double calculateAveragePostsPerUser() {
        if (this.usersCount != 0) {
            return (double) this.postsCount / this.usersCount;
        } else {
            System.out.println("There are 0 users so you can not get PostsPerUser statistic.");
            return -1;
        }
    }

    private double calculateAverageCommentsPerUser() {
        if (this.usersCount != 0) {
            return (double) this.commentsCount / this.usersCount;
        } else {
            System.out.println("There are 0 users so you can not get CommentsPerUser statistic.");
            return -1;
        }
    }

    private double calculateAverageCommentsPerPost() {
        if (this.postsCount != 0) {
            return (double) this.commentsCount / this.postsCount;
        } else {
            System.out.println("There are 0 posts so you can not get CommentsPerPost statistic.");
            return -1;
        }
    }
}

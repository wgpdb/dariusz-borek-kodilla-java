package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private Statistics statistics;

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserCount() {
        return userCount;
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

    public Statistics calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (postsCount != 0 && userCount != 0) {
            averagePostsPerUser = (double)postsCount / (double)userCount;
        }

        if (commentsCount != 0 && userCount != 0) {
            averageCommentsPerUser = (double)commentsCount / (double)userCount;
        }

        if (commentsCount != 0 && postsCount != 0) {
            averageCommentsPerPost = (double)commentsCount / (double)postsCount;
        }
        return statistics;
    }

    public void showStatistics() {

        System.out.println("Number of users: " + userCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }
}
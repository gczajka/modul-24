package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers != 0 && numberOfPosts != 0) {
            averageNumberOfPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
            averageNumberOfCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        } else {
            if(numberOfUsers == 0 && numberOfPosts != 0){
                averageNumberOfCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
            } else {
                if(numberOfUsers != 0 && numberOfPosts == 0){
                    averageNumberOfPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
                    averageNumberOfCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
                }
            }
        }
    }

    public void showStatistics(){
        System.out.println("Number of users equals: " + numberOfUsers + "\n" + "Number of posts equals: " + numberOfPosts + "\n" + "Number of comments equals: " + numberOfComments + "\n" +
                "Average number of posts per user equals: " + averageNumberOfPostsPerUser + "\n" + "Average number of comments per user equals: " + averageNumberOfCommentsPerUser + "\n" +
                    "Average number of comments per post equals: " + averageNumberOfCommentsPerPost);
    }

}

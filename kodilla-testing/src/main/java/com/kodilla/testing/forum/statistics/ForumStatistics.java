package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postAvgPerUser;
    private double comAvgPerUser;
    private double comAvgPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostAvgPerUser() {
        return postAvgPerUser;
    }

    public double getComAvgPerUser() {
        return comAvgPerUser;
    }

    public double getComAvgPerPost() {
        return comAvgPerPost;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        postAvgPerUser =calculatePostsAveragePerUser();
        comAvgPerUser =calculateCommentsAveragePerUser();
        comAvgPerPost =calculateCommentsAveragePerPost();
    }
    private double calculatePostsAveragePerUser(){
        if(usersCount>0) {
            return (double) postsCount / usersCount;
        }else{
            return 0;
        }
    }
    private double calculateCommentsAveragePerUser(){
        if(usersCount>0) {
            return (double) commentsCount / usersCount;
        }else{
            return 0;
        }
    }
    private double calculateCommentsAveragePerPost(){
        if(postsCount>0) {
            return (double) commentsCount / postsCount;
        }else{
            return 0;
        }
    }
    public void showStatistics(){
        System.out.println("Forum statistics:");
        System.out.println("Users quantity:"+ usersCount);
        System.out.println("Posts quantity:"+ postsCount);
        System.out.println("Comments quantity:"+ commentsCount);
        System.out.println("Posts average per user:"+ postAvgPerUser);
        System.out.println("Comments average per user:"+ comAvgPerUser);
        System.out.println("Comments average per post:"+ comAvgPerPost);
    }
}

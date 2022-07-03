package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    @Mock
    private ForumStatistics forumStatistics;
    @BeforeEach
    public void beforeEachTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getPostsCount());
        Assertions.assertEquals(0, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(0, forumStatistics.getComAvgPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getPostsCount());
        Assertions.assertEquals(100, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(0.04, forumStatistics.getComAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getCommentsCount());
        Assertions.assertEquals(0, forumStatistics.getComAvgPerUser(), 0.01);
        Assertions.assertEquals(0, forumStatistics.getComAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(10, forumStatistics.getPostsCount());
        Assertions.assertEquals(2, forumStatistics.getCommentsCount());
        Assertions.assertEquals(1, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(0.2, forumStatistics.getComAvgPerUser(), 0.01);
        Assertions.assertEquals(0.2, forumStatistics.getComAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(20, forumStatistics.getPostsCount());
        Assertions.assertEquals(40, forumStatistics.getCommentsCount());
        Assertions.assertEquals(2, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(4, forumStatistics.getComAvgPerUser(), 0.01);
        Assertions.assertEquals(2, forumStatistics.getComAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getUsersCount());
        Assertions.assertEquals(0, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(0, forumStatistics.getComAvgPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getUsersCount());
        Assertions.assertEquals(0.2, forumStatistics.getPostAvgPerUser(), 0.01);
        Assertions.assertEquals(0.4, forumStatistics.getComAvgPerUser(), 0.01);
    }
}
package com.backontrack.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsAnalyzerTestSuite {

    @Mock
    Statistics statisticsMock;

    @Test
    void testAverage_0Posts() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(0, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(0, receivedCommentsCount);
        assertEquals(0.0, calculatedAveragePostsPerUser, 0.1);
        assertEquals(-1.0, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(0.0, calculatedAverageCommentsPerUser, 0.1);

    }

    @Test
    void testAverage_1000Posts() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1900);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(1000, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(1900, receivedCommentsCount);
        assertEquals(52.6, calculatedAveragePostsPerUser, 0.1);
        assertEquals(1.9, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(100.0, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_0Comments() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(1000, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(0, receivedCommentsCount);
        assertEquals(52.6, calculatedAveragePostsPerUser, 0.1);
        assertEquals(0.0, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(0.0, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_1000Comments() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(80);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(80, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(1000, receivedCommentsCount);
        assertEquals(4.2, calculatedAveragePostsPerUser, 0.1);
        assertEquals(12.5, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(52.6, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_MorePostsThanComments() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(190);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(1000, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(190, receivedCommentsCount);
        assertEquals(52.6, calculatedAveragePostsPerUser, 0.1);
        assertEquals(0.19, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(10.0, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_MoreCommentsThanPosts() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(19);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1900);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(100, receivedPostsCount);
        assertEquals(19, receivedUsersCount);
        assertEquals(1900, receivedCommentsCount);
        assertEquals(5.3, calculatedAveragePostsPerUser, 0.1);
        assertEquals(19.0, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(100.0, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_0Users() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(0, receivedPostsCount);
        assertEquals(0, receivedUsersCount);
        assertEquals(0, receivedCommentsCount);
        assertEquals(-1.0, calculatedAveragePostsPerUser, 0.1);
        assertEquals(-1.0, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(-1.0, calculatedAverageCommentsPerUser, 0.1);
    }

    @Test
    void testAverage_100Users() {
        //Given
        StatisticsAnalyser analyser = new StatisticsAnalyser();
        List<String> usersNames = getUserListWithNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(290);

        //When
        analyser.calculateAdvStatistics(statisticsMock);
        int receivedPostsCount = analyser.getPostsCount();
        int receivedCommentsCount = analyser.getCommentsCount();
        int receivedUsersCount = analyser.getUsersCount();
        double calculatedAveragePostsPerUser = analyser.getAveragePostsPerUser();
        double calculatedAverageCommentsPerPost = analyser.getAverageCommentsPerPost();
        double calculatedAverageCommentsPerUser = analyser.getAverageCommentsPerUser();

        //Then
        assertEquals(100, receivedPostsCount);
        assertEquals(100, receivedUsersCount);
        assertEquals(290, receivedCommentsCount);
        assertEquals(1.0, calculatedAveragePostsPerUser, 0.1);
        assertEquals(2.9, calculatedAverageCommentsPerPost, 0.1);
        assertEquals(2.9, calculatedAverageCommentsPerUser, 0.1);
    }

    public List<String> getUserListWithNUsers(int n) {
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            usersNames.add("User #" + i);
        }
        return usersNames;
    }
}

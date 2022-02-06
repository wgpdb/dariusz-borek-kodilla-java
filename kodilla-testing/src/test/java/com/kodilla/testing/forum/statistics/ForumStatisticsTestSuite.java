package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Forum Statistics Test Suite: start");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All tests completed");
    }

    private List<String> generateListOfNUserNames(int userNamesQuantity) {
        List<String> usersList = new ArrayList<>();

        for (int n = 1; n <= userNamesQuantity; n++) {
            usersList.add("randomUser" + n);
        }
        return usersList;
    }

    @Test
    void testCalculateAdvStatisticsMethod() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statCalc.getUserCount());
        assertEquals(0, statCalc.getPostsCount());
        assertEquals(0, statCalc.getCommentsCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(100));

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statCalc.getUserCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerPost());

    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(100));
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statCalc.getUserCount());
        assertEquals(1000, statCalc.getPostsCount());
        assertEquals(10, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics0Comments() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(100));

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statCalc.getUserCount());
        assertEquals(0, statCalc.getPostsCount());
        assertEquals(0, statCalc.getCommentsCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsCommentsSmallerThanPosts() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statCalc.getUserCount());
        assertEquals(1000, statCalc.getPostsCount());
        assertEquals(100, statCalc.getCommentsCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(0.1, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsCommentsLargerThanPosts() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statCalc.getUserCount());
        assertEquals(100, statCalc.getPostsCount());
        assertEquals(1000, statCalc.getCommentsCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(10, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics0Users() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statCalc.getUserCount());
        assertEquals(100, statCalc.getPostsCount());
        assertEquals(500, statCalc.getCommentsCount());
        assertEquals(0, statCalc.getAveragePostsPerUser());
        assertEquals(0, statCalc.getAverageCommentsPerUser());
        assertEquals(5, statCalc.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(100));
        when(statisticsMock.postsCount()).thenReturn(250);
        when(statisticsMock.commentsCount()).thenReturn(600);

        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        statCalc.showStatistics();

        //Then
        assertEquals(100, statCalc.getUserCount());
        assertEquals(250, statCalc.getPostsCount());
        assertEquals(600, statCalc.getCommentsCount());
        assertEquals(2.5, statCalc.getAveragePostsPerUser());
        assertEquals(6, statCalc.getAverageCommentsPerUser());
        assertEquals(2.4, statCalc.getAverageCommentsPerPost());
    }
}
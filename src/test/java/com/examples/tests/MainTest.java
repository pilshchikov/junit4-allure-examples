package com.examples.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.junit4.Tag;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@Slf4j
@Feature("Sample feature")
@Story("Sample story over class")
public class MainTest {

    @Test
    @DisplayName("Failed test")
    public void failedTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Ignore test")
    public void ignoreTest() {
        assertTrue(false);
    }

    @Test
    @DisplayName("Assume test")
    public void assumeTest() {
        assumeTrue(false);
    }

    @Test
    @Tag("Good tests")
    @DisplayName("Good test")
    public void simpleTest() {
        log.info("Yeah!");
    }

    @Test
    @DisplayName("Error test")
    public void errorTest() {
        throw new Error("Error");
    }

    /**
     * Javadoc
     */
    @Test
    @Tag("Good tests")
    @DisplayName("JavaDoc test")
    @Description(useJavaDoc = true)
    public void javaDocDescriptionTest() {
    }

    @Test
    @DisplayName("Simple description")
    @Description("Simple description and more..")
    public void descriptionTest() {
    }

    @Test
    @Story("Simple story")
    @DisplayName("Story test")
    public void storyTest() {
    }
}

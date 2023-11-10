package com.syntexpro.qa;

import com.syntexpro.qa.dev.HelloSummer;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HelloSummerTest {

    private HelloSummer helloSummer;

    @BeforeEach
    void setup() {

        helloSummer = new HelloSummer();
    }

    @Test
    @DisplayName("HelloSaturday")
    @Order(4)
    void Test1() {


        assertEquals("06/17/2023-Warmest weather today!", helloSummer.helloSaturday());
    }

    @Test
    @DisplayName("HelloSunday")
    @Order(2)
    void Test2() {


        assertEquals("06/18/2023-Warmest weather today!", helloSummer.helloSunday());
    }

    @Test
    @DisplayName("HelloMonday")
    @Order(1)
    void Test3() {


        assertEquals("06/19/2023-Warmest weather today!", helloSummer.helloMonday());
    }

    @Test
    @DisplayName("HelloTuesday")
    @Order(3)
    void Test4() {


        assertEquals("06/20/2023-Warmest weather today!", helloSummer.helloTuesday());
    }

    @Test
    @DisplayName("HelloWednesday")
    @Order(5)
    void Test5() {


        assertEquals("06/21/2023-Warmest weather today!", helloSummer.helloWednesday());
    }
}
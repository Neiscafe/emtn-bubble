package com.example.emtn_bubble.usecases

import com.example.emtn_bubble.domain.usecases.BuildGraph
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`

import org.junit.Test

class BuildGraphTest {
    @Test
    fun calculateEmptyGraph() {
        val result = BuildGraph.recalculate(emptyGraph, newEmotion)
        assertThat(oneEmotionGraph, `is`(result))
    }

    @Test
    fun calculateAlreadyFilledGraphWithSameEmotion() {
        val result = BuildGraph.recalculate(oneEmotionGraph, newEmotion)
        assertThat(twoEqualEmotionsGraph, `is`(result))
    }

    @Test
    fun calculateAlreadyFilledGraphWithAnotherEmotion() {
        val result = BuildGraph.recalculate(oneEmotionGraph, secondEmotion)
        assertThat(twoDifferentEmotionsGraph, `is`(result))
    }

    @Test
    fun calculateDifferentEmotionWithSame(){
        val result = BuildGraph.recalculate(twoDifferentEmotionsGraph, newEmotion)
        assertThat(twoDifferentOneSameEmotionsGraph, `is`(result))
    }

    @Test
    fun pointerTest(){
        BuildGraph.test(emptyGraph, newEmotion)
        println(emptyGraph)
        assertThat(oneEmotionGraph, `is`(emptyGraph))
    }

}
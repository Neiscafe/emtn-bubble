package com.example.emtn_bubble.usecases

import android.graphics.Color
import com.example.emtn_bubble.domain.model.Column
import com.example.emtn_bubble.domain.model.Emotion
import com.example.emtn_bubble.domain.model.Graph

val newEmotion = Emotion(0, "Happy", Color.GREEN)
val secondEmotion = Emotion(1, "Sad", Color.BLUE)
val oneEmotionColumn = Column(1, newEmotion, 1f)
val twoEqualEmotionsColumn = Column(2, newEmotion, 0.5f)
val twoEqualEmotionsGraph = Graph(0, 1, 2, mutableListOf(twoEqualEmotionsColumn))
val oneEmotionGraph = Graph(0, 1, 1, mutableListOf(oneEmotionColumn))
val emptyGraph = Graph(0, 0, 0, mutableListOf())
val twoDifferentEmotionsColumn1 = Column(1, newEmotion, 0.5f)
val twoDifferentEmotionsColumn2 = Column(1, secondEmotion, 0.5f)
val twoDifferentEmotionsGraph =
    Graph(0, 2, 2, mutableListOf(twoDifferentEmotionsColumn1, twoDifferentEmotionsColumn2))
val twoColumnsThreeEmotions = mutableListOf<Column>(
    Column(2, newEmotion, 0.6666667f),
    Column(1, secondEmotion, 0.33333334f)
)
val twoDifferentOneSameEmotionsGraph =
    Graph(0, 2, 3, twoColumnsThreeEmotions)

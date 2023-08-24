package com.example.emtn_bubble.model

data class Graph(
    val id: Int,
    val columnNumber: Int,
    var totalEmotions: Int,
    var columns: MutableList<Column>
)
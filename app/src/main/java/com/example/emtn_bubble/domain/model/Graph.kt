package com.example.emtn_bubble.domain.model

data class Graph(
    val id: Int,
    var columnNumber: Int,
    var totalEmotions: Int,
    var columns: MutableList<Column>
)
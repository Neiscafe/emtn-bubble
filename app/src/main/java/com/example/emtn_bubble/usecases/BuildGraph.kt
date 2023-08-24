package com.example.emtn_bubble.usecases

import com.example.emtn_bubble.model.Column
import com.example.emtn_bubble.model.Emotion
import com.example.emtn_bubble.model.Graph

class BuildGraph {
    fun recalculate(old: Graph, new: Emotion): Graph{
        for (column in old.columns){
            if(new.id==column.emotion.id){
                column.emotionQuantity++
                old.totalEmotions++
            }else{
                old.columns.add(Column(1, new, 0f))
            }
        }
        //reajustar cada sentimento do gráfico
        for (column in old.columns){
            // 1/No de emoções X a quantidade de cada emoção
            column.emotionDist = 1f/(old.columns.size*column.emotionQuantity)
        }
        return old
    }
}
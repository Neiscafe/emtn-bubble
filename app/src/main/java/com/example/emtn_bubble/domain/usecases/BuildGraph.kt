package com.example.emtn_bubble.domain.usecases

import com.example.emtn_bubble.domain.model.Column
import com.example.emtn_bubble.domain.model.Emotion
import com.example.emtn_bubble.domain.model.Graph

class BuildGraph {
    companion object{
        fun recalculate(old: Graph, new: Emotion): Graph {
            var matches = false
            //Empty list case demands simpler logic
            if(old.columns.isEmpty()){
                old.columns.add(Column(1, new, 1f))
                old.columnNumber++
                old.totalEmotions++
                return old
            }
            //Otimizavel com um do while
            for (column in old.columns){
                if(new.id==column.emotion.id){
                    column.emotionQuantity++
                    matches = true
                }
            }
            if(!matches){
               old.columns.add(Column(1, new, 0f))
                old.columnNumber++
            }
            old.totalEmotions++
            //reajustar cada sentimento do gráfico
            for (column in old.columns){
                // 1/No de emoções X a quantidade de cada emoção
                column.emotionDist = 1f/old.totalEmotions*column.emotionQuantity
            }
            return old
        }

        //Teste para alterar os valores em função void
        //Essa função pode se tornar um método da classe Graph, ja solucionando o encapsulamento e facilitando a sintaxe
        fun test(old: Graph, new: Emotion){
            var matches = false
            //Empty list case demands simpler logic
            if(old.columns.isEmpty()){
                old.columns.add(Column(1, new, 1f))
                old.columnNumber++
                old.totalEmotions++
                return
            }
            //Otimizavel com um do while
            for (column in old.columns){
                if(new.id==column.emotion.id){
                    column.emotionQuantity++
                    matches = true
                }
            }
            if(!matches){
                old.columns.add(Column(1, new, 0f))
                old.columnNumber++
            }
            old.totalEmotions++
            //reajustar cada sentimento do gráfico
            for (column in old.columns){
                // 1/No de emoções X a quantidade de cada emoção
                column.emotionDist = 1f/old.totalEmotions*column.emotionQuantity
            }
        }
    }
}
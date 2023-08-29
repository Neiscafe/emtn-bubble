package com.example.emtn_bubble.data.remote

import com.example.emtn_bubble.domain.model.Graph
import retrofit2.http.GET

interface GraphService{
    @GET
    suspend fun getPartnerGraph(): Graph
}
package com.bignerdranch.android.photograllery.api

import retrofit2.http.GET

private const val API_KEY = "c6a5e46d872a7fd22d75c27a72181cd2"

interface FlickrApi {
    @GET(
        "/services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
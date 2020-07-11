package com.mobileforce.hometeach.remotesource

import com.mobileforce.hometeach.remotesource.wrappers.EditTutorProfileResponse
import com.mobileforce.hometeach.remotesource.wrappers.LoginResponse
import com.mobileforce.hometeach.remotesource.wrappers.ProfileResponse
import com.mobileforce.hometeach.remotesource.wrappers.RegisterUserResponse
import retrofit2.http.*


interface Api {

    @GET("login/user")
    suspend fun login(): LoginResponse

    @POST("api/v1/register/")
    suspend fun register(@Body params: Params.SignUp): RegisterUserResponse

    @PUT("api/v1/profiles/{id}/")
    suspend fun editTutorProfile(@Path("id") id: Int, @Body params: Params.EditTutorProfile): EditTutorProfileResponse

    @GET("/api/v1/profiles/")
    suspend fun getProfileList(): List<ProfileResponse>
}
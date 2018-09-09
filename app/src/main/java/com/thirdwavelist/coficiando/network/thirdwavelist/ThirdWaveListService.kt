/*
 * BSD 3-Clause License
 *
 * Copyright (c) 2017, Antal János Monori
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 *  Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.thirdwavelist.coficiando.network.thirdwavelist

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import java.util.UUID

interface ThirdWaveListService {

    @Headers("Accept: application/json")
    @GET("/v1/cafe")
    fun getCafes(): Single<List<ThirdWaveListCafeItem>>

    @Headers("Accept: application/json")
    @POST("/v1/cafe")
    fun postCafe(@Body cafeItem: ThirdWaveListCafeItem)

    @Headers("Accept: application/json")
    @GET("/v1/cafe/{uid}")
    fun getCafe(@Path("uid") id: UUID): Single<ThirdWaveListCafeItem>

    @Headers("Accept: application/json")
    @DELETE("/v1/cafe/{uid}")
    fun deleteCafe(@Path("uid") id: UUID, @Body cafeItem: ThirdWaveListCafeItem)

    @Headers("Accept: application/json")
    @GET("/v1/cities")
    fun getCities(): Single<List<ThirdWaveListCityItem>>
}
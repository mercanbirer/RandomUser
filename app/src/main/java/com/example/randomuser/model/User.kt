package com.example.randomuser.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class User(
    @SerialName("info")
    val info: İnfo,
    @SerialName("results")
    val results: List<Result>,
) : Parcelable {
    @Parcelize
    @Serializable
    data class Result(
        @SerialName("cell")
        val cell: String,
        @SerialName("dob")
        val dob: Dob,
        @SerialName("email")
        val email: String,
        @SerialName("gender")
        val gender: String,
        @SerialName("id")
        val id: İd,
        @SerialName("location")
        val location: Location,
        @SerialName("login")
        val login: Login,
        @SerialName("name")
        val name: Name,
        @SerialName("nat")
        val nat: String,
        @SerialName("phone")
        val phone: String,
        @SerialName("picture")
        val picture: Picture,
        @SerialName("registered")
        val registered: Registered,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Street(
        @SerialName("name")
        val name: String,
        @SerialName("number")
        val number: Int,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Registered(
        @SerialName("age")
        val age: Int,
        @SerialName("date")
        val date: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Timezone(
        @SerialName("description")
        val description: String,
        @SerialName("offset")
        val offset: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Picture(
        @SerialName("large")
        val large: String,
        @SerialName("medium")
        val medium: String,
        @SerialName("thumbnail")
        val thumbnail: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Name(
        @SerialName("first")
        val first: String,
        @SerialName("last")
        val last: String,
        @SerialName("title")
        val title: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Login(
        @SerialName("md5")
        val md5: String,
        @SerialName("password")
        val password: String,
        @SerialName("salt")
        val salt: String,
        @SerialName("sha1")
        val sha1: String,
        @SerialName("sha256")
        val sha256: String,
        @SerialName("username")
        val username: String,
        @SerialName("uuid")
        val uuid: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Location(
        @SerialName("city")
        val city: String,
        @SerialName("coordinates")
        val coordinates: Coordinates,
        @SerialName("country")
        val country: String,
        @SerialName("postcode")
        val postcode: String,
        @SerialName("state")
        val state: String,
        @SerialName("street")
        val street: Street,
        @SerialName("timezone")
        val timezone: Timezone,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class İnfo(
        @SerialName("page")
        val page: Int,
        @SerialName("results")
        val results: Int,
        @SerialName("seed")
        val seed: String,
        @SerialName("version")
        val version: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class İd(
        @SerialName("name")
        val name: String,
        @SerialName("value")
        val value: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Dob(
        @SerialName("age")
        val age: Int,
        @SerialName("date")
        val date: String,
    ) : Parcelable

    @Parcelize
    @Serializable
    data class Coordinates(
        @SerialName("latitude")
        val latitude: String,
        @SerialName("longitude")
        val longitude: String,
    ) : Parcelable
}

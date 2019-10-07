package com.buzzvil.rs.hellokotlin.network.model

import com.google.gson.annotations.SerializedName

/*
{
    id: 5494,
    name: "MadTree Brewing",
    brewery_type: "regional",
    street: "3301 Madison Rd",
    city: "Cincinnati",
    state: "Ohio",
    postal_code: "45209-1132",
    country: "United States",
    longitude: "-84.4239715",
    latitude: "39.1563725",
    phone: "5138368733",
    website_url: "http://www.madtreebrewing.com",
    updated_at: "2018-08-24T15:44:22.281Z",
    tag_list: [
    "patio"
    ]
}
*/

data class Brewery(
    val id: Int,
    val name: String,
    @SerializedName("brewery_type")
    val breweryType: String,
    val street: String,
    val city: String,
    val state: String,
    @SerializedName("postal_code")
    val postalCode: String,
    val country: String,
    val longitude: Double,
    val latitude: Double,
    val phone: String,
    @SerializedName("website_url")
    val websiteUrl: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("tag_list")
    val tagList: List<String>
) {
}
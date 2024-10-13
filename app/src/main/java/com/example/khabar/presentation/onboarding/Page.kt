package com.example.khabar.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.khabar.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)


val pages = listOf(
    Page(
        title = "Stay Informed, Stay Ahead",
        description = "Get the latest news stories delivered straight to your fingertips. Explore breaking news and trending topics that matter to you.",
        image = R.drawable.onboarding_image2
    ),
    Page(
        title = "Personalize Your Feed",
        description = "Choose your interests and build a news feed that’s tailored just for you. From technology to sports, follow the topics you love.",
        image = R.drawable.onboarding_image3
    ),
    Page(
        title = "Dive Deeper into Stories",
        description = "Gain a deeper understanding of the news with in-depth articles, expert opinions, and analysis on the issues that shape our world.",
        image = R.drawable.onboarding_image1
    )
)
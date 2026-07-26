package io.github.yourusername.aurora.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.yourusername.aurora.feature.home.R
import io.github.yourusername.aurora.core.ui.components.cards.ContinueJourneyCard
import io.github.yourusername.aurora.core.ui.components.cards.PosterCard
import io.github.yourusername.aurora.core.ui.components.section.SectionHeader

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {

    // Temporary placeholder data.
    // Will be replaced by the Content Engine later.
    val placeholderItems = List(10) {
        Triple(
            R.drawable.placeholder_poster,
            "Placeholder Title",
            "TV • 12 Episodes"
        )
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(24.dp),
        verticalArrangement = Arrangement.spacedBy(28.dp)
    ) {

        item {

            ContinueJourneyCard(
                artworkRes = R.drawable.placeholder_banner,
                title = "Continue Watching",
                subtitle = "Replace with real media",
                progressLabel = "Episode 1 • 42%",
                progress = 0.42f,
                onResumeClick = {}
            )

        }

        item {

            SectionHeader(
                title = "Trending",
                actionText = "See all",
                onActionClick = {}
            )

        }

        item {

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                items(placeholderItems) { item ->

                    PosterCard(
                        artworkRes = item.first,
                        title = item.second,
                        subtitle = item.third
                    )

                }

            }

        }

        item {

            SectionHeader(
                title = "Recently Updated",
                actionText = "See all",
                onActionClick = {}
            )

        }

        item {

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                items(placeholderItems) { item ->

                    PosterCard(
                        artworkRes = item.first,
                        title = item.second,
                        subtitle = item.third
                    )

                }

            }

        }

    }

}
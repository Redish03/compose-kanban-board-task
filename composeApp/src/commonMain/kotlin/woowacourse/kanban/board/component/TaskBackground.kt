package woowacourse.kanban.board.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TaskBackground(function: @Composable () -> Unit) {
    FlowRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(38.dp),
        maxItemsInEachRow = 4,
        horizontalArrangement = Arrangement.spacedBy(52.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        function()
        /*
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            script = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
            tags = listOf("컴포넌트", "성능"),
            nickname = "다이노",
        )
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            tags = listOf("컴포넌트", "성능"),
            nickname = "다이노",
        )
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            script = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
            nickname = "다이노",
        )
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            nickname = "다이노",
        )
        TaskCard(
            title = "너무 너무 긴 제목은 한 줄 까지만 노출시킵니다.",
            script = "너무 너무 너무 긴 설명은 두 줄까지만 노출하고 말 줄임표로 처리합니다. 두 줄 까지만 노출합니다.",
            tags = listOf("너무너무", "긴 태그", "최대로", "5자까지", "5개제한임"),
            nickname = "다이노",
        )*/
    }
}
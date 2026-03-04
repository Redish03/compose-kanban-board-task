package woowacourse.kanban.board

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.component.Profile
import woowacourse.kanban.board.component.Script
import woowacourse.kanban.board.component.Tags
import woowacourse.kanban.board.component.Title

@Composable
@Preview(showBackground = true)
fun App() {
    TaskCard(
        title = "LazyColumn 컴포넌트 구현",
        script = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
        tags = listOf("컴포넌트", "성ㅁㄴㅇㄹ능", "미나어리ㅏ먼이ㅏㅓㄹ미", "아오미나얼", "사무엘ㅁㄴㅇㄹ", "호잇~"),
        nickname = "다이노",
    )

}

@Composable
fun TaskCard(
    title: String,
    script: String? = null,
    tags: List<String>? = null,
    nickname: String,
) {
    Card(
        modifier = Modifier
            .width(286.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        border = BorderStroke(1.dp, CustomColor.CARD_BORDER.color),
        shape = RoundedCornerShape(10.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(17.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Title(title)
            Script(script)
            Tags(tags)
            HorizontalDivider(
                thickness = 1.dp,
                color = CustomColor.DIVIDER.color
            )
            Profile(nickname)
        }
    }
}
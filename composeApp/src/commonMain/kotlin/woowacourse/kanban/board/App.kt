package woowacourse.kanban.board

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.component.TaskCard

@Composable
@Preview(showBackground = true)
fun App() {
    FlowRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(38.dp),
        maxItemsInEachRow = 4,
        horizontalArrangement = Arrangement.spacedBy(52.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
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
        )
    }
}

@Composable
fun CheckerScreen() {
    var checked by remember { mutableStateOf(true) }

    CheckerView(checked = checked) {
        checked = !checked
    }
}

@Composable
fun CheckerView(checked: Boolean, check: () -> Unit) {
    Column {
        Checkbox(
            checked = checked,
            onCheckedChange = { check() },
        )
        if (checked) Text(text = "체크됨!")
    }
}
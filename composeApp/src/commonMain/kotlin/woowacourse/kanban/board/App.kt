package woowacourse.kanban.board

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import woowacourse.kanban.board.component.TaskBackground
import woowacourse.kanban.board.data.Task

@Composable
@Preview(showBackground = true)
fun App() {
    val tasks = listOf<Task>(
        Task(
            "LazyColumn 컴포넌트 구현",
            "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
            listOf("컴포넌트", "성능"),
            "다이노",
        ),
    )
    TaskBackground { TaskUIMapper().createTaskUI(tasks) }
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
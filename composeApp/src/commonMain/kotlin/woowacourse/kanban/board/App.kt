package woowacourse.kanban.board

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview(showBackground = true)
fun App() {
    TaskCard(
        title = "LazyColumn 컴포넌트 구현",
        script = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
        tags = listOf("컴포넌트", "성능"),
        nickname = "다이노")

}

@Composable
fun TaskCard(
    title: String,
    script: String?,
    tags: List<String>?,
    nickname: String) {
    Card(
        modifier = Modifier
            .width(286.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        border = BorderStroke(1.dp, Color(0xffE5E7EB)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column {
            Text(title)
            if(script != null) Text(script)
            if(tags != null) // TODO : TAG 구현
            HorizontalDivider()
        }
    }
}


//
//@Composable
//fun CheckerScreen() {
//    var checked by remember { mutableStateOf(true) }
//
//    CheckerView(checked = checked) {
//        checked = !checked
//    }
//}
//
//@Composable
//fun CheckerView(checked: Boolean, check: () -> Unit) {
//    Column {
//        Checkbox(
//            checked = checked,
//            onCheckedChange = { check() },
//        )
//        if(checked) Text(text = "체크됨!")
//    }
//}

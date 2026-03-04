package woowacourse.kanban.board.study

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.sp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.compose_multiplatform
import kanbanboard.composeapp.generated.resources.woowacourse
import org.jetbrains.compose.resources.painterResource

@Composable
fun TextExample() {
    Text(
        text = "Jetpack Compose Text 실습",
        color = Color.Blue,
        fontSize = 22.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
    )
}

@Composable
@Preview
fun ImageExample() {
    Image(
        painter = painterResource(Res.drawable.woowacourse),
        contentDescription = "설명 텍스트 (접근성을 위해 중요!)",
    )
}

@Composable
fun ButtonExample() {
    Button(onClick = {
        println("버튼 클릭!")
    }) {
        Text(text = "저장")
    }
}

@Composable
@Preview
fun ButtonExample2() {
    Button(onClick = {
        println("버튼 클릭!")
    }) {
        Image(
            painter = painterResource(Res.drawable.woowacourse),
            contentDescription = "버튼 이미지",
        )
    }
}
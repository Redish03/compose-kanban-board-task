package woowacourse.kanban.board.study

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun TextExample() {
    Text(text = "Jetpack Compose Text 실습",
        color = Color.Blue,
        fontSize = 22.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold)
}

fun ImageExample() {

}
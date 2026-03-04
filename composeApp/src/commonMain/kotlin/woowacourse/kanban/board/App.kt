package woowacourse.kanban.board

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.compose_multiplatform
import kanbanboard.composeapp.generated.resources.profile
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview(showBackground = true)
fun App() {
    TaskCard(
        title = "LazyColumn 컴포넌트 구현",
        script = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
        tags = listOf("컴포넌트", "성능"),
        nickname = "다이노",
    )

}

@Composable
fun TaskCard(
    title: String,
    script: String?,
    tags: List<String>?,
    nickname: String,
) {
    Card(
        modifier = Modifier
            .width(286.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        border = BorderStroke(1.dp, Color(0xffE5E7EB)),
        shape = RoundedCornerShape(10.dp),
    ) {
        Column {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF101828),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (script != null) Text(
                text = script,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xff4A5565),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            if (tags != null) // TODO : TAG 구현
            HorizontalDivider()
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(Res.drawable.profile),
                    contentDescription = "프로필 이미지",
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = nickname,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xff364153),
                )
            }
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

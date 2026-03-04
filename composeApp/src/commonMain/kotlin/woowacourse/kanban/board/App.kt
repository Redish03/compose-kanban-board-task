package woowacourse.kanban.board

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
        tags = listOf("컴포넌트", "성ㅁㄴㅇㄹ능", "미나어리ㅏ먼이ㅏㅓㄹ미", "아오미나얼", "사무엘ㅁㄴㅇㄹ", "호잇~"),
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
            if (tags != null) {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    val tagsCount = if(tags.size > 5) 5 else tags.size
                    for (i in 0 until tagsCount) {
                        val filteredTag = if (tags[i].length > 5) tags[i].substring(0 until 5) else tags[i]
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFF3F4F6),
                                    shape = RoundedCornerShape(14.dp),
                                )
                                .padding(vertical = 4.dp, horizontal = 6.dp)
                            ,
                            ) {
                            Text(
                                text = filteredTag,
                                fontSize = 12.sp,
                                color = Color(0xFF364153),
                            )
                        }
                    }
                }
            }
            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0xFFF3F4F6)
            )
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
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
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

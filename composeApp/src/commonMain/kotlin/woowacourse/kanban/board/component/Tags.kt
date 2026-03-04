package woowacourse.kanban.board.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tags(tags: List<String>?) {
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
}
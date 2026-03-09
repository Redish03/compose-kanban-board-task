package woowacourse.kanban.board.data

data class Task(
    val taskTitle: String,
    val taskScript: String = "",
    val tags: List<String> = emptyList(),
    val profileName: String,
)

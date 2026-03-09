package woowacourse.kanban.board.data

data class Task(
    val taskTitle: String,
    val taskScript: String = "",
    val tags: List<String> = emptyList(),
    val profileName: String,
) {
    init {
        require(taskTitle.isNotBlank()) { "할 일의 제목은 빈칸이거나 공백 일 수 없습니다." }
        require(profileName.isNotBlank()) { "사용자 이름은 빈칸이거나 공백 일 수 없습니다." }
    }
}

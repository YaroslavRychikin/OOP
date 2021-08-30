data class Post(val id: Int, val ownerId: Int, val fromId: Int, val createdBy: Int, val date: Int, val text: String,
                val replyOwnerId: Int, val replyPostId: Int, val friendsOnly: Boolean = false, val comments: Any,
                val copyright: Any, val likes: Int, val reposts: Any, val views: Any, val postType: String,
                val signerId: Int, val canPin: Boolean, val canDelete:Boolean, val canEdit:Boolean,
                val isPinned:Boolean, val markedAsAds:Boolean, val  iaFavorite:Boolean, val donut: Any,
                val postponed_id: Int)
object WallServices {
    private var posts = emptyArray<Post>()
}

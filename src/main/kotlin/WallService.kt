class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val newPost = if (posts.isNotEmpty()) post.copy(id = posts.last().id + 1) else post.copy(id = 1)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (postInArray in posts) {
            if (comment.postId == postInArray.id) {
                val newComment = if (comments.isNotEmpty()) comment.copy(id = comments.last().id + 1)
                    else comment.copy(id = 1)
                comments += newComment
                return
            }
        }
        throw PostNotFoundException("There is no post with id ${comment.postId}")
    }
}

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        if (posts.isNotEmpty()) for(postFor in  posts){
            if (postFor.id == post.id) return postFor
        }
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
}

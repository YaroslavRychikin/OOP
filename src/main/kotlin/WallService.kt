import kotlin.random.Random

class WallService {
    private var posts = emptyArray<Post>()
    private var memoryOfId = emptyArray<Int>()

    fun add(post: Post): Post {
        if (posts.isNotEmpty()) for(postFor in  posts){
            if (postFor.id == post.id) return postFor
        }
        for(postFor in  posts){
            if (postFor.id == post.id) return post
        }
        var random = Random.nextInt(1,100_000_000)
            posts.forEach r@{
                if (it.id == random) {
                    random = Random.nextInt(1,100_000_000)
                    return@r
                }
            }
        memoryOfId += random
        val newPost = post.copy(id = random)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for (postFor in posts){
            if (post.id == postFor.id){
                val newPost = postFor.copy(createdBy = 9, text = "OOO", replyOwnerId =  10,
                    replyPostId = 50, friendsOnly = true, comments = 100, likes = 200, reposts = 6, views = 2500,
                    signerId = 0, markedAsAds = true, iaFavorite = false, donut = false, postponed_id = 200)
                posts[posts.indexOf(postFor)] = newPost
                return true
            }
        }
    }

    fun getIdFromMemory(index: Int): Int = if (index >= memoryOfId.size || index < 0) 0 else memoryOfId[index]

}
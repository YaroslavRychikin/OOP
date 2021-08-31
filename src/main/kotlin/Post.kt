fun main(){
    val wall = WallService()
    println(wall.add(Post( ownerId = 78 ,
        fromId = 78,
        createdBy = 8,
        date = 16,
        text = "Привет",
        replyOwnerId =  10,
        replyPostId = 8,
        friendsOnly = false,
        comments = 99,
        copyright = "Yes",
        likes = 98,
        reposts = 3,
        views = 2000,
        postType = "post",
        signerId = 0,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        iaFavorite = true,
        donut = true,
        postponed_id = 99)))
    println(wall.add(Post(id = 1, ownerId = 8,
        fromId = 78,
        createdBy = 8,
        date = 3,
        text = "Привет",
        replyOwnerId =  10,
        replyPostId = 8,
        friendsOnly = false,
        comments = 99,
        copyright = "Yes",
        likes = 98,
        reposts = 3,
        views = 2000,
        postType = "post",
        signerId = 0,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        iaFavorite = true,
        donut = true,
        postponed_id = 99)))
    println(wall.add(Post( ownerId = 7 ,
        fromId = 78,
        createdBy = 8,
        date = 5,
        text = "Привет",
        replyOwnerId =  10,
        replyPostId = 8,
        friendsOnly = false,
        comments = 99,
        copyright = "Yes",
        likes = 98,
        reposts = 3,
        views = 2000,
        postType = "post",
        signerId = 0,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        iaFavorite = true,
        donut = true,
        postponed_id = 99)))
    println(wall.update(Post(id = 2, ownerId = 7 ,
        fromId = 78,
        createdBy = 8,
        date = 5,
        text = "Привет",
        replyOwnerId =  10,
        replyPostId = 8,
        friendsOnly = false,
        comments = 10,
        copyright = "Yes",
        likes = 9,
        reposts = 0,
        views = 2000,
        postType = "repost",
        postSource = "vk",
        attachment = emptyArray(),
        geo = "Russia",
        signerId = 0,
        copyHistory = arrayOf("ret", "pot", "log"),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        iaFavorite = true,
        donut = true,
        postponed_id = 99)))
}


data class Post(val id: Int = 0,
                val ownerId: Int,
                val fromId: Int,
                val createdBy: Int,
                val date: Int,
                val text: String,
                val replyOwnerId: Int,
                val replyPostId: Int,
                val  friendsOnly: Boolean = false,
                val comments: Any,
                val copyright: Any,
                val likes: Int,
                val reposts: Any,
                val views: Any,
                val postType: String,
                val signerId: Int,
                val canPin: Boolean,
                val canDelete: Boolean,
                val canEdit: Boolean,
                val isPinned: Boolean = false,
                val markedAsAds: Boolean,
                val  iaFavorite: Boolean = false ,
                val donut: Any,
                val postponed_id: Int)

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val result = service.add(Post(ownerId = 78 ,
            fromId = 78,
            createdBy = 8,
            date = 5,
            text = "Привет",
            replyOwnerId =  10,
            replyPostId = 8,
            friendsOnly = true,
            comments =899,
            copyright = "Yes",
            likes = 6,
            reposts = 0,
            views = 100,
            postType = "post",
            postSource = "vk",
            attachment = arrayOf(PhotoAttachment(photo = Photo(id = 78,
                albumId = 8,
                ownerId =99,
                userId = 8,
                text ="Relax.",
                date = 5,
                sizes = arrayOf("http//"),
                width = 200,
                height = 100))),
            geo = "Russia",
            signerId = 0,
            copyHistory = arrayOf("Park", "tree"),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = false,
            postponedId = 99))
        assert(result.id != 0)
    }

    @Test
    fun updateExisting() {
        val service = WallService()
        service.add(Post(ownerId = 78 ,
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
            postSource = "vk",
            attachment = emptyArray(),
            geo = "Russia",
            signerId = 0,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponedId = 99))
        val update = Post(id = 1,
            ownerId = 78 ,
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
            postSource = "vk",
            attachment = emptyArray(),
            geo = "Russia",
            signerId = 0,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponedId = 99)
        val result = service.update(update)
        assertTrue(result)
    }


    @Test
    fun updateFail() {
        val service = WallService()
        service.add(Post(ownerId = 78 ,
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
            postSource = "vk",
            attachment = emptyArray(),
            geo = "Russia",
            signerId = 0,
            copyHistory = arrayOf("port"),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponedId = 99))
        val update = Post(id = 4,
            ownerId = 78 ,
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
            postSource = "vk",
            attachment = emptyArray(),
            geo = "Russia",
            signerId = 0,
            copyHistory = arrayOf("port"),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponedId = 99)
        val result = service.update(update)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun createComment_shouldThrow() {
        val service = WallService()
        service.createComment(Comment(fromId = 55,
            date = 7,
            text = "Good",
            donut = false,
            attachments = emptyArray(),
            parentsStack = emptyArray(),
            thread = emptyArray(),
            postId = 100))
    }
    @Test
    fun createComment_correctWork(){
        val service = WallService()
        service.add(Post(ownerId = 8,
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
            postSource = "vk",
            attachment = emptyArray(),
            geo = "Russia",
            signerId = 0,
            copyHistory = emptyArray(),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponedId = 99))
        service.createComment(Comment(fromId = 55,
            date = 7,
            text = "Good",
            donut = false,
            attachments = emptyArray(),
            parentsStack = emptyArray(),
            thread = emptyArray(),
            postId = 1))

    }
}

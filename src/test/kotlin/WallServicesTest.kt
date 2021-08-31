import org.junit.Assert.*
import org.junit.Test

class WallServicesTest {

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
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = false,
            postponed_id = 99))
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
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponed_id = 99))
        val update = Post(service.getIdFromMemory(0),
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
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponed_id = 99)
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
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponed_id = 99))
        val update = Post(id = 77,
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
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            iaFavorite = true,
            donut = true,
            postponed_id = 99)
        val result = service.update(update)
        assertFalse(result)
    }
}

interface Attachment {
    val type: String
}
class VideoAttachment(override val type: String ="video",
                      val video: Video=Video()) : Attachment
class AudioAttachment(override val type: String ="audio",
                      val audio: Audio=Audio()) : Attachment
class PhotoAttachment(override val type: String ="photo",
                      val photo: Photo=Photo()) : Attachment
class DocAttachment(override val type: String ="doc",
                      val doc: Doc=Doc()) : Attachment
class LinAttachment(override val type: String ="lin",
                      val lin: Lin=Lin()) : Attachment

class Video() {
    constructor(id: Int,
                ownerId: Int,
                title:String,
                description: String?,
                duration:Int,
                image: Array<String>,
                firstFrame: Array<String>,
                date: Int,
                adding_date: Int,
                views: Int,
                comments: Int,
                player:String,
                platform: String,
                canAdd: Boolean,
                isPrivate:Boolean = true,
                accessKey: String,
                processing: Boolean = true,
                isFavorite: Boolean,
                canComment: Boolean,
                canEdit: Boolean,
                canLike: Boolean,
                canRepost: Boolean,
                canSubscribe: Boolean,
                canAddToFaves: Boolean,
                canAttachLink: Boolean,
                width: Int,
                height: Int,
                userId: Int,
                converting: Boolean,
                added: Boolean,
                isSubscribed: Boolean,
                repeat: Int = 1,
                type: String,
                balance: Int,
                liveStatus: String,
                live: Boolean = true,
                upcoming: Boolean = true,
                spectators: Int,
                likes: Int,
                reposts: Int) : this()
}
class Audio() {
    constructor(id: Int,
                ownerId: Int,
                artist: String,
                title: String,
                duration: Int,
                url: String,
                lyrics_id: Int = 0,
                albumId: Int = 0,
                genreId: Int,
                date: Int,
                noSearch: Boolean = true,
                isHq: Boolean = true) : this()
}
class Photo() {
    constructor(id: Int,
                albumId: Int,
                ownerId: Int,
                userId:Int,
                text: String,
                date: Int,
                sizes: Array<String>,
                width: Int,
                height: Int) : this()
}
class Doc() {
    constructor(id: Int,
                ownerId: Int,
                title: String,
                size: Int,
                ext: String,
                url: String,
                date: Int,
                type: Int,
                preview: Any) : this()
}
class Lin() {
    constructor(url: String,
                title: String,
                caption: String?,
                description: String,
                photo: Any?,
                product: Any?,
                button: Any?,
                previewPage: String,
                previewUrl: String) : this()
}
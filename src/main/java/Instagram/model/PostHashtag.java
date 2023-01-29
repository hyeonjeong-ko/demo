package Instagram.model;

import javax.persistence.*;

@Entity
@Table(name = "postHashtag")
public class PostHashtag {
    @Id
    @Column(name = "tagId", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "postId", nullable = false, referencedColumnName = "postId")
    private Post post;

    @Column(name = "tag", nullable = false, length = 100)
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
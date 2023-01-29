package Instagram.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PostId implements Serializable {
    private static final long serialVersionUID = 2971350905570481091L;
    @Column(name = "postId", columnDefinition = "INT UNSIGNED not null")
    private Long postId;

    @Column(name = "likeNum", columnDefinition = "INT UNSIGNED not null")
    private Long likeNum;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Long likeNum) {
        this.likeNum = likeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PostId entity = (PostId) o;
        return Objects.equals(this.postId, entity.postId) &&
                Objects.equals(this.likeNum, entity.likeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, likeNum);
    }

}
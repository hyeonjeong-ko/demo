package Instagram.model;

import javax.persistence.*;

@Entity
@Table(name = "postUserTag")
public class PostUserTag {
    @Id
    @Column(name = "postUserTagId", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "photoId", nullable = false)
    private PostMedia photo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PostMedia getPhoto() {
        return photo;
    }

    public void setPhoto(PostMedia photo) {
        this.photo = photo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
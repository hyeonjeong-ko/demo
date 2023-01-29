package Instagram.model;

import javax.persistence.*;

@Entity
@Table(name = "storyUserTag")
public class StoryUserTag {
    @Id
    @Column(name = "storyUserTagId", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "storyMediaId", nullable = false)
    private StroyMedia storyMedia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StroyMedia getStoryMedia() {
        return storyMedia;
    }

    public void setStoryMedia(StroyMedia storyMedia) {
        this.storyMedia = storyMedia;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
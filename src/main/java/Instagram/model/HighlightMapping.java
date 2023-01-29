package Instagram.model;

import javax.persistence.*;

@Entity
public class HighlightMapping {
    @Id
    @Column(name = "mappingtId", columnDefinition = "INT UNSIGNED not null")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "storyId", nullable = false)
    private Story story;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "highlightId", nullable = false)
    private StoryHighlight highlight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public StoryHighlight getHighlight() {
        return highlight;
    }

    public void setHighlight(StoryHighlight highlight) {
        this.highlight = highlight;
    }

}
package com.foundation.gui.umami.entities;

import java.util.Map;

public class Article {
    private String title;
    private String body;
    private String tags;
    private String state;

    /**
     * Sets article attributes from the map.
     *
     * @param inputFields - Map with minimum required data.
     */
    public void setData(final Map<String, String> inputFields) {
        this.title = inputFields.get("Title");
        this.body = inputFields.get("Body");
        this.tags = inputFields.get("Tags");
        this.state = inputFields.get("Moderation state");
    }

    /**
     * Allows to get title.
     *
     * @return - title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Allows to get body.
     *
     * @return - body.
     */
    public String getBody() {
        return body;
    }

    /**
     * Allows to get tags.
     *
     * @return - tags.
     */
    public String getTags() {
        return tags;
    }

    /**
     * Allows to get state.
     *
     * @return - state.
     */
    public String getState() {
        return state;
    }
}

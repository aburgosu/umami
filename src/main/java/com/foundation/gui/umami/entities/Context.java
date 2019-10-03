package com.foundation.gui.umami.entities;

public class Context {
    private Article article;
    private Recipe recipe;

    /**
     * Constructs all elements in the context.
     */
    public Context() {
        this.article = new Article();
        this.recipe = new Recipe();
    }

    /**
     * Allows to get context's article.
     *
     * @return - Product.
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Allows to get context's recipe.
     *
     * @return - Address.
     */
    public Recipe getRecipe() {
        return recipe;
    }
}

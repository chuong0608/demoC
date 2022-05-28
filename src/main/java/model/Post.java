package model;

public class Post {
    private int id;
    private String title;
    private String image;
    private int userId;
    private int categoryId;
    private String content;

    public Post() {
    }

    public Post(int id, String title, String image, int userId, int categoryId, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.userId = userId;
        this.categoryId = categoryId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

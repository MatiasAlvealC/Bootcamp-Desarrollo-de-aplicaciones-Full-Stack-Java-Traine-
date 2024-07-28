package cl.models;

public class Post {
	private Long id;
	private String title;
	private String body;
	private Long userId;

	public Post() {
		super();
	}

	public Post(Long id, String title, String body, Long userId) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.userId = userId;
	}
	//	getters y setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}

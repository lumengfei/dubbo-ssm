package com.lumengjun.woker.pojo;

import java.io.Serializable;

public class Article implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6262513357552866671L;
	
	 private int   id         ;
	 private String   title         ;
	 private String   content         ;
	 private String   picture         ;
	 private int   channel_id         ;
	 private int   category_id         ;
	 private int   user_id         ;
	 private int   hits         ;
	 private int   hot         ;
	 private int   status         ;
	 private int   deleted         ;
	 private String   created         ;
	 private String   updated         ;
	 private int   commentCnt         ;
	 private int   articleType         ;
	 private int   complainCnt         ;
	 
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public int getArticleType() {
		return articleType;
	}
	public void setArticleType(int articleType) {
		this.articleType = articleType;
	}
	public int getComplainCnt() {
		return complainCnt;
	}
	public void setComplainCnt(int complainCnt) {
		this.complainCnt = complainCnt;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content="
				+ content + ", picture=" + picture + ", channel_id="
				+ channel_id + ", category_id=" + category_id + ", user_id="
				+ user_id + ", hits=" + hits + ", hot=" + hot + ", status="
				+ status + ", deleted=" + deleted + ", created=" + created
				+ ", updated=" + updated + ", commentCnt=" + commentCnt
				+ ", articleType=" + articleType + ", complainCnt="
				+ complainCnt + "]";
	}
	public Article(int id, String title, String content, String picture,
			int channel_id, int category_id, int user_id, int hits, int hot,
			int status, int deleted, String created, String updated,
			int commentCnt, int articleType, int complainCnt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
		this.articleType = articleType;
		this.complainCnt = complainCnt;
	}
	public Article() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + user_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id != other.id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	 
	 

}

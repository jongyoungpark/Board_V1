package kr.nerv.antop.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board {
	private List<Attach> attachs = new ArrayList<Attach>();

	public List<Attach> getAttachs() {
		return attachs;
	}

	public void setAttachs(List<Attach> attachs) {
		this.attachs = attachs;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.board_id
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Integer boardId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.thread
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Double thread;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.dept
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Integer dept;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.subject
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private String subject;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.security
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Boolean security;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.author
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private String author;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.pwd
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private String pwd;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.write_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Date created;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.modify_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Date modified;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.hit
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private Integer hit;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column ab_board.content
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.board_id
	 * 
	 * @return the value of ab_board.board_id
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Integer getBoardId() {
		return boardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.board_id
	 * 
	 * @param boardId
	 *            the value for ab_board.board_id
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.thread
	 * 
	 * @return the value of ab_board.thread
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Double getThread() {
		return thread;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.thread
	 * 
	 * @param thread
	 *            the value for ab_board.thread
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setThread(Double thread) {
		this.thread = thread;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.dept
	 * 
	 * @return the value of ab_board.dept
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Integer getDept() {
		return dept;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.dept
	 * 
	 * @param dept
	 *            the value for ab_board.dept
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setDept(Integer dept) {
		this.dept = dept;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.subject
	 * 
	 * @return the value of ab_board.subject
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.subject
	 * 
	 * @param subject
	 *            the value for ab_board.subject
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.security
	 * 
	 * @return the value of ab_board.security
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Boolean getSecurity() {
		return security;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.security
	 * 
	 * @param security
	 *            the value for ab_board.security
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setSecurity(Boolean security) {
		this.security = security;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.author
	 * 
	 * @return the value of ab_board.author
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.author
	 * 
	 * @param author
	 *            the value for ab_board.author
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.pwd
	 * 
	 * @return the value of ab_board.pwd
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.pwd
	 * 
	 * @param pwd
	 *            the value for ab_board.pwd
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.write_date
	 * 
	 * @return the value of ab_board.write_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.write_date
	 * 
	 * @param created
	 *            the value for ab_board.write_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.modify_date
	 * 
	 * @return the value of ab_board.modify_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.modify_date
	 * 
	 * @param modified
	 *            the value for ab_board.modify_date
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.hit
	 * 
	 * @return the value of ab_board.hit
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public Integer getHit() {
		return hit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.hit
	 * 
	 * @param hit
	 *            the value for ab_board.hit
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setHit(Integer hit) {
		this.hit = hit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column ab_board.content
	 * 
	 * @return the value of ab_board.content
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column ab_board.content
	 * 
	 * @param content
	 *            the value for ab_board.content
	 * 
	 * @mbggenerated Mon Jul 11 09:37:06 KST 2011
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
package org.marker.mushroom.beans;

import org.marker.mushroom.dao.annotation.Entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 文章对象
 * @author marker
 * */
@Entity("project")
public class Project implements Serializable {
	private static final long serialVersionUID = -2456959238880328330L;
	
	/** 文章ID */
	private Integer id;
	/** 所属栏目ID */
	private Integer cid;
	/** 所属分类ID */
	private Integer did;
	/** 图标 */
	private String icon;
	/** 标题 */
	private String title;
	/** 关键字 */
	private String keywords;
	/** 描述 */
	private String description;
	/** 作者 */
	private String author;
	/** 浏览量 */
	private int views;
	/** 内容 */
	private String content;
	/** 创建时间 */
	private Date time;
	/** 更新时间 */
	private Date updateTime;
	
	/* 发布状态：0草稿 1发布*/
	private int status;
	
	/** 引用地址 */
	private String source;
	
	/** 内容类型 */
	private int type;
	
	/** 原始内容 */
	private String orginal;


	private String location;
	private String customer;
	private String scale;
	private String startTime;

	/** 是否置顶 */
	private int stick;

	private String extJson;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getOrginal() {
		return orginal;
	}

	public void setOrginal(String orginal) {
		this.orginal = orginal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson;
    }

	public int getStick() {
		return stick;
	}

	public void setStick(int stick) {
		this.stick = stick;
	}
}
